package co.edu.unbosque.model.dto;

public class ClienteDTO extends UsuarioDTO{

	private static final long serialVersionUID = 1L;
	
	private String numeroTarjeta;
	private double cupo;
	
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public double getCupo() {
		return cupo;
	}
	public void setCupo(double cupo) {
		this.cupo = cupo;
	}
}
