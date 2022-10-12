import java.util.Arrays;

/**
 * 36.-Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1
 * y 100, e imprimirla.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer37 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num[][] = new int[4][5];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int) (Math.ceil(Math.random() * 100));
			}
		}
		for (int i = 0; i < num[1].length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print("" + num[j][i] + "  ;");
			}System.out.println();
		}
	}
}
