/**
 * 
 */
package Class_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer03 implements Comparator/**
											 * Leer un vector de 20 enteros. Encontrar el mayor y el menor de ellos y
											 * los lugares donde se encuentran.
											 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int dimesiones = 20;
			Integer[] vectores_numeros_1 = new Integer[dimesiones];
			Integer[] vectores_numeros_2 = new Integer[dimesiones];
			for (int i = 0; i < vectores_numeros_1.length; i++) {
				vectores_numeros_1[i] = (Integer) Utilidad.leer().leerEntero("numero" + "(" + i + ")" + "");
				vectores_numeros_2[i] = vectores_numeros_1[i];

			}
			Arrays.sort(vectores_numeros_2);
			System.out.println(" el menor de ellos");
			for (int i = 0; i < vectores_numeros_1.length; i++) {
				if (vectores_numeros_1[i] == vectores_numeros_2[0]) {
					System.out.printf("%3d:", i);
				}
			}
			// Utilidad.leer().ordernar_int_reversed(vectores_numeros_2);
			Comparator<Integer> o = (a, b) -> a - b;
			Arrays.sort(vectores_numeros_2, o.reversed());

			System.out.println(" el mayor de ellos");
			for (int i = 0; i < vectores_numeros_1.length; i++) {
				if (vectores_numeros_1[i] == vectores_numeros_2[0]) {
					System.out.printf("%3d:", i);
				}
			}
		
	}

	/**
	 * FIN
	 */

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
