package co.edu.konradlorenz.model;

import java.util.Arrays;

public class SalaCine {

	// Atributos
	private String nombreSala;
	private int fila;
	private int columna;
	private Asiento[][] sala;

	// Constructores
	public SalaCine(String nombreSala, int fila, int columna, Asiento[][] sala) {
		super();
		this.nombreSala = nombreSala;
		this.fila = fila;
		this.columna = columna;
		this.sala = sala;
	}

	public SalaCine() {

	}

	// Carpinteria (Setters, Getters y toString)
	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public Asiento[][] getSala() {
		return sala;
	}

	public void setSala(Asiento[][] sala) {
		this.sala = sala;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public String toString() {
		return "SalaCine [nombreSala=" + nombreSala + ", fila=" + fila + ", columna=" + columna + ", sala="
				+ Arrays.toString(sala) + "]";
	}

	/*
	 * / private void inicializarAsientosPremier() { for (int i = 0; i <
	 * sala.length; i++) { for (int j = 0; j < sala[i].length; j++) { if (i <
	 * sala.length / 2) { sala[i][j] = new SillaGeneral("G" + (i + 1) + (j + 1)); }
	 * else { sala[i][j] = new SillaPremier("P" + (i + 1) + (j + 1),
	 * "Reclinable y bebidas gratis"); } } } }
	 * 
	 * public int asientosDisponibles() { int disponibles = 0; for (int i = 0; i <
	 * fila; i++) { for (int j = 0; j < columna; j++) { if
	 * (!sala[i][j].isReservado()) { disponibles++; } } } return disponibles; }/
	 */

}
