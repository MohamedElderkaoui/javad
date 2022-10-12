package Class_String_hoja2;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_06 {
	public static void main(String[] args) {
		/**
		 * Leer una frase por teclado (máximo 80) y a continuación escribir cuantas
		 * vocales, consonantes y caracteres numéricos posee.
		 */
		String frase = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
		} while (frase.length() > 80);

		System.out.println(frase);
		frase=frase.replaceAll("NO", "-");
		frase=frase.replaceAll("NÒ", "-");
		frase=frase.replaceAll("NÓ", "-");
		frase=frase.replaceAll("SI", "NO");
		frase=frase.replaceAll("SÌ", "NO");
		frase=frase.replaceAll("SÍ", "NO");
		frase=frase.replaceAll("-", "si");
		System.out.println(frase);
	}
}
