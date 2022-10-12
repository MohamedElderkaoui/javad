package Class_String_hoja1;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_07 {
	public static void main(String[] args) {
		/**
		 * Dada una frase de no más de 80 caracteres hacer un programa que busque
		 * cuántas mayúsculas y minúsculas tiene y lo imprima
		 */
		String frase = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:");
		} while (frase.length() > 80);
		final String mayUsculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		final String minUsculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toLowerCase();
		final String num = "1234567890";

		//////////// System.out.println(minUsculas);
		int numMAYUS = 0, numMINUSCULA = 0, numNUM = 0;
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < mayUsculas.length(); j++) {
				if ((frase.charAt(i) + "").compareTo(("" + mayUsculas.charAt(j))) == 0) {
					numMAYUS++;
					System.out.print(frase.charAt(i));
				}
			}
		}
		System.out.println();
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < minUsculas.length(); j++) {
				if ((frase.charAt(i) + "").compareTo(("" + minUsculas.charAt(j))) == 0) {
					numMINUSCULA++;
					System.out.print(frase.charAt(i));
				}
			}
		}
		System.out.println();
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < num.length(); j++) {
				if ((frase.charAt(i) + "").compareTo(("" + num.charAt(j))) == 0) {
					numNUM++;
					System.out.print(frase.charAt(i));
				}
			}

		} // for (int i = 0; i < frase.length(); i++)
		System.out.println(String.format("%s\n" + "numero de mayuscula:%d\n" + "" + "numero de minUsculas:%d\n" + ""
				+ "numero de NUMEORO:%d\n" + "numero de caracte:%d\n" + "", frase, numMAYUS, numMINUSCULA, numNUM,( frase.length()-numMAYUS-numMINUSCULA-numNUM)));
	}
}
