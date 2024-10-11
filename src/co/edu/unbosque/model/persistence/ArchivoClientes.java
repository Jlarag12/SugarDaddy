package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.dto.ClienteDTO;


public class ArchivoClientes {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private File ubicacionArchivo = new File("archivos/clientes.dat");
	
	public ArchivoClientes() {
		if(!ubicacionArchivo.exists()) {
			try {
				ubicacionArchivo.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public void escribirArchivo(ArrayList<ClienteDTO> clientes) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(ubicacionArchivo));
			salida.writeObject(clientes);
			salida.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	/*public void escribirArchivo(ArrayList<ClienteDTO> nuevosClientes) {
	    ArrayList<ClienteDTO> clientesExistentes = new ArrayList<>();

	    // Leer clientes existentes del archivo
	    try {
	        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ubicacionArchivo));
	        clientesExistentes = (ArrayList<ClienteDTO>) entrada.readObject();
	        entrada.close();
	    } catch (FileNotFoundException e) {
	        // Si el archivo no existe, está bien; simplemente lo crearemos más adelante.
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }

	    // Agregar nuevos clientes a la lista existente
	    clientesExistentes.addAll(nuevosClientes);

	    // Escribir la lista actualizada de vuelta al archivo
	    try {
	        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ubicacionArchivo));
	        salida.writeObject(clientesExistentes);
	        salida.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}*/
	
	public ArrayList<ClienteDTO> leerArchivo(){
		ArrayList<ClienteDTO> clientes = null;
		
		if(ubicacionArchivo.length()!=0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(ubicacionArchivo));
				clientes  = (ArrayList<ClienteDTO>) entrada.readObject();
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

	public ObjectInputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectOutputStream getSalida() {
		return salida;
	}

	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}

	public File getUbicacionArchivo() {
		return ubicacionArchivo;
	}

	public void setUbicacionArchivo(File ubicacionArchivo) {
		this.ubicacionArchivo = ubicacionArchivo;
	}
	
}
