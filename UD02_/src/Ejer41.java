import java.util.Arrays;

/**
 * 41.-Se dispone de una tabla de 5 páginas, 10 filas y 20 columnas, que se
 * refieren al centro, al curso y al número de alumnos de un colegio
 * respectivamente. Imprimir la nota media por curso y la nota media máxima y su
 * centro de pertenencia.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer41 {
	/**
	 * metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num[][][] = new int[5][10][20];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				for (int k = 0; k < num[i][j].length; k++) {
					String str = "alumno(" + (i + 1) + "." + (j + 1) + "." + (k + 1) + "." + "";
					num[i][j][k] = ((
					/**
					 * Utilidad.leer().leerEntero(str+".1)")
					 */
					Utilidad.leer().leerEntero(str + ".1)") + Utilidad.leer().leerEntero(str + ".2)")
							+ Utilidad.leer().leerEntero(str + ".3)"))/**
																		 * suma de nota
																		 */
							/ 3)/*
								 * division de nota entre 
								 * 
								 */
					;

				}
			}
		}
		extracted(num);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				Utilidad.ordernadore(num[i][j]);
			}
		}
		extracted(num);
	}

	/**
	 * @param num
	 */
	public static void extracted(int[][][] num) {
		/*
		 * ----------------------- ----imprimir -----------------------
		 */
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				for (int k = 0; k < num[i][j].length; k++) {
					System.out.printf("%3d,", num[i][j][k]);
				}
				System.out.println();
			}
			System.out.print("____________________________________________________________________________________"
					+ "\n________________________________________________________________________________" + "\n");
		}
	}
}
