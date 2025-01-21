package paquetestrings2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer13v2 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// variable para almacenar palabra1
		String palabra1 = "";

		// variable para almacenar palabra2
		String palabra2 = "";
		
		// variable para almacenar booleano
		boolean areAnagramas;

		// bucle do-while -> asegurar que usuario introduzca una frase y una palabra
		do {
			// pedir palabra a usuario
			System.out.println("\nIntroduzca una palabra a buscar en la frase: ");
			palabra1 = sc.nextLine();

			// pedir palabra a usuario
			System.out.println("\nIntroduzca una palabra a buscar en la frase: ");
			palabra2 = sc.nextLine();

		} while (palabra1.isEmpty() && palabra2.isEmpty());
		
		areAnagramas = sonAnagramas(palabra1, palabra2);
		
		// condicional if - else -> imprimir resultado
		if (areAnagramas) {
			System.out.println("\nLas palabras " + palabra1 + " y " + palabra2 + " son anagramas.");
		} else {
			System.out.println("\nLas palabras " + palabra1 + " y " + palabra2 + " NO son anagramas.");
		}
		
		
		// cerrar scanner
		sc.close();
	}
	
	static boolean sonAnagramas(String palabra1, String palabra2) {
		
		// variable para almacenar booleano
		boolean sonAnagrama;
		
		// pasar de cadena a array de caracteres
		char [] word1 = palabra1.toCharArray();

		// pasar de cadena a array de caracteres
		char [] word2 = palabra2.toCharArray();
		
		// ordenar arrays
		Arrays.sort(word1);
		Arrays.sort(word2);

		// comparar arrays -> determinar si son anagramas / no
		sonAnagrama = Arrays.equals(word1, word2);
		
		// devolver resultdo
		return sonAnagrama;
		
	}

	
}
