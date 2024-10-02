package co.edu.unbosque.model.dto;

public class ParejaDTO extends UsuarioDTO {
	
	private static final long serialVersionUID = 1L;
		
	private int edad;
	private long asignacion;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getAsignacion() {
		return asignacion;
	}
	public void setAsignacion(long asignacion) {
		this.asignacion = asignacion;
	}
}
