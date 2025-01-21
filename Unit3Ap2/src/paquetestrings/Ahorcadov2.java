package paquetestrings;

import java.util.Random;
import java.util.Scanner;

public class Ahorcadov2 {

	// Creamos el scanner
	static Scanner reader = new Scanner(System.in);

	// Creamos el array de cadenas que almacenara las palabras posibles del juego
	static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	// Creamos la variable numintentos que almacenara el numero de intentos de los
	// que dispondra el usuario
	static final int NUMINTENTOS = 7;

	// Creamos la variable palabraSecreta que almacenara la palabra a resolver
	static String palabraSecreta;

	// Creamos la variable palabraPista que ira almacenando la pista para el jugador
	static String palabraPista = "";

	// Creamos la variable noAcertadas que ira almacenando las letras erroneas
	static String noAcertadas = "";

	// Main
	public static void main(String[] args) {

		// Creamos la variable opcion para almacenar el resultado de la funcion menu
		int opcion;

		// Creamos la variable letra para almacenar la letra a buscar que introduzca el
		// usuario
		char letra = ' ';

		// Creamos la variable numeroIntentos y la igualamos a la constante numintentos
		int numeroIntentos = NUMINTENTOS;

		// Creamos la variable palabraResolver para almacenar la palabra para resolver
		// que introduzca el usuario
		String palabraResolver = "";

		// generar palabra
		generaPalabra();

		// imprimir pista
		pintaPista();

		// bucle while -> controlar que mientras jugador no haya acertado la palabra y
		// tenga intentos restantes, el bucle continúa
		while (!palabraPista.equals(palabraSecreta) && numeroIntentos > 0) {

			// almacenar opcion introducida por usuario llamando a funcion menu
			opcion = menu();

			// condicional switch -> determinar opcion introducida por usuario
			switch (opcion) {
			case 1 -> {
				// pedir letra a usuario
				do {
					System.out.println("\nIntroduzca una letra: ");
					letra = reader.next().charAt(0);
				} while (letra == ' ');

				// llamar a funcion compruebaLetra
				compruebaLetra(letra);

				// condicional if -> verificar mediante el método contains si la letra se
				// encuentra en la palabra y devuelva booleano
				if (!palabraSecreta.contains(String.valueOf(letra).toLowerCase())) {
					numeroIntentos--; // decrementar en 1 el nº intentos
				}

			}
			case 2 -> {
				
				// limpiar buffer scanner
				reader.nextLine();
				
				// pedir letra a usuario
				do {
					System.out.println("\nIntroduzca una palabra: ");
					palabraResolver = reader.nextLine();
				} while (palabraResolver.isEmpty());

				// llamar a funcion compruebaLetra
				compruebaPalabra(palabraResolver);

				// condicional if -> verificar mediante el método contains si la palabra no es
				// igual a la palabra secreta
				if (!palabraResolver.equals(palabraSecreta)) {
					numeroIntentos--; // decrementar en 1 el nº intentos
				}
			}
			default -> {
				opcion = menu();
			}
			}
			
			// imprimir pista
			pintaPista();
			
			System.out.println("\nNº de intentos restantes: " + numeroIntentos + "\n");
		}
		
		// condicional if -> comprobar si jugador ha ganado
		if (palabraSecreta.equals(palabraPista)) {
			System.out.println("ENHORABUENA!! HAS ACERTADO LA PALABRA");
		}
		
		// condicional if -> comprobar si jugador ha agotado los intentos
		if (numeroIntentos == 0) {
			System.err.println("GAME OVER");
		}


	}

	// Función para seleccionar aleatoriamente la palabra con la que vamos a jugar
	static void generaPalabra() {
		// crear clase random
		Random rand = new Random();

		// variable -> almacenar numAleatorio
		int numAleat = rand.nextInt(palabras.length);

		// asignar a variable palabraSecreta el valor contenido en la posición en
		// cuestión del array
		palabraSecreta = palabras[numAleat];

		// bucle for -> definir palabraPista con * -> se vaya desvelando letras
		// coincidentes en la posición de la palabra introducida por el usuario ->
		// adivinar
		for (int i = 0; i < palabraSecreta.length(); i++) {
			palabraPista += "*";
		}

	}

	// Función para pintar el menú y almacenar la opcion seleccionada
	static int menu() {

		// variable para almacenar opcion
		int opcion;

		do {
			// Pintamos el menu
			System.out.println("Seleccione una de las siguientes opciones: ");
			System.out.println("1. Introducir letra");
			System.out.println("2. Introducir palabra");

			opcion = reader.nextInt();

		} while (opcion != 1 && opcion != 2);

		return opcion;

	}

	// Función para comprobar si la letra se encuentra en la palabra a acertar
	static void compruebaLetra(char letra) {
		// variable -> almacenar letra en minuscula
		letra = Character.toLowerCase(letra);

		// variable pos -> almacenar posición en que se encuentra caracter introducido
		// en palabra / -1
		int pos = palabraSecreta.indexOf(letra);

		// condicional if -> comprobar si letra se encuentra en palabra / no
		if (pos < 0) {
			noAcertadas += letra;
		} else {
			// bucle while -> determinar si letra se encuentra en palabra y añadirla
			while (pos >= 0) {
				palabraPista = palabraPista.substring(0, pos) + letra + palabraPista.substring(pos + 1);
				pos = palabraSecreta.indexOf(letra, pos + 1);
			}
		}

	}

	// Función para comprobar si el jugador ha resuelto correctamente o no
	static void compruebaPalabra(String palabra) {
		// condicional if -> comprobar si palabra introducida es igual a la secreta (a
		// adivinar)
		if (palabra.equals(palabraSecreta)) {
			palabraPista = palabraSecreta;
		}
	}

	// Función para para pintar la pista y las letras no acertadas
	static void pintaPista() {
		// imprimir palabraPista
		System.out.println(palabraPista);

		// imprimir num intentos restantes
		System.out.println("\nLetras no acertadas: ");
		for (int i = 0; i < noAcertadas.length(); i++) {
			System.out.print("\t" + noAcertadas.charAt(i));
		}

	}

}
