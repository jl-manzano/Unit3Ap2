package paquetestrings;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// array -> almacenar conj1
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		
		// array -> almacenar conj2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		
		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";
		
		// cadena para almacenar frase traducida
		String fraseCodificada = "";
		
		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			// pedir frase a usuario
			System.out.println("Introduzca una frase para codificarla: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());
		
		// bucle for -> codificar frase
		for (int i = 0; i < fraseUsuario.length(); i++) {
			
			// sumar y asignar caracter a caracter codificado a frase codificada
			fraseCodificada += codifica(conjunto1, conjunto2, fraseUsuario.charAt(i));
	
		}
		
		// mostrar frase codificada
		System.out.println("\nLa frase \"" + fraseUsuario + "\" codificada es: " + fraseCodificada);
		
		// cerrar scanner
		sc.close();
	}
	
	static char codifica(char conjunto1[], char conjunto2[], char c) {
		
		// inicializar carácter codificado a c en minúscula
		char charCoded = Character.toLowerCase(c);
		
		// pasar conjuntos a string
		String conj1Cad = String.valueOf(conjunto1);
		String conj2Cad = String.valueOf(conjunto2);
		
		// buscar en qué posición se encuentra charCoded en conj1
		int pos = conj1Cad.indexOf(charCoded);
		
		// si la posición >= 0, nos quedamos con esa posición para el conjunto2
		if (pos >= 0) {
			charCoded = conj2Cad.charAt(pos);
		}
		
		return charCoded;
		
	}

}


