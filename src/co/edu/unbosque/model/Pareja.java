package co.edu.unbosque.model;

public class Pareja extends Usuario{

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
	@Override
	public String toString() {
		return "Pareja [ID= " + getId() + ", Nombre=" + getNombre() + ", asignacion=" + asignacion + "]";
	}
	
	
}
