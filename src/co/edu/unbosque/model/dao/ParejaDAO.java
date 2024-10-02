package co.edu.unbosque.model.dao;

import java.io.IOException;

import java.util.ArrayList;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.dto.ClienteDTO;
import co.edu.unbosque.model.dto.ParejaDTO;
import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoParejas;
import co.edu.unbosque.model.utils.MapHandlerPareja;

public class ParejaDAO implements InterfaceParejaDAO<Pareja>{

	private ArchivoParejas archParejas;
	private ArchivoClientes archClientes;
	private ArrayList<ParejaDTO> parejas;
	private ClienteDAO clienteDAO;
	
	public ParejaDAO() {
		archParejas = new ArchivoParejas();
		ArrayList<ParejaDTO> listaParejas = archParejas.leerTodasLasParejas();
        
        if (listaParejas == null) {
        	parejas = new ArrayList<>();
        } else {
        	parejas = new ArrayList<>();
            for (ParejaDTO pareja : listaParejas) {
            	parejas.add(pareja);
            }
        }
    }
	
	@Override
	public ArrayList<Pareja> consultar(Long idCliente) throws IOException {
		ArrayList<ParejaDTO> parejasDTO = archParejas.leerParejasPorCliente(idCliente);
		ArrayList<Pareja> parejas = new ArrayList<>();
		for(ParejaDTO pareja: parejasDTO) {
			parejas.add(MapHandlerPareja.convertirParejaDTOAPareja(pareja));
		}
		return parejas;
	}

	@Override
	public boolean agregar(Long clienteId, Pareja pareja) {
		Pareja encontrado = encontrar(pareja);
		if(encontrado == null) {
			parejas.add(MapHandlerPareja.convertirParejaParejaDTO(pareja));
			archParejas.escribirPareja(clienteId, MapHandlerPareja.convertirParejaParejaDTO(pareja));
			return true;
		}
		return false;
	}

	@Override
	public boolean eliminar(Pareja pareja) {
	    Pareja encontrado = encontrar(pareja);
	    if (encontrado != null) {
	        parejas.remove(MapHandlerPareja.convertirParejaParejaDTO(pareja));
            ArrayList<ParejaDTO> parejasDTO = archParejas.leerTodasLasParejas();
            
            for (ParejaDTO p : parejasDTO) {
                if (p.getId() != pareja.getId()) {
                	archParejas.escribirPareja(pareja.getId(), p);
                }
            }
            return true;
	    }    
	    return false;
	}

	@Override
	public boolean actualizar(Pareja parejaAntigua, Pareja parejaNueva, Cliente cliente) {
	    Pareja parejaEncontrada = encontrar(parejaAntigua);
	    if (parejaEncontrada != null) {
	        parejas.remove(MapHandlerPareja.convertirParejaParejaDTO(parejaEncontrada));
	        parejas.add(MapHandlerPareja.convertirParejaParejaDTO(parejaNueva));
	       
            ArrayList<ParejaDTO> parejasDTO = archParejas.leerTodasLasParejas();
            
            for (ParejaDTO p: parejasDTO) {
                if (p.getId() != parejaAntigua.getId()) {
                	archParejas.escribirPareja(p.getId(), p);
                }
            }
    	    
            archParejas.escribirPareja(cliente.getId(), MapHandlerPareja.convertirParejaParejaDTO(parejaNueva));
            cliente.setCupo(cliente.getCupo() - parejaNueva.getAsignacion());
            archClientes.escribirArchivo(clienteDAO.getClientes());
            
            return true;
	    }
	    return false;
	}

	@Override
	public Pareja encontrar(Pareja parejaBuscada) {
		for (ParejaDTO parejaDTO : parejas) {
            if (parejaDTO.getId() == parejaBuscada.getId()) {
                return parejaBuscada;  
            }
        }
        return null;
	}
	
	
	public boolean asignarParejaACliente(Cliente cliente, Pareja pareja, long cupoAsignado) {
	    Cliente encontrado = clienteDAO.encontrar(cliente);
	    if (encontrado != null && encontrado.getCupo() >= cupoAsignado) {
	    	pareja.setAsignacion(cupoAsignado);
	        archParejas.escribirPareja(cliente.getId(), MapHandlerPareja.convertirParejaParejaDTO(pareja));
	        cliente.setCupo(cliente.getCupo() - (long) cupoAsignado);
	        archClientes.escribirArchivo(clienteDAO.getClientes());

	        return true;
	    }
	    return false;
	}

}
