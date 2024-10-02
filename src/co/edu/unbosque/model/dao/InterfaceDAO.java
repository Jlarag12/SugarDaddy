package co.edu.unbosque.model.dao;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.dto.ClienteDTO;

public interface InterfaceDAO <T>{

	boolean eliminar(T x) throws IOException;
	T encontrar(T x);
	
}
