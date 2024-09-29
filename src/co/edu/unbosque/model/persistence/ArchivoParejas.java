package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ArchivoParejas {
	
	private File arc;
	private Properties archivoP;
	
	public ArchivoParejas() {
		arc = new File("archivos/ArchivoParejas.properties");
		archivoP = new Properties();
	}
	
	public ArchivoParejas (File archivo) {
		this.arc = archivo;
	}
	
	public void leerArchivo() throws IOException {
		try {
			FileInputStream in = new FileInputStream(arc);
			archivoP.load(in);
			in.close();
		}catch(IOException e) {
			throw new IOException("Formato Invalido");
		}
	}
	
	public void escribirArchivo(String propiedad, String valor) {
		try {
			archivoP.setProperty(propiedad, valor);
			archivoP.store(new FileOutputStream(arc), null);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public Properties getDatos() {
		return archivoP;
	}

	public void setDatos(Properties archivoP) {
		this.archivoP = archivoP;
	}
	
}
