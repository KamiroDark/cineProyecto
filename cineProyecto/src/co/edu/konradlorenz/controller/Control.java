package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.*;
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
	
	public Usuario usuarioSeleccionado;

	public void run() {
		
		datosDePrueba();
		
		//Frames
		vntMenuPrincipal ventanaPrincipal = new vntMenuPrincipal();
		vtnRegistrar registrar = new vtnRegistrar();
		vtnRegistro registro = new vtnRegistro();
		vtnInicioSesion inicioSesion = new vtnInicioSesion();
		
		ventanaPrincipal.setVisible(true);
		
		
	}
	
	//Metodo para validar el inicio de sesion
	public boolean validarCredenciales(String correo, String contraseña, TipoMembresia membresia) {
		usuarioSeleccionado = null;
		
			for(Usuario usuario : clientes) {
				if(usuario.getCorreoElectronico().equals(correo));
				usuarioSeleccionado = usuario;
				break;
			}
		
		
		if (usuarioSeleccionado == null)
			return false;
		
		boolean verificarContraseña = usuarioSeleccionado.getContraseña().equals(contraseña) ? true : false;
		
		return verificarContraseña;
	}//*//Cierre validarCredenciales
	
	// Metodo para usuarios ya guardados en el programa
	public void datosDePrueba() {

		// Variables globales
		String nombreUsuario;
		String correoElectronico;
		String contraseña;
		long celular;
		TipoMembresia tipoMembresia;

		// Ejemplo 1
		nombreUsuario = "Darly Diaz";
		correoElectronico = "darlydiaz@gmail.com";
		contraseña = "louis2024";
		celular = 339295373;
		tipoMembresia = TipoMembresia.GOLD;
		nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);

		// Ejemplo 2
		nombreUsuario = "Zoe Henao";
		correoElectronico = "henaozoe@gmail.com";
		contraseña = "santiago2023";
		celular = 334353562;
		tipoMembresia = TipoMembresia.PRO;
		nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);

		// Ejemplo 3
		nombreUsuario = "Camilo Prieto";
		correoElectronico = "prietocamilo21@gmail.com";
		contraseña = "gojosatoru";
		celular = 312466982;
		tipoMembresia = TipoMembresia.REGULAR;
		nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);

	}// Cierre datos Prueba
	
	//Metodo para crear y agregar usuarios al sistema
	public void nuevoCliente(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		if (TipoMembresia.GOLD.equals(membresia)) {
			Usuario usuarioGold = new ClienteGold(nombreUsuario, correoElectronico, contraseña, celular, membresia);
			clientes.add(usuarioGold);
		} else if (TipoMembresia.PRO.equals(membresia)) {
			Usuario usuarioPro = new ClientePro(nombreUsuario, correoElectronico, contraseña, celular, membresia);
			clientes.add(usuarioPro);
		} else if (TipoMembresia.REGULAR.equals(membresia)) {
			Usuario usuarioRegular = new ClienteRegular(nombreUsuario, correoElectronico, contraseña, celular,
					membresia);
			clientes.add(usuarioRegular);
		}
	}//Cierre nuevoCliente
}//Cierre Control
