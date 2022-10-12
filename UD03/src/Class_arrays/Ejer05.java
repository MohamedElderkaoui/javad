/**
 * 
 */
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer05/**
					 * Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5 a
					 * cada elemento) y comprobar para cada uno de los elementos del primer vector
					 * cuántas veces está en el segundo, es decir para
					 * 
					 * vector1= {3,7,2}
					 * 
					 * vector2= {3,3,5}
					 * 
					 * el resultado debe ser:
					 * 
					 * elemento 1 : 2 veces
					 * 
					 * elemento 2 : 0 veces
					 * 
					 * elemento 3 : 0 veces
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1[] = new int[10];
		int v2[] = new int[10];
		int v3[] = new int[10];
		llerena(v1, v2);
		Arrays.sort(v1);
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		comparar(v1, v2, v3);
		imprimir(v3);
	}

	/**
	 * funtion imprimir
	 * @param v3
	 * @return elemento ## : %d veces
	 */
	public static void imprimir(int[] v3) {
		System.out.println(Arrays.toString(v3));
		for (int i = 0; i < v3.length; i++) {
			System.out.printf("elemento %d : %d veces\n", i,v3[i]);
		}
	}

	/**
	 * @param v1
	 * @param v2
	 * @param v3
	 */
	public static void comparar(int[] v1, int[] v2, int[] v3) {
		if (v1.length == v2.length) {
			if (v1.length == v3.length) {
				for (int i = 0; i < v1.length; i++) {
					for (int j = 0; j < v2.length; j++) {
						if (v1[i]==v2[j]) {
							v3[j]++;
						}
					}
				}
			}
		}
	}

	/**
	 * @param v1
	 * @param v2
	 */
	public static void llerena(int[] v1, int[] v2) {
		if (v1.length == v2.length) {
			for (int i = 0; i < v1.length; i++) {
				v1[i] = (int) ((Math.random() * 10) - 5);
				v2[i] = (int) ((Math.random() * 10) - 5);
			}
		}
	}

}
