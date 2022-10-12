package Class_String_hoja1;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_08_2 {
	public static void main(String[] args) {
		/**
		 * Leer una frase filtrándola que todos sus caracteres sean mayúsculas (repetir
		 * la lectura de teclado hasta que se consiga la condición de todas mayúsculas),
		 * una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase
		 * (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es
		 * 3, transforme la frase de manera que cada carácter se transforme en 3 códigos
		 * ASCII mas es decir :
		 * 
		 * Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
		 * 
		 * Desarrollar los programas de codificar y descodificar mediante dos funciones.
		 */
		String frase = "";
		String frasecodificar = "";
		int posicion = 0;
		int veces = 0;
		do {veces++;
			
			frase = Utilidad.leer().leerCadena("escribre frase:");
	System.out.println(frase);
		} while (veces > 5);
//		do {
//			posicion = Utilidad.leer().leerEntero("");
//		} while (Utilidad.intervalo(posicion, -1, 11));
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < frase.length(); i++) {
				frasecodificar = frasecodificar + ((char) (j + (int)frase.charAt(i)));
			}
			System.out.println(frasecodificar);frasecodificar="";
		}
	}

	/**
	 * @param frase
	 * @param frasecodificar
	 * @param posicion
	 * @param mayUsculas
	 * @param VFrase
	 * @param VmayUsculas
	 */
	public static void codifica_criptor(String frase, String frasecodificar, int posicion, final String mayUsculas,
			String[] VFrase, String[] VmayUsculas) {
		for (int i = 0; i < VFrase.length; i++) {
			for (int j = 0; j < VmayUsculas.length/2; j++) {
				
					if (extracted(frase, i).compareTo(extracted(mayUsculas, j)) == 0) {
						frasecodificar = frasecodificar + VmayUsculas[(j+posicion)];
						
					} 
				
			}
		}
		for (int i = 0; i < frasecodificar.length(); i++) {p();
		System.out.printf("%s   %d", ""+frasecodificar.charAt(i),((int) (frasecodificar.charAt(i))));
	}
		System.out.println(frasecodificar);
	}

	/**
	 * @param frase
	 * @param i
	 * @return
	 */
	public static String extracted(String frase, int i) {
		return ""+frase.charAt(i)+"";
	}

	/**
	 * 
	 */
	public static void p() {
		System.out.println();
	}

	/**
	 * @param mayUsculas
	 * @param VmayUsculas
	 */
	public static void extracted(final String mayUsculas, String[] VmayUsculas) {
		for (int i = 0; i < mayUsculas.length(); i++) {
			VmayUsculas[i] = "" + mayUsculas.charAt(i);
			System.out.printf("%s", VmayUsculas[i]);
		}
	}
}
