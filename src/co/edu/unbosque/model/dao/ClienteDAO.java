package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.persistence.ArchivoClientes;

public class ClienteDAO implements InterfaceDAO<Cliente>{

	ArchivoClientes archCliente;
	
	public ClienteDAO() {
		archCliente = new ArchivoClientes();
	}


	@Override
	public String getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Cliente x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Cliente x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cliente x, Cliente y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente find(Cliente x) {
		// TODO Auto-generated method stub
		return null;
	}
}
