package co.edu.unbosque.model.facade;

import java.util.ArrayList;

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
			admin = new Admin();
			admin.setId(12345);
			admin.setContrasena("pass1234");
			admin.setNombre("Admin");
		}
	}
	
	public ArrayList<Cliente> listarClientes(){
		return clienteDAO.consultar();
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

	public boolean asignarParejaACliente(long id, Pareja pareja) {
		return parejaDAO.asignarParejaACliente(id, pareja);
	}
	
	public boolean actualizar(Pareja parejaAntigua, Pareja parejaNueva, Cliente cliente) {
		return parejaDAO.actualizar(parejaAntigua, parejaNueva, cliente);
	}
	public boolean verificarCliente(int id, String contraseña){
        return clienteDAO.verificarCliente(id, contraseña);
    }
	
	public ArrayList<Pareja> listarParejas(Long idCliente) {
		return parejaDAO.consultar(idCliente);
	}
	
	public Pareja encontrarPareja(Pareja pareja) {
		return parejaDAO.encontrar(pareja);
	}
	
	public boolean consultarParejaRegistrada(long idCliente, long idPareja) {
		return parejaDAO.consultarParejaRegistrada(idCliente, idPareja);
	}
	
	public boolean eliminarArchivo() {
		return parejaDAO.eliminarArchivo();
	}
}
