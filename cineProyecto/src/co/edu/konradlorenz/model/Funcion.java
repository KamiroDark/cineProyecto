package co.edu.konradlorenz.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Funcion extends Cine {

	private int sala;
	private LocalTime horario;
	private ArrayList<String> pelicula;

	public Funcion(String teatro, String estado, int sala, LocalTime horario, ArrayList<String> pelicula) {
		super(teatro, estado);
		this.sala = sala;
		this.horario = horario;
		this.pelicula = pelicula;
	}

	public Funcion() {
	}

	public Funcion(String teatro, String estado) {
		super(teatro, estado);
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public ArrayList<String> getPelicula() {
		return pelicula;
	}

	public void setPelicula(ArrayList<String> pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Funcion [sala=" + sala + ", horario=" + horario + ", pelicula=" + pelicula + "]";
	}
	
	
}
