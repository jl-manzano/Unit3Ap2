package paquetestrings;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";

		// pedir frase a usuario
		System.out.println("Introduzca una frase: ");
		fraseUsuario = sc.nextLine();

		if (esPalindroma(fraseUsuario)) {
			System.out.println("\nEs palíndroma.");

		} else {
			System.out.println("\nNo es palíndroma.");
		}

		// cerrar scanner
		sc.close();

	}

	static boolean esPalindroma(String frase) {

		// variable -> almacenar booleano
		boolean esPalindroma = false;

		// eliminar espacios frase
		String fraseSinEspacios = frase.replace(" ", "").toLowerCase();

		// String para almacenar la frase del revés
		String fraseReves = "";

		// bucle for -> dar vuelta a la frase
		for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
			fraseReves += fraseSinEspacios.charAt(i);
		}

		// condicional if -> comprobar si frase es palindroma
		if (fraseSinEspacios.equals(fraseReves)) {
			esPalindroma = true;
		}

		// devolver booleano
		return esPalindroma;
	}

}
