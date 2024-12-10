package paquetestrings;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear string -> almacenar frase 1
		String passwd = "";

		// crear string -> almacenar frase 2
		String incognita = "";

		// variable -> almacenar contador
		int intentos = 0;

		// pedir a usuario que introduzca su contraseña
		System.out.println("Introduzca su contraseña: ");

		// leer contraseña introducida por teclado
		passwd = sc.nextLine();

		while (!incognita.equals(passwd)) {
			
			// incrementar contador de intentos en 1
			intentos++;
			
			// pedir a usuario que intenta adivinar contraseña por teclado
			System.out.println("\nAdivina la contraseña: ");

			// leer intento de acierto de contraseña introducida por teclado
			incognita = sc.next();

			// almacenar resultado de comparar contraseña
			System.out.println();

			if (incognita.compareTo(passwd) < 0) {
				System.out.println("Su intento introducido es menor alfabéticamente que la contraseña.");
			} else if (incognita.compareTo(passwd) > 0) {
				System.out.println("Su intento introducido es mayor alfabéticamente que la contraseña.");

			} else {
				System.out.println("Has acertado la contraseña.");
				System.out.println("Intentos: " + intentos);

			}

		}
		
		// cerrar scanner
		sc.close();

	}
}
