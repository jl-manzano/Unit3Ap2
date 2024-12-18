package paquetestrings;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";
		
		// array para almacenar palabra a palabra
		String palabras[];
		
		// cadena para almacenar frase traducida e inicializar como vacía
		String palabraMasLarga = null;
		
		// variable -> almacenar longitud palabra
		int longitud;
			
		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			
			System.out.println("PALABRA MÁS LARGA");
			
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());
		
		// almacenar palabra a palabra de la frase en array palabras
		palabras = fraseUsuario.split(" ");
		
		// almacenar longitud por defecto de la primera palabra almacenada en array
		longitud = palabras[0].length();

		
		// bucle for-each -> recorrer palabra a palabra del array palabras
		for (String palabra : palabras) {
			
			// comprobar si palabra almacenada en la posición en cuestión tiene mayor longitud que la máxima almacenada anteriormente
			if (palabra.length() > longitud) {
				
				// determinar palabra almacenada en la posición en cuestión como la más larga
				palabraMasLarga = palabra;
				
				// asignar longitud de la palabra almacenada en la posición en cuestión a la longitud mas larga
				longitud = palabra.length();
			}
		}
			
			// imprimir resultado
			System.out.println("\nPalabra más larga: " + palabraMasLarga);
			System.out.println("\nLongitud de la palabra " + palabraMasLarga + ": " + longitud + " caracteres.");
			
			// cerrar scanner
			sc.close();
		
	}
}
