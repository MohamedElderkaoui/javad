import java.util.Scanner;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer06 {
	/**
	 * 6.-Hacer un pseudocódigo que imprima todos los números naturales que hay
	 * desde la unidad hasta un numero que introducimos por teclado.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclados = new Scanner(System.in);
		System.out.print("numero 1 ");
		int m = teclados.nextInt();
		for (int i = 1; i < m + 1; i++) {
			System.out.printf("%-" + ("" + m).length() + "d,", i);
			if (i % 10 == 0)
				System.out.println();
		}
	}
}
