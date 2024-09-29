package co.edu.unbosque.model.dao;

import java.util.ArrayList;

import co.edu.unbosque.model.dto.ClienteDTO;

public interface InterfaceDAO <T>{

	ArrayList<T> consultar();
	boolean agregar(T x);
	boolean eliminar(T x);
	boolean actualizar(T x, T y);
	T encontrar(T x);
	
}
