package co.edu.konradlorenz.model;

public interface ClientePro {
	
	public static final double DESCUENTO = 0.5;
	
	public abstract boolean calcularDescuento(double precio);
}
