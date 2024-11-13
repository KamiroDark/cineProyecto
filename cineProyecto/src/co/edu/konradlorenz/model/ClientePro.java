package co.edu.konradlorenz.model;

public class ClientePro extends Usuario {

	public ClientePro(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		super(nombreUsuario, correoElectronico, contraseña, celular, membresia);
	}

	@Override
	public double calcularDescuento(double totalCompra) {
		double descuento = totalCompra * membresia.getDescuento()/100;
		return totalCompra - descuento;
	}

}
