import java.util.Scanner;

/**
 * 4) Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor 
 * (recuerda usar la estructura condicional Si y los operadores lógicos).
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// definir variables
		int A;
		int B;
		int C;
		// introducir datos por
		Scanner teclados = new Scanner(System.in);
		System.out.println("introducir datos para a");
		A = teclados.nextInt();
		System.out.println("introducir datos para B");
		B = teclados.nextInt();
		System.out.println("introducir datos para C");
		C = teclados.nextInt();
		boolean d = B > C;
		boolean d2 = A > B;
		boolean d3 = A > C;
		K7(A, B, C, d, d2, d3);
	}

	/**
	 * @param A
	 * @param B
	 * @param C
	 * @param d
	 * @param d2
	 * @param d3
	 */
	public static void K7(int A, int B, int C, boolean d, boolean d2, boolean d3) {
		if (Utilidad.y(d2, d3)) {// SI(B > C∧ A > B)
			System.out.println("el numeros mayor es" + A);
		} else {/* SINO */

			K(B, C, d);
		}
	}

	/**
	 * @param B
	 * @param C
	 * @param d
	 */
	public static void K(int B, int C, boolean d) {
		if (d) {/* //SI(B > C ∧A > B) */
			System.out.println("el numeros mayor es" + B);

		} else {
			System.out.println("el numeros mayor es" + C);

		}
	}

}
