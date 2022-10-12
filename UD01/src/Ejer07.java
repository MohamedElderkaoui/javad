import java.util.Scanner;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7) Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas
		 * hay en el curso actual. Diseñar un algoritmo para este propósito (recuerda
		 * que para calcular el porcentaje puedes hacer una regla de 3). Se preguntará
		 * por el número de niños y el número de niñas.
		 */
		// definir variables
		int chico = 0;
		int chica = 0;
		// introducir datos por
		Scanner teclados = new Scanner(System.in);
		System.out.print("introducir datos para chico");
		chico = teclados.nextInt();
		System.out.print("introducir datos para chico");
		chica = teclados.nextInt();
		teclados.close();
		int total = chico + chica;

		int o_chico = (chico * 100) / total;
		System.out.println("%chico" +  "" + "y %chica" + ((chica * 100) / total) + "" + "y total"
				+ total + "");
	}

}
