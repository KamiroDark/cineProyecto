package co.edu.konradlorenz.model;

public interface Venta {
	boolean realizarVenta();
    void cancelarVenta();
    double calcularPrecio();
}
