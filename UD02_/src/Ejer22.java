
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer22 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 21.-Hacer un programa que calcule independientemente la suma de los pares y
		 * los impares de los números entre 1 y 1000 utilizando la estructura según.
		 */
		int num = 1, numf = 1000, n_par = 0, suma_impar = 0, in = 0;
//
//		for (int i = num; i < numf; i++) {
//			in++;
//			if ((i %= 2) == 0) {
//				n_par++;
//			} else {
//				suma_impar += i;
//			}
//
//		}
//		System.out.printf("hay %d y %d son pares. %d la suma de los impares.", in, n_par, suma_impar);

		for (int i = 1; i <= 1000; i++) {
			in++;
			switch (i %2) {

			case 0: {
				n_par++;
				System.out.println(i+"par");
				
				
			}break;
			case 1: {
				suma_impar += i;
				System.out.println(i+"impar");
				
			}break;
			default:
				break;
			}
		}
		System.out.printf("hay %d y %d son pares. %d la suma de los impares.", in, n_par, suma_impar);
	}

}
