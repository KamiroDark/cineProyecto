package co.edu.konradlorenz.model;

import java.time.LocalDate;

public class VentaBase extends Cine implements Venta {

	private LocalDate fecha;
	private double precio;
	private String metodoPago;

	public VentaBase(String teatro, String estado, LocalDate fecha, double precio, String metodoPago) {
		super(teatro, estado);
		this.fecha = fecha;
		this.precio = precio;
		this.metodoPago = metodoPago;
	}

	public VentaBase() {
	}

	public VentaBase(String teatro, String estado) {
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

	@Override
	public boolean realizarVenta() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cancelarVenta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
