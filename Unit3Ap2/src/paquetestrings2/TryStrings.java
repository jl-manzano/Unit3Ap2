package paquetestrings2;

public class TryStrings {
		public static void main(String[] args) {
			String str = "Hola, cómo estás, cómo te va?";

			// Buscar "cómo", comenzando desde el índice 20 y yendo hacia atrás
			int indice = str.lastIndexOf("cómo", 20);
			System.out.println("Última ocurrencia de 'cómo' desde índice 20: " + indice); // Salida: 6

			// Buscar "va", comenzando desde el índice 25
			int indice2 = str.lastIndexOf("va", 25);
			System.out.println("Última ocurrencia de 'va' desde índice 25: " + indice2); // Salida: -1

	}

}
