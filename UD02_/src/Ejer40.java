import java.util.Arrays;

/**
 * 40.-Crear una tabla de 3 páginas, 4 filas y 5 columnas donde el primer
 * elemento valga 1, el segundo 2, el tercero 3 y así sucesivamente, e
 * imprimirla.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer40 {
	/**
	 * metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num[][][] = new int[3][4][5];
		int a = 1;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				for (int k = 0; k < num[i][j].length; k++) {
					num[i][j][k] = a;
					a += 1;
				}
			}
		}
		// -----------------------
		// ----imprimir
		// -----------------------
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				for (int k = 0; k < num[i][j].length; k++) {
					System.out.printf("%3d,", num[i][j][k]);
				}
				System.out.println();
			}
			System.out.print(
					"____________________________________________________________________________________"
					+ "\n________________________________________________________________________________"
					+ "\n");
		}
	}
}
