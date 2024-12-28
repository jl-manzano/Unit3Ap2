package paquetestrings;

import java.util.Scanner;

public class Ejer19v3 {
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
		
		// variable para almacenar booleano
		boolean esPrimeraPalabra = true;
	
		// bucle for - each -> recorrer frase caracter a caracter y convertir en nomnclatura Camel; se guarda en una variable cada palabra del array y trabajar con ella
		for (String palabra: palabras) {
			
			// condicional if - else -> convertir frase a nomenclatura Camel
			// si es la primera palabra - todo minúscula
			if (esPrimeraPalabra) {
				convertidaACamel += palabra.toLowerCase();
				
				// cambiar a false esPrimeraPalabra
				esPrimeraPalabra = false;
				
             // para demás palabras -> primera letra en mayúscula y el resto en minúscula
			} else {
				convertidaACamel += palabra.substring(0, 1).toUpperCase();
				convertidaACamel += palabra.substring(1).toLowerCase();

			}
		}
		
		// devolver frase convertida
		return convertidaACamel;
	}
}
