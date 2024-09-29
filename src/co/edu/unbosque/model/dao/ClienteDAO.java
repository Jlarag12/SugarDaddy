package co.edu.unbosque.model.dao;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.persistence.ArchivoClientes;

public class ClienteDAO implements InterfaceDAO<Cliente>{

	ArrayList<Cliente> clientes;
	ArchivoClientes archCliente;
	
	public ClienteDAO() {
		archCliente = new ArchivoClientes();
		if(clientes == null) {
			clientes = new ArrayList<>();
		}
	}

	@Override
	public ArrayList<Cliente> consultar() {
		return archCliente.leerArchivo();
	}

	@Override
	public boolean agregar(Cliente x) {
		clientes.add(x);
		archCliente.escribirArchivo(clientes);
		return true;
	}

	@Override
	public boolean eliminar(Cliente x) {
		Cliente y = encontrar(x);
		if(y != null) {
			try {
				clientes.remove(y);
				archCliente.getUbicacionArchivo().delete();
				archCliente.getUbicacionArchivo().createNewFile();
				archCliente.escribirArchivo(clientes);
				return true;
			}catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return false; 
	}

	@Override
	public boolean actualizar(Cliente x, Cliente y) {
		
		Cliente e = encontrar(x);
		if(e != null) {
			clientes.remove(e);
			e.setNombre(y.getNombre());
			e.setCupo(y.getCupo());
			e.setContrasena(y.getContrasena());
			clientes.add(e);
			return true;
		}
		return false;
	}

	@Override
	public Cliente encontrar(Cliente x) {
		Cliente encontrado = null;
		if(!clientes.isEmpty()) {
			for(Cliente y : clientes) {
				if( y.getId() == x.getId()) {
					encontrado = y;
				}
			}
		}
		
		return encontrado;
	}
}
