import java.util.Scanner;

/**
 * 4) Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor 
 * (recuerda usar la estructura condicional Si y los operadores lógicos).
 */

/**
 * @author Mohamed el Derkaoui Merzouk num2endoukha 1iN_DAWD
 *
 */
public class Ejer05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// definir variables
		int num1;
		int num2;
		int num3;
		// introducir datos por
		Scanner teclados = new Scanner(System.in);
		System.out.println("introducir datos para num1");
		num1 = teclados.nextInt();
		System.out.println("introducir datos para num2");
		num2 = teclados.nextInt();
		System.out.println("introducir datos para num3");
		num3 = teclados.nextInt();
		int x = num1+num2+num3;
		int x2 = num1*num2*num3;
	if (num1<0) {
		System.out.println(x2);
	} else {
		System.out.println(x);
	}
	}

	/**
	 * @param A
	 * @param num2
	 * @param num3
	 * @param d
	 * @param d2
	 * @param d3
	 */
	public static void K7(int A, int num2, int num3, boolean d, boolean d2, boolean d3) {
		if (Utilidad.y(d2, d3)) {// SI(num2 > num3∧ A > num2)
			System.out.println("el numeros mayor es" + A);
		} else {/* SINO */

			K(num2, num3, d);
		}
	}

	/**
	 * @param num2
	 * @param num3
	 * @param d
	 */
	public static void K(int num2, int num3, boolean d) {
		if (d) {/* //SI(num2 > num3 ∧A > num2) */
			System.out.println("el numeros mayor es" + num2);

		} else {
			System.out.println("el numeros mayor es" + num3);

		}
	}

}
