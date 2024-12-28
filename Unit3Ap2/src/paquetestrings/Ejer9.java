package paquetestrings;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		
		// constante para almacenar muletilla 1
		final String MULETILLA_1 = "Javalín, javalón";
		
		// constante para almacenar muletilla 2
		final String MULETILLA_2 = "Javalén, len, len";
		
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";
		
		// cadena para almacenar frase traducida
		String fraseTraducida = "";
		
		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());

		// eliminar espacios al principio o al final 
		fraseUsuario.trim();

		// condicional if - else if - else para comprobar si inicia con una muletilla o termina por otra -> verificar si frase está en el idioma
		if (fraseUsuario.startsWith(MULETILLA_1)) {
			System.out.println("\nTiene la primera muletilla. Está en el idioma.");
			fraseTraducida = fraseUsuario.substring(MULETILLA_1.length(), fraseUsuario.length());
		} else if (fraseUsuario.endsWith(MULETILLA_2)) {
			System.out.println("\nTiene la segunda muletilla. Está en el idioma.");
			fraseTraducida = fraseUsuario.substring(0, fraseUsuario.length() - MULETILLA_2.length());

		} else {
			System.out.println("No está en el idioma.");
		}
		
		// mostrar frase traducida
		System.out.println("Frase traducida: " + fraseTraducida);

		// cerrar scanner
		sc.close();
	}
}
