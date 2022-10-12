import java.util.Scanner;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 15) Dada una secuencia de números positivos leídos por teclado, que acabe
		 * cuando tecleemos un –1, por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar
		 * el algoritmo que calcule la media aritmética
		 */
		Scanner teclados = new Scanner(System.in);
		System.out.print("introducion primer numero");
		int num = teclados.nextInt();
		int suma = num;
		int i =2;
		String s ="";
		do {
			i++;
			suma = suma + num;
			System.out.print("introducion "
					+ i
					+ "º numero");
			num = teclados.nextInt();
			if (num != -1) {
				 s =s+ num+", ";
				System.out.println(s);
			}
		} while (num != -1);
		
		int j2 = suma/i;
		float j = (float) ((float) j2*1.0);
		System.out.printf("la media es:%3.2f", j);
	}

}
