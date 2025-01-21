package paquetestrings2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar frase introducida por usuario
		String palabra1 = "";

		// cadena para almacenar frase introducida por usuario
		String palabra2 = "";

		// variable para almacenar booleano
		boolean sonAnagrama;

		// bucle do-while -> asegurar que usuario introduzca 2 palabras
		do {

			System.out.println("¿SON ANAGRAMAS?");

			// pedir frase a usuario
			System.out.println("\nIntroduzca una palabra: ");
			palabra1 = sc.nextLine().toLowerCase();

			System.out.println("\nIntroduzca otra palabra: ");
			palabra2 = sc.nextLine().toLowerCase();

		} while (palabra1.isEmpty() && palabra2.isEmpty());

		// almacenar resultado
		sonAnagrama = sonAnagramas(palabra1, palabra2);

		// condicional if -> mostrar resultado
		if (sonAnagrama) { // entra al esperar true
			System.out.println("\nLas palabras " + palabra1 + " y " + palabra2 + " son anagramas.");
		} else { // entra al esperar false
			System.out.println("\nLas palabras " + palabra1 + " y " + palabra2 + " NO son anagramas.");

		}
		
		// cerrar scanner
		sc.close();

	}

	static boolean sonAnagramas(String palabra1, String palabra2) {
		// variable para almacenar booleano
		boolean sonAnagrama;

		// pasar a tabla de caracteres la palabra1
		char[] array1 = palabra1.toCharArray();

		// pasar a tabla de caracteres la palabra2
		char[] array2 = palabra2.toCharArray();

		// ordenar tablas
		Arrays.sort(array1);
		Arrays.sort(array2);

		// verificar si son anagramas / no
		sonAnagrama = Arrays.equals(array1, array2);

		// devolver resultado
		return sonAnagrama;
	}
}
