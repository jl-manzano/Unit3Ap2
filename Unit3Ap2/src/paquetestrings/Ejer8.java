package paquetestrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";

		// array para almacenar palabra a palabra
		String palabras[];

		System.out.println("ORDENAR ALFABÉTICAMENTE PALABRAS");

		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());

		// descomponer cadena en partes con separador " "
		palabras = fraseUsuario.split(" ");

		// ordenar alfabéticamente array con palabras
		Arrays.sort(palabras);

		// mostrar resultado
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(i+1 + ". " + palabras[i] + "\n");
			
		}
		
		// cerrar scanner
		sc.close();

	}
}
