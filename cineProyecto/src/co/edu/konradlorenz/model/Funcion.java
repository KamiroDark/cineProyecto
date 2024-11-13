package co.edu.konradlorenz.model;

public class Funcion {

	private SalaCine sala;
	private String horario;
	private Pelicula pelicula;

	public Funcion(SalaCine sala, String horario, Pelicula pelicula) {
		this.sala = sala;
		this.horario = horario;
		this.pelicula = pelicula;
	}

	public Funcion() {
	}

	public SalaCine getSala() {
		return sala;
	}

	public void setSala(SalaCine sala) {
		this.sala = sala;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Funcion [sala=" + sala + ", horario=" + horario + ", pelicula=" + pelicula + "]";
	}

}
