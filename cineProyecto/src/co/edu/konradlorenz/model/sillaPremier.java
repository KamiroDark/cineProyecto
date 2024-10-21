package co.edu.konradlorenz.model;

public class sillaPremier extends Asiento{

	public sillaPremier(int numero, int fila, boolean reservado) {
		super(numero, fila, reservado);
	}

	
	public sillaPremier() {
	}


	@Override
	public double precio() {
		return 29000;
	}
	
	
}
