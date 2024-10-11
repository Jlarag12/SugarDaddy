package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.dto.ParejaDTO;

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
		
	public ArrayList<ParejaDTO> leerParejasPorCliente(long clienteId) {
		ArrayList<ParejaDTO> parejas = new ArrayList<>();
        try {
            FileInputStream in = new FileInputStream(arc);
            archivoP.load(in);
            in.close();

            for (String key : archivoP.stringPropertyNames()) {
                if (key.startsWith(clienteId + "_")) {
                    String[] datosPareja = archivoP.getProperty(key).split(",");
                    ParejaDTO pareja = new ParejaDTO();
                    pareja.setId(Long.parseLong(datosPareja[0]));
                    pareja.setNombre(datosPareja[1]);
                    pareja.setEdad(Integer.parseInt(datosPareja[2]));
                    pareja.setAsignacion(Long.parseLong(datosPareja[3]));
                    parejas.add(pareja);
                }
            }
        } catch (IOException e) {
        	e.printStackTrace();
        }
        return parejas;
    }

	public ArrayList<ParejaDTO> leerTodasLasParejas() {
		ArrayList<ParejaDTO> parejas = new ArrayList<>();
	    try {
	        FileInputStream in = new FileInputStream(arc);
	        archivoP.load(in);
	        in.close();

	        for (String key : archivoP.stringPropertyNames()) {
	            String[] datosPareja = archivoP.getProperty(key).split(",");
	            ParejaDTO pareja = new ParejaDTO();
	            pareja.setId(Long.parseLong(datosPareja[0]));
	            pareja.setNombre(datosPareja[1]);
	            pareja.setEdad(Integer.parseInt(datosPareja[2]));
	            pareja.setAsignacion(Long.parseLong(datosPareja[3]));
	            parejas.add(pareja);
	        }
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    return parejas;
	}
	
	public void escribirPareja(Long clienteId, ParejaDTO parejaDTO) {
        try {
        	archivoP.load(new FileInputStream(arc));
            String key = clienteId + "_" + parejaDTO.getId();  // Clave: clienteID_parejaID
            String valor = parejaDTO.getId() + "," + parejaDTO.getNombre() + "," + parejaDTO.getEdad() + "," + parejaDTO.getAsignacion();
            archivoP.setProperty(key, valor);
            archivoP.store(new FileOutputStream(arc), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public boolean reiniciarArchivoParejas() {
		FileOutputStream fos = null;
		try {
	    	
	        arc.exists();
	        arc.delete();
	        arc.createNewFile();
	        archivoP.clear();
	        
	        fos = new FileOutputStream(arc);
	        archivoP.store(fos, null);
	        
	        return true;
	    } catch (IOException e) {
	        e.printStackTrace();
	    }finally {
	    	try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
	    }
	    
	    return false;
	}

	public File getArc() {
		return arc;
	}

	public void setArc(File arc) {
		this.arc = arc;
	}

	public Properties getArchivoP() {
		return archivoP;
	}

	public void setArchivoP(Properties archivoP) {
		this.archivoP = archivoP;
	}
}
