package Class_String_hoja2;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_07 {
	public static void main(String[] args) {
		/**
		 * Leer una frase por teclado (máximo 80) y a continuación escribir cuantas
		 * vocales, consonantes y caracteres numéricos posee.
		 */
		String frase = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
		} while (frase.length() > 80);
		final String VOLCAL = "AEIOUÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÂÊÎÔÛ";
		final String CONTINUACION = "BCDFGHJKLMNÑPQRSTVWXYZ";
		final String num = "1234567890";

		//////////// System.out.println(minUsculas);
		int numA[] = new int[VOLCAL.length()];
		for (int j = 0; j < VOLCAL.length(); j++) {
			for (int i = 0; i < frase.length(); i++) {
				if ((frase.charAt(i) + "").compareTo(("" + VOLCAL.charAt(j))) == 0) {
					numA[j]++;
					System.out.print((frase.charAt(i) + ""));
				}
			}// for (int i = 0; i < frase.length(); i++)

			System.out.println(String.format("\n" + "numero de %s:%d\n" + "",/** frase,*/("" + VOLCAL.charAt(j)), numA[j]));
		} //for (int j = 0; j < VOLCAL.length(); j++)
	}
}
