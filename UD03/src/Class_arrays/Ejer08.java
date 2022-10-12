
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer08/**
					 * Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10 tanto las
					 * asignaturas como los alumnos. Introducimos las 10 notas de los 10 alumnos
					 * (generación aleatoria de 1 a 10) y pidiendo por teclado bien número de
					 * asignatura ó bien número de alumno, calcular media del alumno tecleado ó
					 * media de la asignatura tecleada.
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nota_alumno = new int[10][10];
		int[] media_nota_alumno = new int[10];
		int[] media_nota_asignatura = new int[10];
		for (int i = 0; i < nota_alumno.length; i++) {
			for (int j = 0; j < nota_alumno[i].length; j++) {
				nota_alumno[i][j] = (int) Math.ceil((Math.random() * 10));
				System.out.printf(" %-2d |", nota_alumno[i][j]);
				media_nota_asignatura[j] += nota_alumno[i][j];
				media_nota_alumno[i] += nota_alumno[i][j];
			}

			System.out.printf("%9d| ", media_nota_alumno[i]/10);
			System.out.println();

		}
		for (int i = 0; i < media_nota_asignatura.length; i++) {
			media_nota_asignatura[i] /= 10;
			media_nota_alumno[i] /= 10;
		}
		System.out.printf("\n" + "\n" + "\n", "");

		for (int i = 0; i < media_nota_asignatura.length; i++) {
			System.out.printf(" %-2d |", media_nota_asignatura[i]);
		}
		extracted(nota_alumno, media_nota_alumno, media_nota_asignatura);
	}

	/**
	 * @param nota_alumno
	 * @param media_nota_alumno
	 * @param media_nota_asignatura
	 */
	public static void i(int[][] nota_alumno, int[] media_nota_alumno, //
			int[] media_nota_asignatura) {	for (int i = 0; i < nota_alumno.length; i++) {
				for (int j = 0; j < nota_alumno[i].length; j++) {
					
					System.out.printf(" %-2d |", nota_alumno[i][j]);
		
				}

				System.out.printf("%9d ", media_nota_alumno[i]/10);
				System.out.println();

			}
			
			System.out.printf("\n" + "\n" + "\n", "");

			for (int i = 0; i < media_nota_asignatura.length; i++) {
				System.out.printf(" %-2d ", media_nota_asignatura[i]);
			}}
	/**
	 * @param nota_alumno
	 * @param media_nota_alumno
	 * @param media_nota_asignatura
	 */
	public static void extracted(int[][] nota_alumno, int[] media_nota_alumno, //
			int[] media_nota_asignatura) {
		int leerEntero = Utilidad.leer().leerEntero("\n1.-media del alumno tecleado \n2.-" + " media de la asignatura tecleada\n0.-salir\n\n introduce numero ");
		Boolean b = !(leerEntero == 1 ? false : (leerEntero == 2 ? false : (leerEntero == 0 ? true : false)));
		do {
			switch (leerEntero) {
			case 1:
				i(nota_alumno, media_nota_alumno, media_nota_asignatura);
				int notas = Utilidad.leer().leerEntero("media del alumno tecleado");
				System.out.print("nota_alumno" + Arrays.toString(nota_alumno[notas]) + "->" + media_nota_alumno[notas]);
				leerEntero = 
						Utilidad.leer()
						.leerEntero(""
								+ "\n"
								+ "\n"
								+ "1.-media del alumno tecleado \n2.- media de la asignatura tecleada\n0.-salir\n\n________\n\n introduce numero; ");
						break;
			case 2:
				i(nota_alumno, media_nota_alumno, media_nota_asignatura);
				int asignatura = Utilidad.leer().leerEntero("media del asignatura tecleado");
				System.out.println("nota_asignatura[");
				for (int i = 0; i < media_nota_asignatura.length; i++) {
					System.out.print(String.format("%d,", nota_alumno[i][asignatura]));
				}
				System.out.print("->" + media_nota_asignatura[asignatura] + "");
				leerEntero = Utilidad.leer()
						.leerEntero(""
								+ "\n"
								+ "\n"
								+ "1.-media del alumno tecleado \n2.- media de la asignatura tecleada\n0.-salir\n\n________\n\n introduce numero; ");
				break;
			case 0:
				b = false;
				break;
			default:
				break;
			}
		} while (b);
	}

}
