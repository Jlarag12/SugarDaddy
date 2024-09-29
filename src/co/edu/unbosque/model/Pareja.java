package co.edu.unbosque.model;

public class Pareja {

	private int id;
	private String nombre;
	private int edad;
	private long asignacion;
	
	public Pareja(int id, String nombre, int edad, long asignacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.asignacion = asignacion;
	}
	
	public Pareja() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
