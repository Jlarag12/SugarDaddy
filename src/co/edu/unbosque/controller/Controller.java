package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoLog;
import co.edu.unbosque.model.persistence.ArchivoParejas;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	ArchivoLog archivo = new ArchivoLog();
	ArchivoClientes archivoClientes = new ArchivoClientes();
	ArchivoParejas arcparejas = new ArchivoParejas();
	VentanaPrincipal ventana;
	
	public Controller() {
		ventana = new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana.getPanelR().getBotonRegistroCliente().addActionListener(this);
	}
	
	public void escribirArchivoPlano() {
		archivo.escribirArchivo("Ingresar Texto");
	}
	
	public String leerArchivo() {
		return archivo.leerArchivo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		
		String mensaje = ventana.getPanelR().getContraseña();
		
		System.out.println("mensaje: " + mensaje);
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