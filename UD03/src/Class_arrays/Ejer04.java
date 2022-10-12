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
public class Ejer04 implements Comparator/**
											 * Generar una matriz de 5x5 (numérica entera entre -100 y 100) e imprimir
											 * el valor mayor y el menor y los lugares donde se encuentran.
											 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix_numeros = new int[5][5];
		int[] atrix_numeros = new int[matrix_numeros.length * matrix_numeros[matrix_numeros.length - 1].length];
		///////////////////
		int j2 = 40;
		int j2_1y2 = j2 / 2;

		// (int) Math.floor(Math.random() * j2 - j2_1y2);
		for (int i = 0; i < matrix_numeros.length; i++) {
			for (int j = 0; j < matrix_numeros[i].length; j++) {
				matrix_numeros[i][j] = (int) Math.floor(Math.random() * j2 - j2_1y2);
				int j3 = i * matrix_numeros.length;
				atrix_numeros[j3 + j] = matrix_numeros[i][j];
			}
		}
		//System.out.println(Arrays.toString(atrix_numeros));
		for (int[] i : matrix_numeros) {
			System.out.println(Arrays.toString(i));

		}
		Arrays.sort(atrix_numeros);

		// (int) Math.floor(Math.random() * j2 - j2_1y2);
//		for (int i = 0; i < matrix_numeros.length; i++) {
//			for (int j = 0; j < matrix_numeros[i].length; j++) {
//				// --matrix_numeros[i][j] = (int) Math.floor(Math.random() * j2 - j2_1y2);
//				matrix_numeros[i][j] = atrix_numeros[i * matrix_numeros.length + j];
//			}
//		}
		System.out.print("\n_____________-_________-" + "\n_____________-_________-" + "\n_____________-_________-"
				+ "\n_____________-_________-" + "\n");
		for (int i = 0; i < matrix_numeros.length; i++) {
			for (int j = 0; j < matrix_numeros.length; j++) {
				if (matrix_numeros[i][j] == atrix_numeros[0]) {
					System.out.printf("(" + "%2d" + "," + "%2d" + ")", i, j);
				}
			}
		}System.out.println();
		for (int i = 0; i < matrix_numeros.length; i++) {
			for (int j = 0; j < matrix_numeros.length; j++) {
				if (matrix_numeros[i][j] == atrix_numeros[atrix_numeros.length-1]) {
					System.out.printf("(" + "%2d" + "," + "%2d" + ")", i, j);
				}
			}
		}System.out.println();
		System.out.println(Arrays.deepToString(matrix_numeros));

	}

	/**
	 * FIN
	 */

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
//main

//método para pintar la matriz "bonita"
public static void bonita(int m[][]) {
	
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[i].length; j++) {
			System.out.printf(" %4d ",m[i][j]);
		}
		System.out.printf(" \n");
	}
	
}
}
