package paquetestrings2;

import java.util.Scanner;

public class Ejer10 {
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

		// bucle for -> codificar frase
		for (int i = 0; i < fraseUsuario.length(); i++) {
			fraseCodificada += codifica(conjunto1, conjunto2, fraseUsuario.charAt(i));
		}

		// mostrar resultado
		System.out.println("\nLa frase \"" + fraseUsuario + "\" codificada es: \n" + fraseCodificada);

		// cerrar scanner
		sc.close();

	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {
		// variable para almacenar el caracter a codificar
		char charCoded = Character.toLowerCase(c);

		// pasar a String el conjunto1
		String conj1Cad = String.valueOf(conjunto1);

		// pasar a String el conjunto2
		String conj2Cad = String.valueOf(conjunto2);

		// variable para almacenar la posicion en la que se encuentra el caracter en el
		// conj1
		int pos = conj1Cad.indexOf(charCoded);

		// condicional if -> determinar si cambiar letra / no, debido a que la letra no
		// se encuentra contenida en el conj1
		if (pos >= 0) {
			charCoded = conj2Cad.charAt(pos);
		}

		// devolver caracter codificado
		return charCoded;
	}

}
