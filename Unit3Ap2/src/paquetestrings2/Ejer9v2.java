package paquetestrings2;

import java.util.Scanner;

public class Ejer9v2 {
	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// constantes para almacenar muletillas que designan si una frase esta en el idioma
		final String MULETILLA_1 = "Javalín, javalón";
		final String MULETILLA_2 = "Javalén, len, len";
		
		// variable para almacenar fraseUsuario
		String fraseUsuario = "";
		
		// variable para almacenar fraseTraducida
		String fraseTraducida = "";
		
		// bucle do-while -> asegurar que usuario introduzca una frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());
		
		// condicional if - else if - else -> determinar si frase está en el idioma
		if (fraseUsuario.startsWith(MULETILLA_1)) {
			System.out.println("\nTiene la primera muletilla. Está en el idioma.");
			fraseTraducida = fraseUsuario.substring(MULETILLA_1.length());
		} else if (fraseUsuario.endsWith(MULETILLA_2)) {
			System.out.println("\nTiene la segunda muletilla. Está en el idioma.");
			fraseTraducida += fraseUsuario.substring(0, fraseUsuario.length() - MULETILLA_2.length());
		} else {
			System.out.println("La frase no está en el idioma.");
		}
		
		// mostrar frase traducida
		System.out.println("\nFrase traducida: " + fraseTraducida);
		
		// cerrar scanner
		sc.close();
		
	}
}
