package co.edu.unbosque.model.utils;

import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.dto.ParejaDTO;

public class MapHandlerPareja {

	public static ParejaDTO convertirParejaParejaDTO(Pareja pareja) {
		ParejaDTO parejaDTO = new ParejaDTO();
		parejaDTO.setId(pareja.getId());
		parejaDTO.setNombre(pareja.getNombre());
		parejaDTO.setEdad(pareja.getEdad());
		parejaDTO.setAsignacion(pareja.getAsignacion());
		
		return parejaDTO;		
	}
	
	public static Pareja convertirParejaDTOAPareja(ParejaDTO parejaDTO) {
		Pareja pareja = new Pareja();
		pareja.setId(parejaDTO.getId());
		pareja.setNombre(parejaDTO.getNombre());
		pareja.setEdad(parejaDTO.getEdad());
		pareja.setAsignacion(parejaDTO.getAsignacion());
		
		return pareja;		
	}
}
