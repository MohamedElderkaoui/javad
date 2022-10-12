package Class_String_hoja1;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_08 {
	public static void main(String[] args) {
		/**
		 * Leer una frase filtr·ndola que todos sus caracteres sean may˙sculas (repetir
		 * la lectura de teclado hasta que se consiga la condiciÛn de todas may˙sculas),
		 * una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase
		 * (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es
		 * 3, transforme la frase de manera que cada car·cter se transforme en 3 cÛdigos
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
			
			frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
	
		} while (veces > 5);
		do {
			posicion = Utilidad.leer().leerEntero("");
		} while (Utilidad.intervalo(posicion, -1, 11));
		final String mayUsculas = "ABCDEFGHIJKLMN—OPQRSTUVWXYZ¿»Ã“Ÿ¡…Õ”⁄«ABCDEFGHIJKLMN—OPQRSTUVWXYZ¿»Ã“Ÿ¡…Õ”⁄«";
			String[] VFrase = new String[frase.length()];
		String[] VmayUsculas = new String[mayUsculas.length()];
		System.out.println(mayUsculas.length());
		extracted(mayUsculas, VmayUsculas);
		p();
		extracted(frase, VFrase);p();
		for (int i = 0; i < frase.length(); i++) {p();
			System.out.printf("%s   %d", ""+frase.charAt(i),((int) (frase.charAt(i))));
		}
		p();
		codifica_criptor(frase, frasecodificar, posicion, mayUsculas, VFrase, VmayUsculas);
		extracted(frase, VFrase);
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
