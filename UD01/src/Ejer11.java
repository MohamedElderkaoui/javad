import java.util.Scanner;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 11) Algoritmo que nos diga si una persona puede acceder a cursar un ciclo
		 * formativo de grado superior o no. Para acceder a un grado superior, si se
		 * tiene un título de bachiller, en caso de no tenerlo, se puede acceder si
		 * hemos superado una prueba de acceso
		 */
		/**
		 * bachiller<- introducir a por teclado prueba<- introducir a por teclado
		 * si(bachiller>=5){ mostrarm: puede acceder a cursar un ciclo formativo de
		 * grado superior
		 * 
		 * } sino{ si(prueba>=5 ){ 
		 * 					mostrarm: puede acceder a cursar un ciclo formativo
		 * de grado superior
		 * 
		 * } sino{ 
		 * 			mostrarm: a es impar 
		 * 		} 
		 * }
		 */
		Scanner teclados = new Scanner(System.in);
		System.out.print("si tiene bachiller(s:1 yn:0)");
		int bachiller = teclados.nextInt();

	int prueba=0;
		if (bachiller == 1) {
			System.out.println("puede acceder a cursar un ciclo " + "formativo de grado superior");
		} else {
			System.out.print("si tiene prueba(s:1 yn:0)");
			 prueba = teclados.nextInt();
			 if (prueba ==1) {
					System.out.println("puede acceder a cursar un ciclo" + " formativo de grado superior");
				} else {
					System.out.println("nopuede acceder a cursar un ciclo " + "formativo de grado superior");

				}
		}
	}

}
