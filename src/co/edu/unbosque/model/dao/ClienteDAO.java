package co.edu.unbosque.model.dao;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.dto.ClienteDTO;
import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoLog;
import co.edu.unbosque.model.utils.MapHandlerCliente;
	
	
public class ClienteDAO implements InterfaceClienteDAO<Cliente> {
	
    ArrayList<ClienteDTO> clientes;
    ArchivoClientes archCliente;
    ArchivoLog log;
    
    public ClienteDAO() {
        archCliente = new ArchivoClientes();
        log = new ArchivoLog();
        ArrayList<ClienteDTO> listaClientes = archCliente.leerArchivo();
        
        clientes = new ArrayList<>();
        for (ClienteDTO cliente : listaClientes) {
            clientes.add(cliente);
        }	        
    }
    	
	@Override
	public ArrayList<Cliente> consultar() {
	    ArrayList<ClienteDTO> listaClientesDTO = archCliente.leerArchivo();
	    ArrayList<Cliente> listaClientes = new ArrayList<>();
	    
	    for (ClienteDTO cliente : listaClientesDTO) {
	        listaClientes.add(MapHandlerCliente.convertirClienteDTOACliente(cliente));
	    }
	    
	    log.escribirArchivo("Se consultan todos los clientes");
	    
	    return listaClientes;
	}

	@Override
	public boolean agregar(Cliente cliente) {
	    
	    Cliente encontrado = encontrar(cliente);
	    
	    if(encontrado == null) {
	    	if(cliente.getCupo()<10000000 || cliente.getCupo()>20000000) {
	    		log.escribirArchivo("El cupo de la tarjeta no está en el rando definido: " + cliente.getCupo());
	    		return false;
	    	}
	    	clientes.add(MapHandlerCliente.convertirClienteAClienteDTO(cliente));
		    archCliente.escribirArchivo(clientes);
		    
		    log.escribirArchivo("Se agrega el cliente con los siguientes datos: " + "ID: "+ cliente.getId() +
					", Nombre: " + cliente.getNombre() + ", # Tarjeta: " + cliente.getNumeroTarjeta() + 
					", Contraseña: " + cliente.getContrasena() + ", Cupo: " + cliente.getCupo());
			
		    return true;
	    }
	    
	    log.escribirArchivo("No se pudo agregar el cliente con los siguientes datos: " + "ID: "+ cliente.getId() +
				", Nombre: " + cliente.getNombre() + ", # Tarjeta: " + cliente.getNumeroTarjeta() + 
				", Contraseña: " + cliente.getContrasena() + ", Cupo: " + cliente.getCupo());
			    
	    return false;
	}
	
	@Override
	public boolean eliminar(Cliente cliente) {
	 
		Cliente encontrado = encontrar(cliente);
	    if (encontrado != null) {
	        
	    	try {
	    		System.out.println("Listado Antes" + clientes);
	    		for(int i = 0; i < clientes.size(); i++) {
	    			if(clientes.get(i).getId() == cliente.getId()) {
	    				clientes.remove(i);
	    			}
	    		}
	    		System.out.println("Listado Posterior" + clientes.contains(encontrado));
		        archCliente.getUbicacionArchivo().delete();
		        archCliente.getUbicacionArchivo().createNewFile();

		        archCliente.escribirArchivo(clientes);
		        
		        log.escribirArchivo("Se elimina el cliente con id: " + cliente.getId());
		        
		        return true;

	    	}catch(IOException e) {
	    		e.printStackTrace();
				return false;
	    	}
	    }
	    
	    log.escribirArchivo("No se pudo eliminar el cliente con id: " + cliente.getId());	    
	    return false;
	}
	
	@Override
	public boolean actualizar(Cliente antiguoCliente, Cliente nuevoCliente) {

		Cliente encontrado = encontrar(antiguoCliente);
	    if (encontrado != null) {
	    	for(int i = 0; i < clientes.size(); i++) {
    			if(clientes.get(i).getId() == antiguoCliente.getId()) {
    				clientes.remove(i);
    			}
    		}
	        
	        ClienteDTO cliente = MapHandlerCliente.convertirClienteAClienteDTO(nuevoCliente);
	        encontrado.setNombre(cliente.getNombre());
	        encontrado.setCupo(cliente.getCupo());
	        encontrado.setContrasena(cliente.getContrasena());
	        clientes.add(MapHandlerCliente.convertirClienteAClienteDTO(encontrado));
	        archCliente.escribirArchivo(clientes);
	        
	        log.escribirArchivo("Se actualiza el cliente con id: " + cliente.getId());
	        
	        return true;
	    }
	    
	    log.escribirArchivo("Se pudo actualizar el cliente con id: " + antiguoCliente.getId());
	    
	    return false;
	}
	
	@Override
	public Cliente encontrar(Cliente clienteBuscado) {
		
		ArrayList<ClienteDTO> clientes = archCliente.leerArchivo();
		
        for (ClienteDTO cliente : clientes) {
            if (cliente.getId() == clienteBuscado.getId()) {
            	log.escribirArchivo("Se consulta el cliente con id: " + clienteBuscado.getId());
                return MapHandlerCliente.convertirClienteDTOACliente(cliente); 
            }
        }
        log.escribirArchivo("No se encontró el cliente con id: " + clienteBuscado.getId());
        return null;
    }
	
	@Override
	public boolean verificarCliente(long id, String contrasena) {
		
		log.escribirArchivo("Se inicia el proceso de verificación del cliente.");
		
		Cliente cliente = new Cliente();
		cliente.setId(id);
		cliente.setContrasena(contrasena);
		
		Cliente clienteEncontrado = encontrar(cliente);
		
		if(Objects.isNull(clienteEncontrado)) {
			log.escribirArchivo("El cliente no existe");
			return false;				
		}
		if(clienteEncontrado.getId() == cliente.getId() && 
			clienteEncontrado.getContrasena().equals(cliente.getContrasena())) {
			log.escribirArchivo("El usuario ingresa exitosamente a la aplicación.");
			return true;
		}
		
		log.escribirArchivo("Las credenciales del cliente son incorrectas.");
		return false;
					
	}
	
	public ArrayList<ClienteDTO> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<ClienteDTO> clientes) {
		this.clientes = clientes;
	}

	public ArchivoClientes getArchCliente() {
		return archCliente;
	}

	public void setArchCliente(ArchivoClientes archCliente) {
		this.archCliente = archCliente;
	}
		
}
	
