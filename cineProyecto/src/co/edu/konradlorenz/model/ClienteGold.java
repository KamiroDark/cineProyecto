package co.edu.konradlorenz.model;

public interface ClienteGold {
	
	public static final double DESCUENTO = 0.3;
	
	public static final String MENMBRESIA = "GOLD";
	
	public abstract String miembroGold(String MENMBRESIA);
	
	public abstract boolean calcularDescuento(double precio);
}
