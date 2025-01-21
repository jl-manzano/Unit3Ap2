package paquetestrings2;

import java.util.Scanner;

public class Ejer10v2 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// array -> almacenar conj1
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// array -> almacenar conj2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// variable para almacenar fraseUsuario
		String fraseUsuario = "";

		// variable para almacenar fraseUsuario codificada
		String fraseCodificada = "";

		// bucle do-while -> asegurar que usuario introduzca una frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());
		
		// bucle for -> codificar la frase caracter a caracter
		for (int i = 0; i < fraseUsuario.length(); i++) {
			fraseCodificada += codifica(conjunto1, conjunto2, fraseUsuario.charAt(i));
		}
		
		System.out.println("\nFrase codificada: \n" + fraseCodificada);
		
		// cerrar scanner
		sc.close();
		
	}
	
	static char codifica(char conjunto1[],char conjunto2[], char c) {
		// variable para almacenar el carácter a devolver
		char charCoded = Character.toLowerCase(c);
		
		// almacenar en cadena array de caracteres
		String conj1Cad = String.valueOf(conjunto1);

		// almacenar en cadena array de caracteres
		String conj2Cad = String.valueOf(conjunto2);
		
		// determinar posicion del caracter en cuestión en el array (pasado a cadena)
		int pos = conj1Cad.indexOf(charCoded);
		
		// condicional if -> comparar si caracter se encuentra en el array de caracteres -> codificarlo o no
		if (pos >= 0 ) {
			charCoded = conj2Cad.charAt(pos);
		}
		
		// devolver caracter codificado
		return charCoded;
		
	}

}
