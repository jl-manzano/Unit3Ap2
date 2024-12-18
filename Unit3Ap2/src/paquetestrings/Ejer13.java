package paquetestrings;

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
		
		// variable -> almacenar booleano
		boolean sonAnagramas = true;
		
		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			
			System.out.println("¿SON ANAGRAMAS?");
			
			// pedir frase a usuario
			System.out.println("\nIntroduzca una palabra: ");
			palabra1 = sc.nextLine().toLowerCase();
			
			System.out.println("\nIntroduzca otra palabra: ");
			palabra2 = sc.nextLine().toLowerCase();

		} while (palabra1.isEmpty() && palabra2.isEmpty());
		
		// llamar a función -> comprobar si son anagramas y almacenarlo en el booleano
		sonAnagramas = sonAnagramas(palabra1, palabra2);
		
		// condicional if - else -> imprimir resultado
		if (sonAnagramas) {
			System.out.println("\nLas palabras " + palabra1 + " y " + palabra2 + " son anagramas.");
		} else {
			System.out.println("\nLas palabras " + palabra1 + " y " + palabra2 + " NO son anagramas.");
		}
		
		// cerrar scanner
		sc.close();
		
	}
	
	static boolean sonAnagramas(String palabra1, String palabra2) {
		
		// variable -> almacenar booleano
		boolean anagrama = false;
		
		// condicional if -> comprobar si ambas palabras tienen la misma longitud de caracteres
		if (palabra1.length() == palabra2.length()) {
			
	        // convertir las palabras en arrays de caracteres y ordenarlos
	        char[] array1 = palabra1.toCharArray();
	        char[] array2 = palabra2.toCharArray();
	        
	        // ordenar arrays
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	        
	        // comprobar si ambos arrays son iguales y asignar booleano
	        anagrama = Arrays.equals(array1, array2);
	        
		}

		// devolver booleano
		return anagrama;
	}
}
