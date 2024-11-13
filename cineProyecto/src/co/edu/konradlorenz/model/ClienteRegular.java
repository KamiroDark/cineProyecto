package co.edu.konradlorenz.model;

public class ClienteRegular extends Usuario{
	
	public ClienteRegular(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		super(nombreUsuario, correoElectronico, contraseña, celular, membresia);
	}

	@Override
	public double calcularDescuento(double totalCompra) {
		// Cliente regular no tiene descuento, por eso devolvemos el precio nomral
		return totalCompra;
	}

}
