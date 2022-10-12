
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer07_2/**
						 * Generar una matriz de 5x5 numérica entera entre -10 y 10, a continuación
						 * pedir dos números de fila, que se deben filtrar entre 1 y 5 e intercambiar
						 * ambas filas. Presentar las matrices antes y después del cambio.
						 */
{

	public static void main(String[] args) {

		int mat[][] = new int[5][5];

		generaMatriz(mat, -5, 5);

		Ejer04.bonita(mat);

		int f1 = Leer.leerEntero("Fila1: ");
		int f2 = Leer.leerEntero("Fila2: ");
		mat=	intercambi0(mat, f1, f2);
		Ejer04.bonita(mat);

	}

	public static void generaMatriz(int m[][], int min, int max) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * (Math.abs(min) + Math.abs(max) + 1)) - Math.abs(min);
			}
		}

	}

	public static int[][] intercambi0(int m[][], int f1, int f2) {

		int apoya[]= new int[m[0].length];
		apoya=m[f2-1];
		m[f2-1]=m[f1-1];
		m[f1-1]=apoya;
		return m;
	}
}
