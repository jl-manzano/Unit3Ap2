package paquetestrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2v2 {
	public static void main(String[] args) {

		// crear scanner
		Scanner reader = new Scanner(System.in);
		
		// variable para introducir contraseña
		String passwd = "";
		
		// variable para almacenar intento de adivinar la contraseña
		String intento = "";
		
		// array para imprimir los caracteres que acierte
		char[] tablaAciertos;
		
		// variable -> almacenar si se ha adivinado o no la contraseña
		boolean adivinada = false;
		
		// pedir contraseña a usuario
		System.out.println("Introduzca la contraseña: ");
		passwd = reader.nextLine();
		
		// darle de longitud el tamaño de la contraseña al array
		tablaAciertos = new char[passwd.length()];
		
		// rellenar con método fill el array con asteriscos
		Arrays.fill(tablaAciertos, '*');
		
		// bucle while -> adivinar contraseña
		while (!adivinada) {
			
			// pedir a usuario el intento de adivinar contraseña
			System.out.println("Intente adivinar la contraseña:");
			intento = reader.nextLine();

			// comprobar que los caracteres coincidan y en caso de que si, guardar caracter en la posicion en cuestion del array
			for (int i = 0; i < passwd.length() && i < intento.length(); i++) {
				if (passwd.charAt(i) == intento.charAt(i)) {
					tablaAciertos[i] = passwd.charAt(i);
				}
			}

			// imprimir tabla
			System.out.println(String.valueOf(tablaAciertos));
			
			// condicional if -> comprobar si se ha adivinado la contraseña o no
			if (String.valueOf(tablaAciertos).equals(passwd)) {
				adivinada = false;
			}
		}
		
		// imprimir resultado
		System.out.println("Has acertado la contraseña!");
		
		// cerrar scanner
		reader.close();
	}
}