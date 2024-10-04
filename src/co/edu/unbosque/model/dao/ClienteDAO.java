	package co.edu.unbosque.model.dao;
	
	import java.util.ArrayList;
	
	import co.edu.unbosque.model.Cliente;
	import co.edu.unbosque.model.dto.ClienteDTO;
	import co.edu.unbosque.model.persistence.ArchivoClientes;
	import co.edu.unbosque.model.utils.MapHandlerCliente;
	
	
	public class ClienteDAO implements InterfaceClienteDAO<Cliente> {
	
	    ArrayList<ClienteDTO> clientes;
	    ArchivoClientes archCliente;
	    
	    public ClienteDAO() {
	        archCliente = new ArchivoClientes();
	        ArrayList<ClienteDTO> listaClientes = archCliente.leerArchivo();
	        
	        if (listaClientes == null) {
	            clientes = new ArrayList<>();
	        } else {
	            clientes = new ArrayList<>();
	            for (ClienteDTO cliente : listaClientes) {
	                clientes.add(cliente);
	            }
	        }
	        
	    }
	    
	    
	
		@Override
		public ArrayList<Cliente> consultar() {
		    ArrayList<ClienteDTO> listaClientesDTO = archCliente.leerArchivo();
		    ArrayList<Cliente> listaClientes = new ArrayList<>();
		    
		    for (ClienteDTO cliente : listaClientesDTO) {
		        listaClientes.add(MapHandlerCliente.convertirClienteDTOACliente(cliente));
		    }
		    return listaClientes;
		}
	
		@Override
		public boolean agregar(Cliente cliente) {
		    
		    Cliente encontrado = encontrar(cliente);
		    
		    if(encontrado == null) {
		    	clientes.add(MapHandlerCliente.convertirClienteAClienteDTO(cliente));
			    archCliente.escribirArchivo(clientes);
			    return true;
		    }
		    
		    return false;
		}
		
		@Override
		public boolean eliminar(Cliente cliente) {
		 
			Cliente encontrado = encontrar(cliente); // Sigue usando el método encontrar
		    if (encontrado != null) {
		        clientes.remove(MapHandlerCliente.convertirClienteAClienteDTO(encontrado));
		        archCliente.escribirArchivo(clientes);
		        return true;
		    }
		    return false;
		}
		
		@Override
		public boolean actualizar(Cliente antiguoCliente, Cliente nuevoCliente) {
	
			Cliente encontrado = encontrar(antiguoCliente);
		    if (encontrado != null) {
		        clientes.remove(MapHandlerCliente.convertirClienteAClienteDTO(antiguoCliente));
		        ClienteDTO cliente = MapHandlerCliente.convertirClienteAClienteDTO(nuevoCliente);
		        encontrado.setNombre(cliente.getNombre());
		        encontrado.setCupo(cliente.getCupo());
		        encontrado.setContrasena(cliente.getContrasena());
		        clientes.add(MapHandlerCliente.convertirClienteAClienteDTO(encontrado));
		        archCliente.escribirArchivo(clientes);
		        return true;
		    }
		    return false;
		}
		
		@Override
		public Cliente encontrar(Cliente clienteBuscado) {
	        for (ClienteDTO cliente : clientes) {
	            if (cliente.getId() == clienteBuscado.getId()) {
	                return clienteBuscado;  
	            }
	        }
	        return null;
	    }
		/*public boolean verificarCliente(int id, String contraseña) {
	        for (ClienteDTO cliente : clientes) {
	            if (cliente.getId() == id && cliente.getContrasena().equals(contraseña)) {
	                return true;
	            }
	        }
	        return false;
	    }*/
	
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
	
