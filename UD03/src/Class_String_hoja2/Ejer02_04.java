/**
 * 
 */
package Class_String_hoja2;

import Class_String_hoja1.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_04 /**
						 * . Escribe un programa que pida por teclado dos nombres con su apellido cada
						 * uno del siguiente modo:
						 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String nombres = "";
		String nombres1 = "";

		String[] Vnombres;
		String[] Vnombres1;
		do {
			do {
				nombres = Utilidad.leer().leerCadena("escribre palabra:");

			} while (nombres.length() > 60);
			Vnombres = nombres.split(" ");
		} while (Utilidad.intervalo((int) Vnombres.length, 1, 3));
		do {

			do {
				nombres1 = Utilidad.leer().leerCadena("escribre palabra:");
				Vnombres1 = nombres1.split(" ");
			} while (nombres1.length() > 60);

		} while (Utilidad.intervalo((int) Vnombres1.length, 1, 3));
		System.out.println(nombres);
		System.out.println(nombres1);
		System.out.println("-------------------------\n");
		System.out.println("-------------------------\n");
		System.out.println(Vnombres[0] + " " + Vnombres1[1]);
		System.out.println(Vnombres[1] + " " + Vnombres1[0]);

	}

}
