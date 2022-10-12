package Class_String_hoja1;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_10/**
						 * Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas
						 * letras distintas tiene y la frecuencia de las mismas, para homogeneizar el
						 * conjunto de letras debemos trabajar solo con mayúscula
						 */
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String frase = "";
		String frase2 = "";
		char apoyo;
		int cantidad;
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
		} while (frase.length() > 60);
		frase2 = frase;
		char[] letras2 = frase.toCharArray();
		String[] letras = frase.split("");
		for (int i = 0; i < letras.length; i++) {
			apoyo = frase2.charAt(i);
			cantidad = 0;
			for (int j = 0; j < letras2.length; j++) {
				if (apoyo == frase2.charAt(j)) {
					cantidad++;
				}
			}
			frase2 = frase.replace("" + apoyo, "");
			letras2 = frase2.toCharArray();
			letras = frase2.split("");

			System.out.printf("%s sale %d veces\n", apoyo, cantidad);
		}
	}
}
