package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArchivoLog {
	
	private File archivoLog;
	
	public ArchivoLog() {
		if(archivoLog == null) {
			archivoLog = new File("archivos/logstransacciones.txt");
		}
		
	}
	
	public ArchivoLog(File archivoJuego) {
		this.archivoLog = archivoJuego;
	}
	
	public String leerArchivo() {
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader linea; 
		try {
			fis = new FileInputStream(archivoLog);
			isr = new InputStreamReader(fis);
			linea = new BufferedReader(isr);
			
			if(archivoLog.exists()) {
				String linea_arch = linea.readLine();
				String archivo_total = linea_arch;
				while(linea_arch != null) {
					linea_arch = linea.readLine();
					if(linea_arch != null) {
						archivo_total = archivo_total + "\n" + linea_arch;
					}
				}
				linea.close();
				return archivo_total;
			}else {
				return "El archivo no existe";
			}
		}catch(IOException e) {
			return "No se pudo leer el archivo";
		}
	}
	
	public String escribirArchivo(String frase) {
		try {
			FileWriter lineatx = new FileWriter(archivoLog, true);
			lineatx.write(frase + "\r\n");
			lineatx.close();
			return "Linea ingresada con exito";
		}catch(IOException e) {
			return "No se pudo escribir en el archivo";
		}
	}

}
