package co.edu.konradlorenz.model;

public abstract class Asiento {
	private int numero;
	private int fila;
	private boolean reservado;

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
	
	//Precio de cada silla
	public abstract double precio();
	
	
	@Override
	public String toString() {
		return "Asiento [numero=" + numero + ", fila=" + fila + ", reservado=" + reservado + "]";
	}

}
