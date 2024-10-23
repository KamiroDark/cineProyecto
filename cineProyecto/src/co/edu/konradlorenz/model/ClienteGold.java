package co.edu.konradlorenz.model;

public interface ClienteGold {
	
	public static final double DESCUENTO = 0.3;
	
	public abstract boolean calcularDescuento(double precio);
}