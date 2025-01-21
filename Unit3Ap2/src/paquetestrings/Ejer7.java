package paquetestrings;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";

		// cadena para almacenar palabra
		String palabra = "";

		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

			// pedir palabra a usuario
			System.out.println("\nIntroduzca una palabra a buscar en la frase: ");
			palabra = sc.nextLine();

		} while (fraseUsuario.isEmpty() && palabra.isEmpty());

		System.out.println(
				"\nLa palabra " + palabra + " se repite " + encFrase(fraseUsuario, palabra) + " veces en la frase.");

		// cerrar scanner
		sc.close();

	}

	static int encFrase(String frase, String palabra) {

		// variable -> almacenar contador
		int cont = 0;

		// variable para almacenar el indice
		int index = 0;

		// bucle while -> determinar cuantas veces se repite la palabra en frase
		while (index != -1) {
			// usar metodo indexOf -> buscar palabra en frase; si encuentra;
			index = frase.indexOf(palabra, index);

			if (index != -1) {
				// incrementar en 1 el contador
				cont++;

				// mover índice más allá de la palabra encontrada para seguir buscando
				index += palabra.length();
			}
		}

		// devolver contador
		return cont;
	}
}
