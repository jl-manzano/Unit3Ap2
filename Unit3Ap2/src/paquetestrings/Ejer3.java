package paquetestrings;

import java.util.Scanner;

public class Ejer3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario;
		
		// variable -> almacenar num de espacios en la frase
		int numEspacios = 0;
		
		// pedir frase a usuario
		System.out.println("Introduzca una frase: ");
		fraseUsuario = sc.nextLine();
		
		// almacenar numEspacios que hay en la frase
		numEspacios = contarEspacios(fraseUsuario);
		
		// imprimir frase
		System.out.println("\nLa frase es: \"" + fraseUsuario + "\"");
		
		// imprimir resultado
		System.out.println("Número de espacios: " + numEspacios);
		
	}
	
	static int contarEspacios(String frase) {
		
		// variable para almacenar contador
		int cont = 0;
		
		// bucle for -> contar espacios en frase
		for (int i = 0; i < frase.length(); i++) {
			// condicional if -> comprobar caracter a caracter si es un espacio
			if (frase.charAt(i) == ' ') {
				// incrementar en 1 el contador
				cont++;
			}
		}
		
		// devolver num espacios
		return cont;
		
	}
	
}
