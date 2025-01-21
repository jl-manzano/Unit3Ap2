package paquetestrings2;

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

		sentenciaSinComentarios = eliminarComentarios(sentencia);
		
		System.out.println("\nSentencia sin comentarios: " + sentenciaSinComentarios);

		sc.close();
		
	}

	static String eliminarComentarios(String sentenciaC) {

		// constantes -> almacenar inicio y fin comentarios
		final String INICIO = "/*";
		final String FIN = "*/";

		// variable para almacenar sentenciaSinComentarios
		String sentenciaEnCSinComent = "";

		// variable posInicio -> almacenar la posición de la apertura de comentario en C
		int posInicio = sentenciaC.indexOf(INICIO);

		// variable posFin -> almacenar la posición del cierre de comentario en C
		int posFin = 0; // definir a 0, ya que al empezar el bucel aun no ha encontrado ningun
						// comentario y cualquier texto anterior al comentario debe ser copiado
		
		// bucle while -> eliminar comentarios
		while (posInicio >= 0) {
			// almacena codigo sin comentarios entre cierre de comentario y apertura de otro
			sentenciaEnCSinComent += sentenciaC.substring(posFin, posInicio);
			
			// busca un cierre de comentario y almacena la posicion de cierre del comentario + 2, lo que ocupa /* -> concatenar el codigo sin comentarios
			posFin = sentenciaC.indexOf(FIN, posInicio) + 2;
			
			// busca una nueva apertura de comentario
			posInicio = sentenciaC.indexOf(INICIO, posFin);
				
		}
		
		// concatenar codigo restante a sentencia en C sin comentarios
		sentenciaEnCSinComent += sentenciaC.substring(posFin);

		
		// devolver sentencia sin comentarios
		return sentenciaEnCSinComent;

	}
}
