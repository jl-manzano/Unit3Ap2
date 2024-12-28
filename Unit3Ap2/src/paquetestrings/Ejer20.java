package paquetestrings;

import java.util.Scanner;

public class Ejer20 {
	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// variable para almacenar palabra
		String palabra;
		
		// variable para almacenar longitud en la que dividir la palabra en trozos
		int longitud;
		
		// crear array -> almacenar resultado
		String[] resultado;
		
		// bucle do-while -> asegurar que usuario introduzca palabra
		do {
			// pedir frase a usuario
			System.out.println("Introduzca una palabra: ");
			palabra = sc.nextLine();

		} while (palabra.isEmpty());
		
		// bucle do-while -> asegurar que usuario introduzca longitud de trozos a dividir la palabra
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca la longitud de trozos a dividir la palabra: ");
			longitud = sc.nextInt();

		} while (longitud <= 0);
		
        // llamar a la función y almacenar resultado
        resultado = dividirEnSecuencias(palabra, longitud);
        
        // salto de línea
        System.out.println();
        
        // bucle for-each -> mostrar resultado
        for (String secuencia : resultado) {
            System.out.print(secuencia + "\t");
        }
        
        // cerrar scanner
        sc.close();
	}
	
    public static String[] dividirEnSecuencias(String palabra, int n) {
        
    	// crear array -> almacenar cada secuencia
    	String secuencias[];
    	
    	// calcular el número de secuencias (método ceil de Clase Math -> redondear hacia arriba)
        // es necesario hacer casteo (double) debido a que independientemente de que Math.ceil devuelva un double, el resultado de la division de 2 numeros enteros es truncada a un entero
    	int totalSecuencias = (int) Math.ceil( (double) palabra.length() / n);
        
        // dar longitud del número de secuencias resultante
        secuencias = new String[totalSecuencias];

        // Rellenar el array con las secuencias
        for (int i = 0; i < totalSecuencias; i++) {
            
        	// calculaar posición inicio de cada secuencia
        	int inicio = i * n;
        	
        	// calcular posición final de cada secuencia (uso de Math.min para no acceder a indices fuera del rango de la palabra)
            int fin = Math.min(inicio + n, palabra.length());
            
            // almacenará cada secuencia en la posición en cuestión correspondiente del array
            secuencias[i] = palabra.substring(inicio, fin);
        }

        // devolver array secuencias
        return secuencias;
    }

}
