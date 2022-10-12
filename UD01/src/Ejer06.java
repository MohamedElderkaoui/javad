import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {

		/*
		 * Realizar un algoritmo que lea un número por teclado. En caso de que ese
		 * número sea 0 o menor que 0, se saldrá del programa imprimiendo antes un
		 * mensaje de error. Si es mayor que 0, se deberá calcular su cuadrado y la raíz
		 * cuadrada del mismo, visualizando el numero que ha tecleado el usuario y su
		 * resultado (“Del numero X, su potencia es Y y su raíz Z”). Para calcular la
		 * raíz cuadrada se puede usar la función interna RAIZ(X)./
		 */
		// definir variables
		int num1=0;
		// introducir datos por
		Scanner teclados = new Scanner(System.in);
		System.out.println("introducir datos para num1");
		num1 = teclados.nextInt();
		teclados.close();
		if (num1>0) {
			System.out.println("de numero"
					+num1
					+ ", su portecia "+ (num1 *num1)+"y raiz"+Math.sqrt(num1));
			
		}else {
			System.err.println("el numero no es mayor");
		}
	}
}
