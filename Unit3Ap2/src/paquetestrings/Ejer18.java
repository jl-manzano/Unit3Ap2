package paquetestrings;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// variable -> almacenar título
        String titulo;
        
		// variable -> almacenar contenido
        String contenido;
        
        // variable -> almacenar codigo HTML
        String codHtml;
        
		// bucle do-while -> asegurar que usuario introduzca titulo
		do {
			// pedir frase a usuario
			System.out.println("Introduzca un título para su página HTML: ");
			titulo = sc.nextLine();

		} while (titulo.isEmpty());
		
		// bucle do-while -> asegurar que usuario introduzca contenido
		do {
			// pedir frase a usuario
			System.out.println("\nIntroduzca el contenido de su página HTML: ");
			contenido = sc.nextLine();

		} while (contenido.isEmpty());

		// salto de línea
		System.out.println();
		
        // llamar a función para generar el código HTML
        codHtml = generarHTML(titulo, contenido);

        // mostrar el resultado
        System.out.println(codHtml);
        
        // cerrar scanner
        sc.close();
    }

    static String generarHTML(String titulo, String contenido) {
    	
        // generar código HTML con el título y contenido proporcionados
        String codHtml = "<!DOCTYPE html>\n" +
                      "<html lang=\"es\">\n" +
                      "<head>\n" +
                      "<meta charset=\"UTF-8\">\n" +
                      "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                      "<title>" + titulo + "</title>\n" +
                      "</head>\n" +
                      "<body>\n" +
                      "<h1>" + titulo + "</h1>\n" +
                      "<p>" + contenido + "</p>\n" +
                      "</body>\n" +
                      "</html>";
        
        // devolver resultado
        return codHtml;
    }
}