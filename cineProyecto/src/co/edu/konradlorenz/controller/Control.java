package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Cine;
import co.edu.konradlorenz.model.ClienteGold;
import co.edu.konradlorenz.model.Funcion;
import co.edu.konradlorenz.model.Usuario;
import co.edu.konradlorenz.view.Ventana;

public class Control {
	
	protected Funcion objFuncion = new Funcion();
	
	protected Cine objCine = new Cine();
	
	protected Ventana objVenatana = new Ventana();
	
	public void run() {
		int opcion;
		do {
			objVenatana.mostrarMenu();
			opcion = objVenatana.pedirInt("Por favor ingrese una opcion vista en el menu de manera numerica");
			
			switch (opcion) {
			case 1: {
				objVenatana.mostrarMensaje("---Crear Cuenta---");
				
				String nombre = objVenatana.pedirString("Ingrese nombre de Usuario:");
				String correo = objVenatana.pedirString("Ingrese correo electronico:");
				String contraseña = objVenatana.pedirString("Ingrese su nueva contraseña:");
				long celular = objVenatana.pedirLong("Ingrese su numero de celular para recibir nuevas promociones:");
				
				objVenatana.mostrarMensaje("Desea adquirir la membrecia Gold para un 30% de descuento -o- membrecia Pro para un 50% de descuento?");
				objVenatana.mostrarMensaje("Ingrese el digito segun corresponda en las siguientes opciones");
				objVenatana.mostrarMensaje("1. Adquirir Gold");
				objVenatana.mostrarMensaje("2. Adquirir Pro");
				objVenatana.mostrarMensaje("3. No gracias, continuar");
				int member = objVenatana.pedirInt("");
				if(member == 1) {
					Usuario usuarioActual = new Usuario(nombre, correo, contraseña, celular);
                    objVenatana.mostrarMensaje("¡Bienvenido, miembro Gold!");
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (opcion != 5);
	}
}
