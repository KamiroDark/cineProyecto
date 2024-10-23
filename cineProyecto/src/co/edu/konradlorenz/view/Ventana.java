package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {

	public static Scanner leer = new Scanner(System.in);

	public String pedirString(String mensaje) {
		System.out.println(mensaje);
		String op = leer.nextLine();
		leer.nextLine();
		return op;
	}

	public int pedirInt(String mensaje) {
		System.out.println(mensaje);
		int op = leer.nextInt();
		leer.nextLine();
		return op;
	}
	
	public long pedirLong(String mensaje) {
		System.out.println(mensaje);
		long op = leer.nextLong();
		leer.nextLine();
		return op;
	}
	
	public void mostrarMenu() {
		System.out.println("-----------------------------------");
		System.out.println("-------BIENVENID@ A DARKAZO--------");
		System.out.println(" ");
		System.out.println("1. Registrarse");
		System.out.println("2. Comprar entradas");
		System.out.println("3. Cartelera");
		System.out.println("4. Ver perfil");
		System.out.println("5. Salir");
		System.out.println("-----------------------------------");
	}

	public void mostrarFunciones() {
		System.out.println("-----------------------------------");
		System.out.println("-------------Cartelera-------------");
		System.out.println("1. Sonríe 2 - 130 min - 15-A");
		System.out.println("2. Guasón 2 - 140 min - 15-A");
		System.out.println("3. Robot Salavaje - 100 min - Todos");
		System.out.println("4. Transformers Uno - 105 min - 7-A");
		System.out.println("5. La sustancia - 140 min - 15-A");
		System.out.println("6. Volver al menu principal");
		System.out.println("-----------------------------------");
	}

	public void mostrarVenta() {
		
	}

	public void mostrarFactura() {

	}
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
