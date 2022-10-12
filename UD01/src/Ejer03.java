import java.util.Scanner;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD 3) Algoritmo que lea
 *         dos números y nos diga cuál de ellos es mayor o bien si son iguales
 *         (recuerda usar la estructura condicional SI)
 * 
 */
public class Ejer03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		Scanner teclados = new Scanner(System.in);
		//definir variables
		int A;
		int B;
		// introducir datos por 
		System.out.println("introducir datos para a");
		A=teclados.nextInt();
		System.out.println("introducir datos para b");
		
		B=teclados.nextInt();
		//mostrar lo que he reco
		System.out.println("mostrar datos para a="+A);
		System.out.println("mostrar datos para b="+B);
		// 
		System.out.println((A==B?//si b es IGUALES que B
								"SON IGUALES LOS " + B + "Y" + A// true
							://sino
									(A<B?//if A es mayor que B
											"el mayor es"+A
									://sino
											"el mayor es"+B
											)));
		
		
		
		
 }
}
