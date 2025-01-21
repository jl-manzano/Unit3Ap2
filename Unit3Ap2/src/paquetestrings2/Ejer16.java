package paquetestrings2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer16 {
	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";

		// cadena para almacenar la frase introducida por usuario
		String respuesta = "";
		
		// cadena para almacenar frase traducida
		String anagrama = "";
		
		// variable para pasar cadena a array de caracteres
		char[] adivinar;

		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			// pedir frase a usuario
			System.out.println("Introduzca una palabra / frase para hacer un anagrama: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());
		
		anagrama = desordenarPalabra(fraseUsuario);
		
		adivinar = new char[fraseUsuario.length()];
		
		Arrays.fill(adivinar, '*');

		// bucle while - no termine mientras que jug2 no adivine la palabra
		while (!fraseUsuario.equals(respuesta)) {
			System.out.println("\nIntente adivinar la palabra: \n" + anagrama);
			respuesta = sc.nextLine();
			
			for (int i = 0; i < fraseUsuario.length() && i < respuesta.length(); i++) {
				if (respuesta.charAt(i) == fraseUsuario.charAt(i)) {
					adivinar[i] = fraseUsuario.charAt(i);
				}
				
			}
			
			System.out.println(String.valueOf(adivinar));

		}

		// mostrar resultado pantalla
		System.out.println("\n¡Acertaste!");
		
		// cerrar scanner
		sc.close();

	}

	static String desordenarPalabra(String palabra) {

		// crear clase random
		Random rand = new Random();

		// pasar cadena a array de caracteres
		char[] array = palabra.toCharArray();

		// variable para almacenar letra de la posición modificada
		char letra;

		// variable para almacenar posición aleatoria generada
		int aleat;

		// bucle for -> desordenadar caracteres de la palabra
		for (int i = 0; i < palabra.length(); i++) {
			aleat = rand.nextInt(palabra.length() - 1);
			letra = array[i];
			array[i] = array[aleat];
			array[aleat] = letra;
		}

		// devolver palabraDesordenada
		return String.valueOf(array);
	}
}
