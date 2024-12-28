package paquetestrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// cadena para almacenar la frase introducida por usuario
		String fraseUsuario = "";
		
		// cadena para almacenar fraseSinEspacios
		String fraseSinEspacios;
		
		// crear array -> almacenar letra a letra de la frase
		char[] fraseArray;
		
		// variable para almacenar letra a imprimir
		char letra;
		
		// variable para almacenar contador
		int cont = 1;
		
		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca una frase: ");
			fraseUsuario = sc.nextLine();

		} while (fraseUsuario.isEmpty());
		
		// eliminar espacios de la frase y guardar en variable fraseSinEspacios
		fraseSinEspacios = fraseUsuario.replace(" ", "").toLowerCase();
		
		// almacenar fraseSinEspacios letra a letra en array
		fraseArray = fraseSinEspacios.toCharArray();
		
		// ordenar array -> contar desde la 'a' / la más pequeña en codigo ascci contenida en la frase
		Arrays.sort(fraseArray);
		
		// asignar a letra, la letra mas pequeña en codigo ascii contenida en el array		
		letra = fraseArray[0];
		
		// recorrer array -> contar cuantas veces aparece cada letra
		for (int i = 1; i < fraseArray.length; i++) {
			if (letra != fraseArray[i]) {
				
				// imprimir letra y contador
				System.out.println(letra + ": " + cont + " veces.");
				
				// reiniciar cont
				cont = 1;
				
				// actualizar letra
				letra = fraseArray[i];
				
			} else {
				
				// incrementar letra
				cont++;
			}
		}
		
        // imprimir última letra dentro del bucle
        System.out.println(letra + ": " + cont + " veces.");
		
        // cerrar scanner
		sc.close();
		
	}
}
