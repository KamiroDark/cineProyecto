package co.edu.konradlorenz.model;

public class Usuario implements ClienteGold, ClientePro{

	private String nombreUsuario;
	private String correoElectronico;
	private String contraseña;
	private long celular;

	public Usuario(String nombreUsuario, String correoElectronico, String contraseña, long celular) {
		this.nombreUsuario = nombreUsuario;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
		this.celular = celular;
	}

	public Usuario() {
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + ", contraseña="
				+ contraseña + ", celular=" + celular + "]";
	}

	@Override
	public boolean calcularDescuento(double precio) {
		return false;
	}

	@Override
	public String miembroGold(String MENMBRESIA) {
		
		return MENMBRESIA;
	}

	@Override
	public String miembroPro(String MENMBRESIA) {
		
		return MENMBRESIA;
	}

}
