package co.edu.unbosque.model.dao;

import java.io.IOException;

import java.util.ArrayList;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.dto.ClienteDTO;
import co.edu.unbosque.model.dto.ParejaDTO;
import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoLog;
import co.edu.unbosque.model.persistence.ArchivoParejas;
import co.edu.unbosque.model.utils.MapHandlerPareja;

public class ParejaDAO implements InterfaceParejaDAO<Pareja>{

	private ArchivoParejas archParejas;
	private ArrayList<ParejaDTO> parejas;
	private ArchivoLog log;
	
	public ParejaDAO() {
		log = new ArchivoLog();
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
	public ArrayList<Pareja> consultar(Long idCliente) {
		ArrayList<ParejaDTO> parejasDTO = archParejas.leerParejasPorCliente(idCliente);
		ArrayList<Pareja> parejas = new ArrayList<>();
		for(ParejaDTO pareja: parejasDTO) {
			parejas.add(MapHandlerPareja.convertirParejaDTOAPareja(pareja));
		}
		
		log.escribirArchivo("Se consulta las parejas que tiene el cliente con id: " + idCliente);
		
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
		
	        for(int i = 0; i<parejas.size(); i++) {
	        	if(parejas.get(i).getId() ==  parejaAntigua.getId()) {
	        		parejas.remove(MapHandlerPareja.convertirParejaParejaDTO(parejaAntigua));
	        	}
	        }
	        
	        parejas.add(MapHandlerPareja.convertirParejaParejaDTO(parejaNueva));
	       
            ArrayList<ParejaDTO> parejasDTO = archParejas.leerTodasLasParejas();
            
            for (ParejaDTO p: parejasDTO) {
                if (p.getId() != parejaAntigua.getId()) {
                	archParejas.escribirPareja(p.getId(), p);
                }
            }
    	    
            archParejas.escribirPareja(cliente.getId(), MapHandlerPareja.convertirParejaParejaDTO(parejaNueva));
            return true;

	}

	@Override
	public Pareja encontrar(Pareja parejaBuscada) {
		for (ParejaDTO parejaDTO : parejas) {
            if (parejaDTO.getId() == parejaBuscada.getId()) {
                return MapHandlerPareja.convertirParejaDTOAPareja(parejaDTO);  
            }
        }
        return null;
	}
	
	@Override
	public boolean consultarParejaRegistrada(long idCliente, long idPareja) {
		ArrayList<Pareja> listadoParejas = consultar(idCliente);
		for(Pareja pareja: listadoParejas) {
			if(pareja.getId() == idPareja) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean asignarParejaACliente(long idCliente, Pareja pareja) {
	        archParejas.escribirPareja(idCliente, MapHandlerPareja.convertirParejaParejaDTO(pareja));
	        return true;
	}
	
	public boolean eliminarArchivo() {
		return archParejas.reiniciarArchivoParejas();
	}

}
