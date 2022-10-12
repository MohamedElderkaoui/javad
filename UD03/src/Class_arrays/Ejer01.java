/**
 * 
 */
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01 /**
					 * Se generan 20 números aleatorios de tipo entero entre -10 y 10 almacenándolos
					 * en un vector. Hay que calcular y mostrar la media y, además, mostrar cuántos
					 * números hay:
					 * 
					 * -Superiores a la media
					 * 
					 * -Inferiores a la media
					 * 
					 * -Iguales a la media
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros_aleatorios = new int[20];
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			numeros_aleatorios[i] = (int) (Math.ceil((Math.random() * 40) - 20));
		}
		System.out.println(Arrays.toString(numeros_aleatorios));
		int numeros_media = (int) Utilidad.leer().miMedia(numeros_aleatorios);
		System.out.println(numeros_media);
		System.out.println("Iguales a la media");
		System.out.print("[");
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			if (numeros_aleatorios[i] == numeros_media) {

				System.out.printf("%d;", numeros_aleatorios[i]);

			}
		}
		System.out.println("]");

		System.out.println("Inferiores a la media");
		System.out.print("[");
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			if (numeros_aleatorios[i] < numeros_media) {

				System.out.printf("%d;", numeros_aleatorios[i]);

			}
		}
		System.out.println("]");

		System.out.println("Superiores a la media");
		System.out.print("[");
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			if (numeros_aleatorios[i] > numeros_media) {

				System.out.printf("%d;", numeros_aleatorios[i]);

			}
		}
		System.out.print("]");
	}
	/** FIN */
}
