package paquetestrings;

import java.util.Scanner;

public class Ejer19v2 {
	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// variable para almacenar frase
		String frase;
		
		// variable para almacenar la frase con nomenclatura Camel
		String fraseEnNomenclatura;

		// bucle do-while -> asegurar que usuario introduzca frase
		do {
			// pedir sentencia a usuario
			System.out.println("Introduzca una frase: ");
			frase = sc.nextLine();

		} while (frase.isEmpty());
		
		// llamar a funcion y almacenar frase convertida a nomenclatura Camel en variable
		fraseEnNomenclatura = convertirANomenclaturaCamel(frase);
		
		// mostrar resultado
		System.out.println("\n" + fraseEnNomenclatura);
		
		// cerrar scanner
		sc.close();
	
	}
	
	static String convertirANomenclaturaCamel(String frase) {
		
		// convertir palabra a palabra de la frase y almacenar en array mediante metodo split
		String[] palabras = frase.split(" ");
		
		// variale -> almacenar frase convertida en nomenclatura Camel
		String convertidaACamel = "";
	
		// bucle for -> recorrer frase caracter a caracter y convertir en nomnclatura Camel
		for (int i = 0; i < palabras.length; i++) {
			
			// tambien se podría guardar en una variable cada palabra del array y trabajar con ella
			
	        // Guardar la palabra actual en una variable
			// String palabra = palabras[i];

	        // Condicional para manejar la primera palabra y las demás
			// if (i == 0) {
				// Primera palabra: todo en minúsculas
				// convertidaACamel += palabra.toLowerCase();
			// } else {
	        	// Resto de las palabras: primera letra mayúscula, resto minúsculas
	        	// String primeraLetraMayuscula = palabra.substring(0, 1).toUpperCase();
          		// String restoMinusculas = palabra.substring(1).toLowerCase();
	        	// convertidaACamel += primeraLetraMayuscula + restoMinusculas;
//	        }
//	    }
			
			// condicional if - else -> convertir frase a nomenclatura Camel
			// si es la primera palabra - todo minúscula
			if (i == 0) {
				convertidaACamel += palabras[i].toLowerCase();
			
             // para demás palabras -> primera letra en mayúscula y el resto en minúscula
			} else {
				convertidaACamel += palabras[i].substring(0, 1).toUpperCase();
				convertidaACamel += palabras[i].substring(1).toLowerCase();

			}
		}
		
		// devolver frase convertida
		return convertidaACamel;
	}
}
