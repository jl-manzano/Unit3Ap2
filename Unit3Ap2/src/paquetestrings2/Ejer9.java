package paquetestrings2;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// constantes para almacenar muletillas del idioma
		final String MULETILLA_1 = "Javalín, javalón";
		final String MULETILLA_2 = "javalén, len, len";

		// variable -> almacenar frase introducida por usuario
		String fraseUsuario = "";

		// variable -> almacenar frase traducida por usuario
		String fraseTraducida = "";

		// bucle do-while -> asegurar que usuario introduzca una frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());

		// condicional if- else if - else -> comprobar si frase está en el idioma
		if (fraseUsuario.startsWith(MULETILLA_1)) {
			System.out.println("\nTiene la primera muletilla. Está en el idioma.");
			fraseTraducida = fraseUsuario.substring(MULETILLA_1.length());
		} else if (fraseUsuario.endsWith(MULETILLA_2)) {
			System.out.println("\nTiene la segunda muletilla. Está en el idioma.");
			fraseTraducida = fraseUsuario.substring(0, fraseUsuario.length() - MULETILLA_2.length());
		}
		
		// mostrar frase traducida
		System.out.println("\nFrase traducida: " + fraseTraducida);

		// cerrar scanner
		sc.close();

	}
}
