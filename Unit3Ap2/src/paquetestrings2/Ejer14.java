package paquetestrings2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// variable -> almacenar frase introducida por usuario
		String fraseUsuario = "";

		// variable para almacenar letra
		char letra;

		// variable para almacenar frase sin espacios
		String fraseSinEspacios = "";

		// crear array tipo char -> pasar fraseSinEspacios a tabla
		char[] letras;

		// variable para almacenar contador
		int contador = 1;

		// bucle do-while -> asegurar que usuario introduzca una frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());

		// suprimir espacios de frase
		fraseSinEspacios = fraseUsuario.replace(" ", "").toLowerCase();

		// pasar fraseSinEspacios a tabla tipo 'char'
		letras = fraseSinEspacios.toCharArray();

		// ordenar array
		Arrays.sort(letras);

		// asignar a letra, la letra mas pequeña (se encuentra en la 1ª pos del array)
		letra = letras[0];

		for (int i = 1; i < letras.length; i++) {
			// condicional if - else -> mostrar letras y cúantas veces se repite cada una en
			// la frase
			if (letra != letras[i]) {
				// si la letra en la próxima posición del array no es igual, imprime el mensaje
				// final con las veces que se repite la letra en la frase
				System.out.println(letra + ": " + contador + " veces");

				// reinicia el contador a 1
				contador = 1;

				// y asigna a letra la letra contenida en la próima posición del array
				letra = letras[i];

			} else {
				// si la letra en la próxima posición del array es igual a la actual almacenada
				// en 'letra', se incrementa el contador, hasta que la letra en la posición
				// consecutiva / próxima del array sea distinta
				contador++;
			}
		}

		// imprimir última letra dentro del bucle
		System.out.println(letra + ": " + contador + " veces.");

		// cerrar scanner
		sc.close();
	}
}
