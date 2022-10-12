
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer06/**
					 * Generar una matriz de 10x10, asignarles número reales aleatorios a cada
					 * elemento entre -5 y 5. Calcular e imprimir la suma de cada una de sus filas y
					 * de cada una de sus columnas junto con la matriz.
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] matrixNumero = new double [10][10];
		double[] sumaCNumero = new double[10];
		double[] sumafNumero = new double[10];
		for (int i = 0; i < matrixNumero.length; i++) {
			for (int j = 0; j < matrixNumero[i].length; j++) {
				matrixNumero[i][j] =  (Math.random() * 10-5);
				System.out.printf(" %-4.2f ", matrixNumero[i][j]);
				sumafNumero[j] += matrixNumero[i][j];
				sumaCNumero[i] += matrixNumero[i][j];
			}
	
			System.out.printf("%9s%-9.2f ","", sumaCNumero[i]);
			System.out.println();

		}
		System.out.printf("\n" + "\n" + "\n", "");

		for (int i = 0; i < sumafNumero.length; i++) {
			System.out.printf(" %-4.2f ", sumafNumero[i]);
		}
	}

}
