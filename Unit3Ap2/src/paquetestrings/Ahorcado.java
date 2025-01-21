package paquetestrings;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

// Creamos el scanner
	static Scanner reader = new Scanner(System.in);

// Creamos el array de cadenas que almacenara las palabras posibles del juego
	static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

// Creamos la variable numintentos que almacenara el numero de intentos de los que dispondra el usuario
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

// Creamos la variable letra para almacenar la letra a buscar que introduzca el usuario
		char letra = 0;

// Creamos la variable numeroIntentos y la igualamos a la constante numintentos
		int numeroIntentos = NUMINTENTOS;

// Creamos la variable palabraResolver para almacenar la palabra para resolver que introduzca el usuario
		String palabraResolver = "";

// Generamos la palabra a adivinar
		generaPalabra();

// Mientras el jugador no haya acertado la palabra y tenga intentos restantes
		while (palabraPista != palabraSecreta && numeroIntentos > 0) {

// Imprimimos un delimitador
			System.out.println("-----------------------");

// Imprimimos el menu y almacenamos la opcion introducida por el usuario
			opcion = menu();

// Opciones del menu
			switch (opcion) {

// Si el jugador elige la opcion 1
			case 1 -> {

// Pedimos una letra al usuario
				System.out.println("Introduzca una letra: ");
				letra = reader.next().charAt(0);

// Comprobamos si la letra esta en la palabra o no
				compruebaLetra(letra);

// Si la letra no se encuentra en la palabra decrementamos los intentos
				if (!palabraSecreta.contains(String.valueOf(letra))) {
					numeroIntentos--;
				}
			}

// Si el jugador elige la opcion 2
			case 2 -> {

// Limpiamos el buffer del scanner
				reader.nextLine();

// Pedimos una palabra al usuario
				System.out.println("Introduzca una palabra: ");

// Leemos la palabra introducida por el usuario
				palabraResolver = reader.nextLine();

// Comprobamos si ha resuelto correctamente o no
				compruebaPalabra(palabraResolver);

// Si no ha resuelto correctamente decrementamos el numero de intentos
				if (!palabraResolver.equals(palabraPista)) {
					numeroIntentos--;
				}
			}

// Si introduce otro numero se le vuelve a mostrar el menu
			default -> {
				System.err.println("Opción no válida");
				opcion = menu();
			}
			}

// Imprimimos la pista
			pintaPista();

// Mostramos el numero de intentos restantes
			System.out.println("Número de intentos restantes -> " + numeroIntentos);
		}

// Salto de linea
		System.out.println();

// Si el jugador ha acertado la palabra le damos la enhorabuena
		if (palabraSecreta.equalsIgnoreCase(palabraPista)) {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
		}

// Si el jugador se ha quedado sin intentos
		if (numeroIntentos == 0) {
			System.err.println("GAME OVER");
		}
	}

// Función para seleccionar aleatoriamente la palabra con la que vamos a jugar
	static void generaPalabra() {

// Creamos la clase random
		Random rand = new Random();

// Generamos un numero random para seleccionar aleatoriamente la palabra y lo almacenamos en la variable posRandom
		int posRandom = rand.nextInt(0, palabras.length);

// Asignamos a la palabraSecreta la cadena de la posicion aleatoria
		palabraSecreta = palabras[posRandom];

// Una vez que se ha seleccionado la palabra damos valor a palabraPista
		for (int i = 0; i < palabraSecreta.length(); i++) {
			palabraPista += "*";
		}
	}

// Función para pintar el menú y almacenar la opcion seleccionada
	static int menu() {

// Creamos la variable opcion para almacenar la opcion introducida por el usuario
		int opcion = 0;

// Pintamos el menu
		System.out.println("Seleccione una de las siguientes opciones: ");
		System.out.println("1. Introducir letra");
		System.out.println("2. Introducir palabra");

// Leemos la opcion seleccionada por el usuario
		opcion = reader.nextInt();

// Devolvemos la opcion seleccionada
		return opcion;
	}

// Función para comprobar si la letra se encuentra en la palabra a acertar
	static void compruebaLetra(char letra) {

// Pasamos la letra recibida a minuscula
		letra = Character.toLowerCase(letra);

// Creamos la variable pos para almacenar el resultado de la busqueda
		int pos = palabraSecreta.indexOf(letra);

// Si la letra no se encuentra en la palabra la añadimos a no acertadas
		if (pos < 0) {
			noAcertadas += letra;

// Si la letra se encuentra en la palabra
		} else {

// Mientras siga encontrando la letra
			while (pos >= 0) {

// Actualizamos palabraPista y machacamos la posicion
				palabraPista = palabraPista.substring(0, pos) + letra + palabraPista.substring(pos + 1);
				pos = palabraSecreta.indexOf(letra, pos + 1);
			}
		}
	}

// Función para comprobar si el jugador ha resuelto correctamente o no
	static void compruebaPalabra(String palabra) {

// Si la palabra recibida coincide con la palabra a acertar
		if (palabra.equalsIgnoreCase(palabraSecreta)) {
			palabraPista = palabraSecreta;
		}
	}

// Función para para pintar la pista y las letras no acertadas
	static void pintaPista() {

// Imprimimos la palabra pista
		System.out.println(palabraPista);

// Imprimimos las letras no acertadas
		System.out.println("Letras no acertadas -> " + noAcertadas);
	}

}