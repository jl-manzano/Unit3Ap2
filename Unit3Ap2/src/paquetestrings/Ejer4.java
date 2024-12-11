package paquetestrings;

import java.util.Scanner;

public class Ejer4 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario;
		
		// cadena para almacenar la frase introducida por usuario invertida
		String fraseInvertida;
		
		// pedir frase a usuario
		System.out.println("Introduzca una frase: ");
		fraseUsuario = sc.nextLine();
		
		// almacenar resultado de invertir la frase
		fraseInvertida = invertirFrase(fraseUsuario);
		
		// imprimir resultado en pantalla
		System.out.println("La frase \"" + fraseUsuario + "\" invertida es: \n" + fraseInvertida);
		
	}
	
	static String invertirFrase(String frase) {
		
		// variable para almacenar frase pasada como parámetro invertida
		String fraseInvertida = "";
		
		// bucle for -> invertir la frase
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInvertida += frase.charAt(i);
		}
		
		// devolver frase invertida
		return fraseInvertida;
	}
	

	
}
