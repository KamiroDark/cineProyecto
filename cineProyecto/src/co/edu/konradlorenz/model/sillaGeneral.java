package co.edu.konradlorenz.model;

public class sillaGeneral extends Asiento {

	public sillaGeneral(int numero, int fila, boolean reservado) {
		super(numero, fila, reservado);
	}

	public sillaGeneral() {
	}

	@Override
	public double precio() {
		return 19000;
	}

	
}
