package co.edu.unbosque.model.dao;

import java.io.IOException;
import java.util.ArrayList;

public interface InterfaceClienteDAO<T> extends InterfaceDAO<T>{
	
	ArrayList<T> consultar();
	boolean actualizar(T x, T y) throws IOException;
	boolean agregar(T x);
}
