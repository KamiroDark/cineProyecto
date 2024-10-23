package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.Cine;
import co.edu.konradlorenz.model.Funcion;
import co.edu.konradlorenz.model.Usuario;
import co.edu.konradlorenz.view.*;

public class Control {

	protected Funcion objFuncion = new Funcion();

	protected InciarSesion objIniciarSesion = new InciarSesion();

	protected Asientos objAsientos = new Asientos();

	protected Cartelera objCartelera = new Cartelera();

	protected Factura objFactura = new Factura();

	protected Peliculas objPeliculas = new Peliculas();

	protected Registrarse objRegistrarse = new Registrarse();

	protected VentaMop objVentaMop = new VentaMop();

	protected Cine objCine = new Cine();

	protected Ventana objVentana = new Ventana();
	
	protected ArrayList<Usuario> clientes = new ArrayList<>();

	public void run() {
		int opcion;
		do {
			objVentana.mostrarMenu();
			opcion = objVentana.pedirInt("Por favor ingrese una opcion vista en el menu de manera numerica");

			switch (opcion) {
			case 1: {
				objVentana.mostrarMensaje("---Crear Cuenta---");

				String nombre = objVentana.pedirString("Ingrese nombre de Usuario:");
				String correo = objVentana.pedirString("Ingrese correo electronico:");
				String contraseña = objVentana.pedirString("Ingrese su nueva contraseña:");
				long celular = objVentana.pedirLong("Ingrese su numero de celular para recibir nuevas promociones:");

				objVentana.mostrarMensaje(
						"Desea adquirir la membrecia Gold para un 30% de descuento -o- membrecia Pro para un 50% de descuento?");
				objVentana.mostrarMensaje("Ingrese el digito segun corresponda en las siguientes opciones");
				objVentana.mostrarMensaje("1. Adquirir Gold");
				objVentana.mostrarMensaje("2. Adquirir Pro");
				objVentana.mostrarMensaje("3. No gracias, continuar");
				int member = objVentana.pedirInt("");
				if (member == 1) {
					Usuario usuarioActual = new Usuario(nombre, correo, contraseña, celular);
					objVentana.mostrarMensaje("¡Bienvenido, " + usuarioActual.getNombreUsuario() + "miembro Gold!");
					clientes.add(usuarioActual);
				} else if (member == 2) {
					Usuario usuarioActual = new Usuario(nombre, correo, contraseña, celular);
					objVentana.mostrarMensaje("¡Bienvenido, " + usuarioActual.getNombreUsuario() + "miembro Pro!");
					clientes.add(usuarioActual);
				} else {
					Usuario usuarioActual = new Usuario(nombre, correo, contraseña, celular);
					objVentana.mostrarMensaje("¡Bienvenid@ " + usuarioActual.getNombreUsuario());
					clientes.add(usuarioActual);
				}
				break;
			}
			case 2:
				objVentana.mostrarMensaje("Que pelicula desea ver?");
				objVentana.mostrarFunciones();
				
				break;
			case 3:
				objVentana.mostrarFunciones();
				int peli = objVentana.pedirInt("Ingrese el indice de la pelicula que desea ver en pantalla");
				if (peli == 1) {
					objVentana.mostrarMensaje("Usted seleccionó Sonríe 2");
				} else if (peli == 2) {
					objVentana.mostrarMensaje("Usted seleccionó Guasón 2");
				} else if (peli == 3) {
					objVentana.mostrarMensaje("Usted seleccionó Robot Salavaje");
				} else if (peli == 4) {
					objVentana.mostrarMensaje("Usted seleccionó Transformers Uno");
				}else if (peli == 5) {
					objVentana.mostrarMensaje("Usted seleccionó La Sustancia");
				}

				break;
				
			case 4:
				for(int i = 0; i<clientes.size();i++) {
					objVentana.mostrarMensaje(clientes.get(i).toString());
				}
				break;
			case 5:
				objVentana.mostrarMensaje("Gracias por usar nuestro programa...");
				System. exit(0);
				break;
			
			default:
				objVentana.mostrarMensaje("Opcion invalida, digite algun indice del menu (1 o 2 o 3 o 4 o 5)");
			}
		} while (opcion != 5);
	}
}
