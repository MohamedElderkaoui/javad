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
		 * 7) Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as
		 * hay en el curso actual. Dise�ar un algoritmo para este prop�sito (recuerda
		 * que para calcular el porcentaje puedes hacer una regla de 3). Se preguntar�
		 * por el n�mero de ni�os y el n�mero de ni�as.
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
