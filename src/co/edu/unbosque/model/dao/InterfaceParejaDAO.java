package co.edu.unbosque.model.dao;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.Pareja;

public interface InterfaceParejaDAO<T> extends InterfaceDAO<T>{

	ArrayList<T> consultar(Long id) throws IOException;
	boolean actualizar(Pareja antiguaPareja, Pareja nuevaPareja, Cliente cliente);
	boolean agregar(Long id, Pareja pareja);
	boolean consultarParejaRegistrada(long idCliente, long idPareja);
	
}
