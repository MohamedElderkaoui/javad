
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer07/**
					 * Generar una matriz de 5x5 numérica entera entre -10 y 10, a continuación
					 * pedir dos números de fila, que se deben filtrar entre 1 y 5 e intercambiar
					 * ambas filas. Presentar las matrices antes y después del cambio.
					 */
{

	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] apoyo = new int[5];
		int[][] matrixNumero1 = new int[5][5];
		int[][] matrixNumero2 = new int[5][5];
		for (int i = 0; i < matrixNumero1.length; i++) {
			for (int j = 0; j < matrixNumero1[i].length; j++) {
				 matrixNumero1[i][j]= (int) (Math.random()*10-5);
			}
		}
		for (int[] is : matrixNumero1) {
			System.out.println(Arrays.toString(is));
		}
		matrixNumero2=matrixNumero1;
		apoyo=matrixNumero2[4];
		matrixNumero2[4]=matrixNumero2[0];
		matrixNumero2[0]=apoyo;
		System.out.println("__________________");
		System.out.println("__________________");
		for (int[] is : matrixNumero1) {
			System.out.println(Arrays.toString(is));
		}
	}

}
