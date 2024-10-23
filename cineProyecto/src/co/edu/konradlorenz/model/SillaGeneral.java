package co.edu.konradlorenz.model;

public class SillaGeneral extends Asiento {

	private String identificador;
	
	

	public SillaGeneral(int numero, int fila, boolean reservado, String identificador) {
		super(numero, fila, reservado);
		this.identificador = identificador;
	}

	public SillaGeneral(String identificador) {
		
		this.identificador = identificador;
	}
	public SillaGeneral() {
	}

	@Override
	public double precio() {
		return 19000;
	}

	
}
