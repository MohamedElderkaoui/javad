package Class_String_hoja2;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_06 {
	public static void main(String[] args) {
		/**
		 * Leer una frase por teclado (m�ximo 80) y a continuaci�n escribir cuantas
		 * vocales, consonantes y caracteres num�ricos posee.
		 */
		String frase = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
		} while (frase.length() > 80);

		System.out.println(frase);
		frase=frase.replaceAll("NO", "-");
		frase=frase.replaceAll("N�", "-");
		frase=frase.replaceAll("N�", "-");
		frase=frase.replaceAll("SI", "NO");
		frase=frase.replaceAll("S�", "NO");
		frase=frase.replaceAll("S�", "NO");
		frase=frase.replaceAll("-", "si");
		System.out.println(frase);
	}
}
