import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 17) Algoritmo que lea números enteros hasta teclear 0, y nos muestre el
		 * máximo, el mínimo y la media de todos ellos. Piensa como debemos inicializar
		 * las variables. 
		 */
		Scanner teclados = new Scanner(System.in);
		String x = "números enteros";
		System.out.println(x);
		int num = 0, min = 0, max = 0, suma = 0, i = 0;
		num = lere(teclados, i + x);

		min = num;
		max = num;
		do {
			i += 1;
			num = lere(teclados, i + x);
			if (num != 0) {
				if (num < min)
					min = num;
				if (num >= max)
					max = num;
				suma += num;// suma+=num->suma=suma+num
			}

		} while (num != 0);
		int media = suma / i;
		System.out.printf("media = %3d\n" + "minimo=%3d |" + "maximo=%3d  ", media, min, max);
	}

	/**
	 * @param teclados
	 * @param x        System.out.println(x); num<-- teclados.nextInt();
	 * @return
	 */
	public static int lere(Scanner teclados, String x) {
		int num;
		System.out.print(x);
		num = teclados.nextInt();
		return num;
	}

}
