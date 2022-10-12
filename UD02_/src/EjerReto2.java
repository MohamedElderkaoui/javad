
public class EjerReto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrixNumero = new int[5][4];
		int[] mediaNumero = new int[5];
		int[] sumaNumero = new int[4];
		for (int i = 0; i < matrixNumero.length; i++) {
			for (int j = 0; j < matrixNumero[i].length; j++) {
				matrixNumero[i][j] = (int) Math.ceil(Math.random() * 10);
				System.out.printf(" %-2d ", matrixNumero[i][j]);
				sumaNumero[j] += matrixNumero[i][j];
				mediaNumero[i] += matrixNumero[i][j];
			}
			mediaNumero[i] /= 4;
			System.out.printf("%9d ", mediaNumero[i]);
			System.out.println();

		}
		System.out.printf("\n"  + "\n" + "\n", "");

		for (int i = 0; i < sumaNumero.length; i++) {
			System.out.printf(" %d ", sumaNumero[i]);
		}
	}

}// 960585
