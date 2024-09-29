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
}
