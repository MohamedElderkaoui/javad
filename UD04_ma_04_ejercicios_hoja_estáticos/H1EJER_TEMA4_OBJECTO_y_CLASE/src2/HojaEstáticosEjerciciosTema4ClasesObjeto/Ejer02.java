/**
 * 
 */
package HojaEstáticosEjerciciosTema4ClasesObjeto;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02 /**
					 * 2) Dados dos números P y Q que leeremos por teclado y que deben ser
					 * positivos, hacer un programa que nos diga cuál de los dos tiene más
					 * divisores, con un mensaje que diga “P tiene más divisores que Q” ó viceversa.
					 * Este programa debe llamar a un método que calcule los divisores de un numero,
					 * y lo aplique para P y para Q y luego compare y decida.
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P = -1, Q = -1;
		int Div_P = 0, Div_Q = 0;
		do {
			P = Utilidad.leer().leerEntero("Escribe:");
		} while (P > -1);
		do {
			Q = Utilidad.leer().leerEntero("Escribe:");
		} while (Q > -1);
		Hara_Div(P, Div_P);
		Hara_Div(Q, Div_Q);
		if (Div_P > Div_Q) {
			System.out.printf(" numerodelos divisores de un numero p(%-5d) es mayor que Q(%-5d)", Div_P, Div_Q);
		} else if (Div_P < Div_Q) {
			System.out.printf(" numerodelos divisores de un numero p(%-5d) es menor que Q(%-5d)", Div_P, Div_Q);
		} else if (Div_P == Div_Q) {
			System.out.printf(" numerodelos divisores de un numero p(%-5d) es igual que Q(%-5d)", Div_P, Div_Q);
		}

	}

	/**
	 * @param P
	 * @param Div_P
	 */
	public static void Hara_Div(int P, int Div_P) {
		for (int i = 1; i < (P + 1); i++) {
			if (P % i == 0) {
				Div_P += 1;
			}
		}
	}

}
