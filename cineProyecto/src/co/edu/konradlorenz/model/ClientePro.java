package co.edu.konradlorenz.model;

public interface ClientePro {
	
	public static final double DESCUENTO = 0.5;
	
public static final String MENMBRESIA = "PRO";
	
	public abstract String miembroPro(String MENMBRESIA);
	
	public abstract boolean calcularDescuento(double precio);
}
