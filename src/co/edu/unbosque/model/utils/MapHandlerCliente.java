package co.edu.unbosque.model.utils;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.dto.ClienteDTO;
import co.edu.unbosque.model.dto.ParejaDTO;

public class MapHandlerCliente {
	
	public static ClienteDTO convertirClienteAClienteDTO(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setId(cliente.getId());
		clienteDTO.setNombre(cliente.getNombre());
		clienteDTO.setNumeroTarjeta(cliente.getNumeroTarjeta());
		clienteDTO.setContrasena(cliente.getContrasena());
		clienteDTO.setCupo(cliente.getCupo());
		
		return clienteDTO;		
	}
	
	public static Cliente convertirClienteDTOACliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setId(clienteDTO.getId());
		cliente.setNombre(clienteDTO.getNombre());
		cliente.setNumeroTarjeta(clienteDTO.getNumeroTarjeta());
		cliente.setContrasena(clienteDTO.getContrasena());
		cliente.setCupo(clienteDTO.getCupo());
		
		return cliente;		
	}	
}
