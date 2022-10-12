package Class_String_hoja1;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_06 {
	public static void main(String[] args) {
		/**
		 * Leer una frase por teclado (máximo 80) y a continuación escribir cuantas
		 * vocales, consonantes y caracteres numéricos posee.
		 */
		String frase = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
		} while (frase.length() > 80);
		final String VOLCAL = "AEIOU";
		final String CONTINUACION = "BCDFGHJKLMNÑPQRSTVWXYZ";
		final String num = "1234567890";

		//////////// System.out.println(minUsculas);
		int numVOLCAL = 0, numCONTINUACION = 0, numNUM = 0;
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < VOLCAL.length(); j++) {
				if ((frase.charAt(i) + "").compareTo(("" + VOLCAL.charAt(j))) == 0) {
					numVOLCAL++;
				}
			}

			for (int j = 0; j < CONTINUACION.length(); j++) {
				if ((frase.charAt(i) + "").compareTo(("" + CONTINUACION.charAt(j))) == 0) {
					numCONTINUACION++;
				}
			}

			for (int j = 0; j < num.length(); j++) {
				if ((frase.charAt(i) + "").compareTo(("" + num.charAt(j))) == 0) {
					numNUM++;
				}
			}

		} // for (int i = 0; i < frase.length(); i++)
		System.out.println(String.format("%s\n" + "numero de mayuscula:%d\n" + "" + "numero de continuación:%d\n" + ""
				+ "numero de NUMEORO:%d\n" + "", frase, numVOLCAL, numCONTINUACION, numNUM));
	}
}
