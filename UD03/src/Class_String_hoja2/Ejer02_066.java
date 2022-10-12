/**
 * 
 */
package Class_String_hoja2;

import Class_String_hoja1.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_066 /**
						 * Escribe un programa que pida una palabra por teclado e intercambie la última
						 * y la primera letra.
						 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String nombres = "";
		String nombres1 = "";
		do {
			nombres = Utilidad.leer().leerCadena("escribre palabra:");

		} while (nombres.length() > 60);
		System.out.println(nombres);
		System.out.printf("%s%s%s", nombres.charAt(nombres.length()-1),nombres.subSequence(1, (nombres.length()-1)),nombres.charAt(0));
	}

}
