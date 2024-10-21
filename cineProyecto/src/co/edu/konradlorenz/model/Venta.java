package co.edu.konradlorenz.model;

import java.time.LocalDate;

public class Venta extends Cine {

	private LocalDate fecha;
	private double precio;
	private String metodoPago;

	public Venta(String teatro, String estado, LocalDate fecha, double precio, String metodoPago) {
		super(teatro, estado);
		this.fecha = fecha;
		this.precio = precio;
		this.metodoPago = metodoPago;
	}

	public Venta() {
	}

	public Venta(String teatro, String estado) {
		super(teatro, estado);
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Override
	public String toString() {
		return "Venta [fecha=" + fecha + ", precio=" + precio + ", metodoPago=" + metodoPago + "]";
	}

	public boolean realizarVenta() {
		return false;
	}

	public void cancelarVenta() {

	}
}
