package co.edu.konradlorenz.model;

public class sillaPremier extends Asiento {

	private String identificador;
	private String beneficios;

	public sillaPremier(int numero, int fila, boolean reservado, String identificador, String beneficios) {
		super(numero, fila, reservado);
		this.identificador = identificador;
		this.beneficios = beneficios;
	}

	public sillaPremier(String identificador, String beneficios) {
		this.identificador = identificador;
		this.beneficios = beneficios;
	}

	public sillaPremier() {
	}

	@Override
	public double precio() {
		return 29000;
	}

}
