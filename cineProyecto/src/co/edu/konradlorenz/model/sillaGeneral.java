package co.edu.konradlorenz.model;

public class sillaGeneral extends Asiento {

	private String identificador;
	
	

	public sillaGeneral(int numero, int fila, boolean reservado, String identificador) {
		super(numero, fila, reservado);
		this.identificador = identificador;
	}

	public sillaGeneral(String identificador) {
		
		this.identificador = identificador;
	}
	public sillaGeneral() {
	}

	@Override
	public double precio() {
		return 19000;
	}

	
}
