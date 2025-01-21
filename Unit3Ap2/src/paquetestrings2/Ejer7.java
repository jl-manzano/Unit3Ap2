package paquetestrings2;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// variable para almacenar frase
		String frase = "";

		// variable para almacenar palabra
		String palabra = "";

		// bucle do-while -> asegurar que usuario introduzca una frase y una palabra
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			frase = sc.nextLine();

			// pedir palabra a usuario
			System.out.println("\nIntroduzca una palabra a buscar en la frase: ");
			palabra = sc.nextLine();

		} while (frase.isEmpty() && palabra.isEmpty());

		// mostrar resultado
		System.out.println("\nLa palabra \"" + palabra + "\" aparece " + encFrase(frase, palabra)
				+ " veces en la frase \"" + frase + "\"");

		// cerrar scanner
		sc.close();
	}

	static int encFrase(String frase, String palabra) {
		// variable para almacenar num veces que aparece palabra en frase
		int contadorVeces = 0;

		// variable para almacenar índice
		int index = 0;

		// bucle while -> buscar cuantas veces aparece la palabra en la frase
		while (index != -1) {
			
			// usar metodo indexOf -> buscar palabra en frase;
			index = frase.indexOf(palabra, index);

			// condicional if -> comprobar que indice es distinto de -1
			if (index != -1) {
				// incrementar en 1 el contador
				contadorVeces++;

				// almacenar el nuevo indice a partir del que buscar
				index = index + palabra.length();
			}
		}

		// devolver resultado
		return contadorVeces;

	}

}
