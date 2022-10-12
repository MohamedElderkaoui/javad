/**
 * 
 */
package Class_String_hoja2;

import Class_String_hoja1.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_03 /**
						 * Escribe un programa que pida por teclado una palabra y diga si es un
						 * palíndromo o no. Una palabra es un palíndromo si se lee son igual de izquierda a
						 * derecha que de derecha a izquierda.
						 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String palabra = "";
		String i_palabra = "";
		do {
			palabra = Utilidad.leer().leerCadena("escribre palabra:");
			i_palabra = extracted(palabra, i_palabra);
			System.out.print(palabra + " vs " + i_palabra);
			if (palabra.equals(i_palabra)) {
				System.out.println("\nson igual");
			} else {
				System.out.println("\n no son igual");
			}
		} while (palabra.length() > 60);
		
		
	}

	/**
	 * @param palabra
	 * @param i_palabra
	 * @return
	 */
	public static String extracted(String palabra, String i_palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			i_palabra = i_palabra + palabra.charAt(palabra.length()-1-i) + "";

		}
		return i_palabra;
	}

}
