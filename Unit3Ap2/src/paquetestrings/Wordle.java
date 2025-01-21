package paquetestrings;

import java.util.Random;
import java.util.Scanner;

public class Wordle {

	// Arreglo de palabras de 5 letras
	static String[] palabras = { "perro", "gatos", "niños", "cielo", "rueda" };
	static final int INTENTOS_MAX = 6;

	public static void main(String[] args) {
		// Seleccionar palabra aleatoria
		String palabraSecreta = seleccionarPalabra();
		Scanner sc = new Scanner(System.in);
		boolean adivinada = false;
		int intentos = 0;

		System.out.println("¡Bienvenido al juego de Wordle en español!");
		System.out.println("Debes adivinar la palabra secreta de 5 letras.");
		System.out.println("Tienes 6 intentos. ¡Buena suerte!");

		while (intentos < INTENTOS_MAX && !adivinada) {
			System.out.print("\nIntroduce una palabra de 5 letras: ");
			String palabraUsuario = sc.nextLine().toLowerCase();

			// Validar longitud de palabra
			do {
				System.out.println("La palabra debe tener exactamente 5 letras.");
			} while (palabraUsuario.length() != 5);

			// Verificar la palabra y mostrar el resultado
			String resultado = verificarPalabra(palabraSecreta, palabraUsuario);
			System.out.println("Resultado: " + resultado);

			// Verificar si ha adivinado la palabra
			if (resultado.equals(palabraSecreta)) {
				adivinada = true;
				System.out.println("¡Felicidades! Has adivinado la palabra.");
			} else {
				intentos++;
				System.out.println("Intentos restantes: " + (INTENTOS_MAX - intentos));
			}
		}

		if (!adivinada) {
			System.out.println("Lo siento, te has quedado sin intentos. La palabra era: " + palabraSecreta);
		}
		sc.close();
	}

	static String seleccionarPalabra() {
		Random rand = new Random();
		return palabras[rand.nextInt(palabras.length)];
	}

	static String verificarPalabra(String palabraSecreta, String palabraUsuario) {
		char[] resultado = new char[5];
		for (int i = 0; i < 5; i++) {
			if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)) {
				resultado[i] = palabraUsuario.charAt(i);
			} else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))) {
				resultado[i] = '*';
			} else {
				resultado[i] = '_';
			}
		}
		return new String(resultado);
	}
}
