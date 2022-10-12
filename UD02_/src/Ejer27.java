/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer27 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 26.-Introducir una frase por teclado. Imprimirla en el centro de la pantalla.
		 * (80 caracteres por línea)
		 */
		String frase = Utilidad.leer().leerCadena("Introducir una frase por teclado");
		System.out.printf("%" + (40 - frase.length() / 2) + "s", frase);
	}
}
