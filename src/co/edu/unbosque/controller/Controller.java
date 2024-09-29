package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoLog;
import co.edu.unbosque.model.persistence.ArchivoParejas;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller {

	ArchivoLog archivo = new ArchivoLog();
	ArchivoClientes archivoClientes = new ArchivoClientes();
	ArchivoParejas arcparejas = new ArchivoParejas();
	VentanaPrincipal ventana;
	
	public void llamarVentanaPrincipal() {
		ventana = new VentanaPrincipal();
	}
	
	public void escribirArchivoPlano() {
		archivo.escribirArchivo("Ingresar Texto");
	}
	
	public String leerArchivo() {
		return archivo.leerArchivo();
	}
	
	/*public void escribirArchivoBinario() {
		
		ArrayList<ClienteDTO> clientes = new ArrayList<>();
		ClienteDTO cliente = new ClienteDTO();
		cliente.setId(1212312312);
		cliente.setNombre("Eduardo");
		
		clientes.add(cliente);
		
		archivoClientes.escribirArchivo(clientes);
	}
	
	public ArrayList<ClienteDTO> devolverListadoClientes(){
		return archivoClientes.leerArchivo();
	}
	
	public void escribirArchivoProp() {
		arcparejas.escribirArchivo("vv", "prueba");
	}
	
	public String leerArchivoProp() throws IOException {
		arcparejas.leerArchivo();
		return arcparejas.getDatos().getProperty("vv");
<<<<<<< HEAD
	}*/
}