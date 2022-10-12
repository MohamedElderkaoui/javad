import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 14) Se pide representar el algoritmo que nos calcule la suma de los N
		 * siguientes n�meros pares a partir de N (si N es par ser�a el primer n�mero
		 * que hay que sumar). Es decir, si insertamos un 5, nos haga la suma de
		 * 6+8+10+12+14.
		 * -------------------------------------------------------------
		 * DIFENIR num1
		 * LEER num1
		 * si (num2 % 2) != 0
		 * 		num2 = num2+1
		 * for (int i = 0; i < num1; i++) {
		 * System.out.print((num2)+",  ");
		 * 			num2=num2+2;
		 * }
		 */
		Scanner teclados = new Scanner(System.in);
		System.out.print("");
		int num1 = teclados.nextInt();
		int veces = num1;
		int cont = 0;
		int resultato = 0;
		
		while (cont<veces) {
			resultato+=num1;
			System.out.printf("iterador %d resultato=%d\n",cont,resultato);
			num1+=2;
			cont += 1;
		}
		
//		if ((num2 % 2) != 0) {
//			num2 += 1;
//		}
//		for (int i = 1; i <= num1; i++) {
//			System.out.print((num2)+",  ");
//			num2+=i;
//		}
//		System.out.printf("restuto : %d",num2);
	}

}
