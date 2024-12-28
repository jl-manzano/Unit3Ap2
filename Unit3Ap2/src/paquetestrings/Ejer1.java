package paquetestrings;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear string -> almacenar frase 1
		String frase1;

		// crear string -> almacenar frase 2
		String frase2;

		// bucle do-while -> asegurar de que usuario introduzca una frase o, al menos un caracter
		do {
		// pedir a usuario frase 1 por teclado
		System.out.println("Introduzca la frase 1: ");

		// leer frase introducida por teclado
		frase1 = sc.nextLine();

		// pedir a usuario frase 2 por teclado
		System.out.println("Introduzca la frase 2: ");

		// leer frase introducida por teclado
		frase2 = sc.nextLine();
		
		} while (frase1.isEmpty() && frase2.isEmpty());
		
		// condicional if-else if-else -> determinar cuál frase es más corta o si son iguales en cuánto a caracteres
		if (frase1.length() < frase2.length()) {
			System.out.println("La frase 1 'invocante' es más corta que la frase 2.");
		} else if (frase1.length() > frase2.length()) {
			System.out.println("La frase 2 es más corta que la frase 1.");
		} else {
			System.out.println("Ambas frases son iguales en cuánto a caracteres.");

		}
		
		// cerrar scanner
		sc.close();

	}
}
