/**
 * 
 */
package Class_String_hoja2;

import Class_String_hoja1.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_02 /**
						 * EEscribe un programa que pida por teclado una cadena y una letra, de manera
						 * que elimine la letra las 3 primeras veces que la encuentre en la cadena y
						 * luego lo muestre por pantalla.
						 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String frase = "";
		String frase2 = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toLowerCase();
		} while (frase.length() > 60);
		frase2=frase;
		/////////////////////
		int veces = 0;
		/////////////////////
		String cart = "";
		do {
			cart = Utilidad.leer().leerCadena(cart.length() != 1 ? "vuelve escribre letra:" : "escribre letra:")
					.toLowerCase();
		} while (cart.length() != 1);
		System.out.println(frase);
		
		for (int i = 0; i < frase2.length()-1; i++) {

			if (frase2.substring(i, i+1).compareToIgnoreCase(cart)==0) {
				if (veces < 3) {
					//frase2.substring(i, i+1)="";
					frase2=frase2.replaceFirst((frase2.substring(i, i+1)+ ""), ("").toUpperCase());
					

					veces++;
				} else {
					break;
				}
			}
		}
		System.out.println(frase2);
	}

}
