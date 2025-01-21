package paquetestrings2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14v2 {
	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";
		
		// variable para almacenar fraseSinEspacios
		String fraseSinEspacios = "";

		// crear array -> pasar cadena a array de caracteres
		char[] letras;

		// variable para almacenar letra
		char letra;
		
		// variable -> almacenar numVeces que letra aparece en la frase
		int numVeces = 1;

		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			// pedir frase a usuario
			System.out.println("Introduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());

		System.out.println("\nFrase: " + fraseUsuario + "\n");

		fraseSinEspacios = fraseUsuario.replace(" ", "");
		
		// pasar cadena a array de caracteres
		letras = fraseSinEspacios.toLowerCase().toCharArray();

		// ordenar array de caracteres
		Arrays.sort(letras);

		// guardar primera letra del array en variable letra
		letra = letras[0];

		// bucle for -> mostrar letras que aparecen en la frase
		for (int i = 1; i < letras.length; i++) {
			// condicional if -> comprobar si letra de la próxima posición del array es
			// igual a la almacenada en la variable letra
			if (letra != letras[i]) {
				System.out.println(letra + ": " + numVeces + " veces");
				letra = letras[i];
				numVeces = 1;
			} else {
				// incrementar en 1 el contador
				numVeces++;
			}
						
		}
		
		// mostrar ultima letra
		System.out.println(letra + ": " + numVeces + " veces");
		
		// cerrar scanner
		sc.close();


	}
}
