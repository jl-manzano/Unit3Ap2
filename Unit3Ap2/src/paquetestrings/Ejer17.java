package paquetestrings;

import java.util.Scanner;

public class Ejer17 {
	public static void main(String[] args) {
	
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// variable para almacenar la sentencia en C introducida por el usuario
		String sentencia;
		
		// variable para almacenar la sentencia en C sin comentarios
		String sentenciaSinComentarios;

		// bucle do-while -> asegurar que usuario introduzca sentencia
		do {
			// pedir sentencia a usuario
			System.out.println("Introduzca una sentencia en C: ");
			sentencia = sc.nextLine();

		} while (sentencia.isEmpty());
		
		// llamar a funcion y almacenar en sentenciaSinComentarios
		sentenciaSinComentarios = quitarComentarios(sentencia);
		
		// mostrar resultado
		System.out.println("\nSentencia sin comentarios: " + sentenciaSinComentarios);
		
	}
	
	static String quitarComentarios(String sentenciaC) {
		
		// constantes -> almacenar inicio y fin comentarios
		final String INICIO = "/*";
		final String FIN = "*/";
		
		// variable -> almacenar sentencia a devolver
		String sentenciaSinComentarios = "";
		
		// variable posInicio -> almacenar posición apertura del comentario en C
		int posInicio = sentenciaC.indexOf(INICIO);
		
		// variable posInicio -> almacenar posición cierre del comentario en C
		int posFin = 0;
		
		// bucle while -> eliminar comentarios de cadena
		while (posInicio >= 0) {
			// almacena en sentenciaSinComentarios el código desde donde terminó el último comentario posFin hasta donde comienza el siguiente comentario posInicio
			sentenciaSinComentarios += sentenciaC.substring(posFin, posInicio).trim() + " ";
			
			// calcular posicion en la que termina el comentario (suma 2 - lo que ocupa '*/')
			posFin = sentenciaC.indexOf(FIN, posInicio) + 2;
			
			// buscar otro comentario en el codigo
			posInicio = sentenciaC.indexOf(INICIO, posFin);
			
		}
		
		// si no hay más comentarios, concatenamos lo restante en el codigo
		sentenciaSinComentarios += sentenciaC.substring(posFin);
		
		// devolver cadena sin comentarios
		return sentenciaSinComentarios;
	}
}
