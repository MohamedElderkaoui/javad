package HojaEst�ticosEjerciciosTema4ClasesObjeto;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer07 /**
					 * Escribir un m�todo al que se le d� como par�metro un valor r que representa
					 * el radio de una, figura una opci�n y un dato entero que ser� 1/2/3. El m�todo
					 * debe devolver: a. En el caso opcion1 la longitud del circulo de radio r dada
					 * por la expresi�n 2*pi*r b. En el caso opci�n 2 la superficie del circulo dada
					 * por la expresi�n pi*r2 c. En el caso opci�n 3 el volumen de una esfera de
					 * radio r dada por la expresi�n 4/3*pi*r3 NOTA:pi debe defnirse como una
					 * constante
					 */
{
	public static void main(String[] args) {
		final double pi = Math.PI;
		String[] mune= { "salir"
				, "el volumen de una esfera de radio r","longitud del circulo de radio r","la superficie del circulo de radio r"
				};
		int r = Utilidad.leer().leerEntero("radio;");
		int opcion = Utilidad.leer().leer_opcion_menu("numero()",mune);
		extracted(pi, r, opcion);
	}

	/**
	 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
	 * @CONSTANS finalpi
	 * @param r
	 * @param opcion
	 */
	public static void extracted( double pi, int r, int opcion) {
		if (opcion==1) {
			System.out.printf("2*pi*r=2*pi*%d=%4.2f", r,(2*pi*r));
		}else if (opcion==2) {
			System.out.printf("pi*r2=pi*%d=%4.2f", r,(pi*r));
			
		}else if (opcion==3) {
			System.out.printf("4/3*pi*r=pi*%d=%4.2f", r,(4/3*pi*r));
		}
	}
}
