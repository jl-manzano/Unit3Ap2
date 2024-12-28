package paquetestrings;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar palabra a palabra
		String palabra = "";

		// cadena para almacenar la frase completa
		String fraseUsuario = "";

		// pedir palabra a usuario
		System.out.println("Introduzca una palabra: ");
		palabra = sc.next();

		// bucle while -> contruir frase
		while (!palabra.equals("fin")) {

			// condicional if -> comprobar si la frase no está vacía
			if (!fraseUsuario.isEmpty()) {
				// contruir frase a partir de palabras introducidas por usuario
				fraseUsuario += " ";
			}

			// agregar la palabra a la frase construida
			fraseUsuario += palabra;

			// pedir palabra a usuario
			System.out.println("Introduzca una palabra: ");
			palabra = sc.next();

		}

		// condicional if-else -> comprobar si fraseUsuario está vacia o no e imprimir resultado
		if (fraseUsuario.isEmpty()) {
			// imprimir resultado
			System.out.println("\nEl usuario ha introducido fin como primera palabra.");
		} else {
			// imprimir resultado
			System.out.println("\nFrase construida palabra a palabra:\n" + fraseUsuario);
		}
		
		// cerrar scanner
		sc.close();
	}
}
