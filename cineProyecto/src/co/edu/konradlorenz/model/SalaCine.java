package co.edu.konradlorenz.model;

import java.util.Arrays;

public class SalaCine {

	private String nombreSala;
	private int fila;
	private int columna;
	private Asiento[][] sala;

	public SalaCine(String nombreSala, int filas, int columnas, Asiento[][] sala) {
		this.nombreSala = nombreSala;
		this.fila = filas;
		this.columna = columnas;
		this.sala = sala;
	}

	public SalaCine() {

	}

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

	private void inicializarAsientosPremier() {
		for(int i = 0; i<fila;i++) {
			for(int j = 0; j<columna; j++) {
				if (i >= fila - 2) {
	                sala[i][j] = new sillaPremier(i, j, false);
	            } else {
	                sala[i][j] = new sillaGeneral(i, j, false);
	            }
			}
		}
	}
	
	public int asientosDisponibles() {
        int disponibles = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (!sala[i][j].isReservado()) {
                    disponibles++;
                }
            }
        }
        return disponibles;
    }
	
	
}
