package paquetestrings;

import java.util.Scanner;

public class Ejer19 {
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
		
		// variale -> almacenar frase convertida en nomenclatura Camel
		String convertidaACamel = "";
	
		// bucle for -> recorrer frase caracter a caracter y convertir en nomnclatura Camel
		for (int i = 0; i < frase.length(); i++) {
			
			// condicional if - else if - else -> convertir frase a nomenclatura Camel
			if (frase.charAt(i) == ' ') {
				continue;
			} else if (i != 0 && frase.charAt(i - 1) == ' ') {
				convertidaACamel += Character.toUpperCase(frase.charAt(i));
			} else {
				convertidaACamel += Character.toLowerCase(frase.charAt(i));
			}
		}
		
		// devolver frase convertida
		return convertidaACamel;
	}
}
