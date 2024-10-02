package co.edu.unbosque.model.impl;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.dao.ClienteDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class ImplCliente {

	ClienteDAO clienteDAO;	
	
	public ImplCliente() {
		clienteDAO = new ClienteDAO();		
	}
	
	public boolean crearCliente(VentanaPrincipal ventana) {
		
		Cliente cliente = new Cliente();
		cliente.setId(Integer.parseInt(ventana.getPanelR().getId()));
		cliente.setNombre(ventana.getPanelR().getNombre());
		cliente.setContrasena(ventana.getPanelR().getContraseña());
		
		boolean bandera = false;
		
		while(!bandera) {
			try {
				cliente.setCupo(Long.parseLong(ventana.getPanelR().getCupo()));
				
				if(cliente.getCupo() >= 10000000 && cliente.getCupo() <= 20000000) {
					bandera = true;
				}else {
					JOptionPane.showMessageDialog(null, "El cupo ingresado debe ser entre $10.000.000 y $20.000.000","Error de Validación",  JOptionPane.ERROR_MESSAGE);
				}
				
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Los valores ingresados son incorrectos", "Error de Validación",  JOptionPane.ERROR_MESSAGE);
			}
		}
		
		return clienteDAO.agregar(cliente);
	
	}
}
