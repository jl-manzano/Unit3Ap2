package paquetestrings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalabrasEncadenadas {

	static Scanner reader = new Scanner(System.in); // Scanner para leer entrada del usuario
	static String ultimaPalabra; // La última palabra jugada
	static int turno = 1; // Comienza con el jugador 1

	public static void main(String[] args) {
		boolean juegoActivo = true; // Controlar si el juego sigue activo
		boolean esPrimeraPalabra = true; // Controlar primera palabra del juego introducida

		System.out.println("Bienvenido al juego de las palabras encadenadas.");
		System.out.println("Reglas: Cada palabra debe empezar con la última letra de la palabra anterior.");
		System.out.println("Escribe 'FIN' para terminar el turno.");

        while (juegoActivo) {
            // Si es la primera palabra, la pedimos directamente
            if (esPrimeraPalabra) {
                System.out.print("\nJugador " + turno + ", introduce la primera palabra: ");
                ultimaPalabra = reader.nextLine();
                cambiarTurno();
                esPrimeraPalabra = false; // Ahora pasamos al flujo normal del juego
            }

            // Mostrar el menú y gestionar las opciones
            int opcion = menu();

            switch (opcion) {
                case 1 -> {
                    System.out.print("\nJugador " + turno + ", introduce una palabra: ");
                    String nuevaPalabra = reader.nextLine();

                    if (nuevaPalabra.equalsIgnoreCase("FIN")) {
                        juegoActivo = false;
                        System.out.println("Juego terminado por el jugador.");
                    } else if (esValida(ultimaPalabra, nuevaPalabra)) {
                        ultimaPalabra = nuevaPalabra;
                        System.out.println("¡Palabra aceptada!");
                        cambiarTurno();
                    } else {
                        System.out.println("Palabra no válida. Debe empezar con la letra: "
                                + ultimaPalabra.substring(ultimaPalabra.length() - 1).toLowerCase());
                    }
                }
                case 2 -> System.out.println("Última palabra jugada: " + ultimaPalabra);
                case 3 -> {
                    juegoActivo = false;
                    System.out.println("¡Gracias por jugar a las palabras encadenadas!");
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

	/**
	 * Muestra el menú del juego y devuelve la opción seleccionada por el usuario.
	 */
	static int menu() {
		System.out.println("\nMenú del juego:");
		System.out.println("1. Introducir una nueva palabra.");
		System.out.println("2. Mostrar la última palabra jugada.");
		System.out.println("3. Finalizar el juego.");
		System.out.print("\nSelecciona una opción: ");

		int opcion = 0;

		assert opcion > 0 && opcion < 3 : "Por favor, introduce un número válido.";

		// Validar entrada del usuario
		do {
			try {
				opcion = reader.nextInt();
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Por favor, introduce un número entero entre 1 y 3 'inclusive'.");
			} finally {
				reader.nextLine();
			}
		} while (opcion < 1 || opcion > 3);

		return opcion;
	}

	/**
	 * Comprueba si la nueva palabra es válida según las reglas del juego.
	 */
	static boolean esValida(String anterior, String nueva) {
		// variable para almacenar booleano
		boolean valida;

		// comprobar que palabra nueva comienza por la última letra de la palabra
		// anterior
		valida = nueva.toLowerCase().startsWith(anterior.substring(anterior.length() - 1).toLowerCase());

		return valida;
	}

	/**
	 * Cambia el turno entre jugador 1 y jugador 2.
	 */
	static void cambiarTurno() {
		turno = (turno == 1) ? 2 : 1; // Alternar entre 1 y 2
	}
}
