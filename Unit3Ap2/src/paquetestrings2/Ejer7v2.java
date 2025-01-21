package paquetestrings2;

import java.util.Scanner;

public class Ejer7v2 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// variable -> almacenar fraseUsuario
		String fraseUsuario = "";

		// variable -> almacenar palabra
		String palabra = "";

		// pedir a usuario palabra y frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

			// pedir palabra a usuario
			System.out.println("\nIntroduzca una palabra a buscar en la frase: ");
			palabra = sc.nextLine();

		} while (fraseUsuario.isEmpty() && palabra.isEmpty());

		// llamar a funcion y mostrar cuantas veces aparece la palabra en la frase
		System.out.println("\nLa palabra \"" + palabra + "\" aparece " + numVeces(fraseUsuario, palabra)
				+ " en la frase \"" + fraseUsuario + "\".");

		// cerrar scanner
		sc.close();

	}

	static int numVeces(String frase, String palabra) {
		// variable para almacenar contador
		int contador = 0;

		// varible para almacenar indice
		int index = 0;

		// bucle while -> comprobar cuántas veces aparece la palabra en la frase
		while (index != -1) {

			// almacenar el resultado de evaluar indexOf de la palabra a buscar desde el
			// indice en cuestion
			index = frase.indexOf(palabra, index);

			// condicional if -> determinar si se ha encontrado la palabra en la frase;
			// entonces -> hacer instrucciones
			if (index != -1) {

				// incrementar en 1 el contador
				contador++;

				// sumar a indice encontrado, la longitud de la palabra -> empezar a buscar de
				// nuevo si hay una palabra en la frase
				index += palabra.length();
								
			}

		}

		// devolver contador
		return contador;

	}
}
