package paquetestrings;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer16 {
	
	// crear clase random estática -> sea accesible desde cualquier parte del código
	static Random rand = new Random();

	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// variable para almacenar la palabra introducida por el primer jugador
		String palabra = "";
		
		// variable para almacenar la palabra desordenada
		String palabraDesordenada;
		
		// variable para almacenar la respuesta del jugador 2
		String respuesta = "";
		
		// crear array tipo char -> imprimir caracteres que acierte
		char[] tablaAciertos;
		
		System.out.println("ADIVINE LA PALABRA A PARTIR DE UN ANAGRAMA");
		
		// bucle while -> mientras que no se introduzca palabra - pedir palabra a jug1
		while (palabra.isEmpty()) {
			System.out.println("\nIntroduzca una palabra para hacer un anagrama: ");
			palabra = sc.nextLine();
		}
		
		// dar longitud del tamaño de la palabra al array
		tablaAciertos = new char[palabra.length()];
		
		// rellenar con metodo fill el array con asteriscos
		Arrays.fill(tablaAciertos, '*');
				
		// desordenar palabra introducida por jug1
		palabraDesordenada = desordenarString(palabra);
		
		// mostrar palabra desordenada en pantalla
		System.out.println("\n" + palabraDesordenada);
		
		// bucle while - no termine mientras que jug2 no adivine la palabra
		while (!respuesta.equals(palabra)) {
			System.out.println("\nIntente adivinar la palabra: ");
			respuesta = sc.nextLine();
			
			// comprobar que los caracteres coincidan y en caso de que si, guardar caracter en la posicion en cuestion del array
			for (int i = 0; i < palabra.length() && i < respuesta.length(); i++) {
				if (palabra.charAt(i) == respuesta.charAt(i)) {
					tablaAciertos[i] = palabra.charAt(i);
				}
			}
			
			// imprimir tabla
			System.out.println("\n" + String.valueOf(tablaAciertos));
			
		}
		
		// mostrar resultado pantalla
		System.out.println("\n¡Acertaste!");
				
		// cerrar scanner
		sc.close();
	}

	public static String desordenarString(String palabra) {
		
		// variable para almacenar num aleatorio
		int numAleat;
		
		// variable -> almacenar resultado de la palabra desordenada
		String result = "";
		
		// variable para almacenar la letra que voy a cambiar
		char letra = ' ';

		// convertir palabra a array de caracteres
		char[] fraseArray = palabra.toCharArray();
		
		// bucle for -> desordenar palabra
		for (int i = 0; i < fraseArray.length; i++) {
			
			// generar num aleatorio dentro del rango de la longitud del array
			numAleat = rand.nextInt(0, fraseArray.length);
			
			// asignar a variable letra la letra de la posición en cuestión del array
			letra = fraseArray[i];
			
			// modificar letra de la posición en cuestión del array por la letra en la posición aleatoria generada correspondiente del array 
			fraseArray[i] = fraseArray[numAleat];
			
			// modificar letra de la posición aleatoria generada del array por la letra en la posición anterior correspondiente del array que se almacenó en la variable letra
			fraseArray[numAleat] = letra;
		}
		
		// almacenar palabra desordenada
		result = String.valueOf(fraseArray);

		// devolver resultado
		return result;
	}
}
