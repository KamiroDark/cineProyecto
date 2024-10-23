package co.edu.konradlorenz.model;

public class SillaPremier extends Asiento {

	private String identificador;
	private String beneficios;

	public SillaPremier(int numero, int fila, boolean reservado, String identificador, String beneficios) {
		super(numero, fila, reservado);
		this.identificador = identificador;
		this.beneficios = beneficios;
	}

	public SillaPremier(String identificador, String beneficios) {
		this.identificador = identificador;
		this.beneficios = beneficios;
	}

	public SillaPremier() {
	}

	@Override
	public double precio() {
		return 29000;
	}

}
