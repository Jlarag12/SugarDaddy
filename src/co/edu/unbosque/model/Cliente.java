package co.edu.unbosque.model;

public class Cliente extends Usuario{
	
	private String numeroTarjeta;
	private long cupo;
	
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public long getCupo() {
		return cupo;
	}
	public void setCupo(long cupo) {
		this.cupo = cupo;
	}
	
	@Override
    public String toString() {
        return "ID: " + getId() + ", Nombre: " + getNombre() + ", Numero Tarjeta: " + (numeroTarjeta != null ? numeroTarjeta : "N/A") + ", Cupo: " + cupo + ", Contraseña" + getContrasena();
    }
}
