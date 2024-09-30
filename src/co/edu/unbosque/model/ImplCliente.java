package co.edu.unbosque.model;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.dao.ClienteDAO;
import co.edu.unbosque.model.dto.ClienteDTO;
import co.edu.unbosque.model.utils.MapHandlerCliente;
import co.edu.unbosque.view.VentanaPrincipal;

public class ImplCliente {

	ClienteDAO clienteDAO;	
	
	public ImplCliente() {
		clienteDAO = new ClienteDAO();		
	}
	
	public boolean crearCliente(VentanaPrincipal ventana) {
		
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setId(Integer.parseInt(ventana.getPanelR().getId()));
		clienteDTO.setNombre(ventana.getPanelR().getNombre());
		clienteDTO.setContrasena(ventana.getPanelR().getContraseña());
		
		boolean bandera = false;
		
		while(!bandera) {
			try {
				clienteDTO.setCupo(Long.parseLong(ventana.getPanelR().getCupo()));
				
				if(clienteDTO.getCupo() >= 10000000 && clienteDTO.getCupo() <= 20000000) {
					bandera = true;
				}else {
					JOptionPane.showMessageDialog(null, "El cupo ingresado debe ser entre $10.000.000 y $20.000.000","Error de Validación",  JOptionPane.ERROR_MESSAGE);
				}
				
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Los valores ingresados son incorrectos", "Error de Validación",  JOptionPane.ERROR_MESSAGE);
			}
		}
		
		clienteDTO.setCupo();
		
		
		Cliente cliente = MapHandlerCliente.convertirClienteDTOACliente(clienteDTO);
		return clienteDAO.agregar(cliente);
	
	}
}
