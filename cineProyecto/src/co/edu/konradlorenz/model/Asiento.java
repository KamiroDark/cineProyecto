package co.edu.konradlorenz.model;

public class Asiento implements SillaPremier, SillaGeneral{

	private int numero;
	private int fila;
	private boolean reservado = false;

	public Asiento(int numero, int fila, boolean reservado) {
		this.numero = numero;
		this.fila = fila;
		this.reservado = reservado;
	}

	public Asiento() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	@Override
	public String toString() {
		return "Asiento [numero=" + numero + ", fila=" + fila + ", reservado=" + reservado + "]";
	}

	@Override
	public double calcularPrecioPremier() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPrecioGeneral() {
		// TODO Auto-generated method stub
		return 0;
	}

}
