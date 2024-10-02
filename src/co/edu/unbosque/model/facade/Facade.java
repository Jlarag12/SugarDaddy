package co.edu.unbosque.model.facade;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.dao.ClienteDAO;
import co.edu.unbosque.model.dao.ParejaDAO;

public class Facade {

	ClienteDAO clienteDAO;
	ParejaDAO parejaDAO;
	Admin admin;
	
	public Facade() {
		clienteDAO = new ClienteDAO();
		parejaDAO = new ParejaDAO();
		if(admin == null) {
			admin.setId(12345);
			admin.setContrasena("pass1234");
			admin.setNombre("Admin");
		}
	}
		
	public Cliente encontrarCliente(Cliente cliente) {
		return clienteDAO.encontrar(cliente);
	}
	
	public boolean loginAdmin(Admin adminLogin) {
		if(admin.getId() == adminLogin.getId() && admin.getContrasena().equals(adminLogin.getContrasena()))
			return true;
		return false;
	}
	public boolean crearCliente(Cliente cliente) {
		return clienteDAO.agregar(cliente);
	}
	
	public boolean actualizarCliente(Cliente clienteAntiguo, Cliente clienteNuevo) {
		return clienteDAO.actualizar(clienteAntiguo, clienteNuevo);
	}
	
	public boolean eliminar(Cliente cliente) {
		return clienteDAO.eliminar(cliente);
	}

	public boolean asignarParejaACliente(Cliente cliente, Pareja pareja, long cupoAsignado) {
		return parejaDAO.asignarParejaACliente(cliente, pareja, cupoAsignado);
	}
	
	public boolean actualizar(Pareja parejaAntigua, Pareja parejaNueva, Cliente cliente) {
		return parejaDAO.actualizar(parejaAntigua, parejaNueva, cliente);
	}
}
