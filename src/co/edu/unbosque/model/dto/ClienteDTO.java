package co.edu.unbosque.model.dto;

public class ClienteDTO extends UsuarioDTO{

	private static final long serialVersionUID = 1L;
	
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
