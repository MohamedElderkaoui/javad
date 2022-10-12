/**
 * 
 */
package Class_String_hoja2;

import Class_String_hoja1.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_01 /**
						 * Escribir un programa que pida por teclado una cadena y una letra, de manera
						 * que ponga en mayúsculas cada ocurrencia de la letra que haya en la cadena y
						 * lo muestre por pantalla
						 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String frase = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toLowerCase();
		} while (frase.length() > 60);

		String cart = "";
		do {
			cart = Utilidad.leer().leerCadena("escribre frase:").toLowerCase();
		} while (cart.length() != 1);
		System.out.println(frase);
		for (int i = 0; i < frase.length(); i++) {
			if ((frase.charAt(i) + "").equals(cart)) {
				frase = frase.replace((frase.charAt(i) + ""), (frase.charAt(i) + "").toUpperCase());
			}
		}
		System.out.println(frase);
	}

}
