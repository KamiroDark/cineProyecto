package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Cine;
import co.edu.konradlorenz.model.Funcion;

import co.edu.konradlorenz.view.Ventana;

public class Control {
	
	protected Funcion objFuncion = new Funcion();
	
	protected Cine objCine = new Cine();
	
	protected Ventana objVenatana = new Ventana();
	
	public void run() {
		do {
			objVenatana.mostrarMenu();
			int opcion = objVenatana.pedirInt("Por favor ingrese una opcion vista en el menu de manera numerica");
			
			switch (opcion) {
			case 1: {
				objVenatana
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while ();
	}
}
