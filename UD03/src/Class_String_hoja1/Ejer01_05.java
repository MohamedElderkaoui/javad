package Class_String_hoja1;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_05 {
	public static void main(String[] args) {
		/**
		 * Leer una frase por teclado (m�ximo 80 car) y construir otras dos cadenas de
		 * forma que una contenga los caracteres en posici�n par y la otra los
		 * caracteres en posici�n impar.
		 */
		String frase = "";
		String caracteres_en_posici�n_par = "";
		String caracteres_en_posici�n_impar = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toLowerCase();
		} while (frase.length() > 80);
		for (int i = 0; i < frase.length(); i++) {
			boolean b = i%2==0;
			if (b) {
				caracteres_en_posici�n_par=caracteres_en_posici�n_par+frase.substring(i, i+1);
			}else if (!b) {
				caracteres_en_posici�n_impar=caracteres_en_posici�n_impar+frase.substring(i, i+1);
			}
		}
		System.out.println(frase+""
				+ "\n"
				+ caracteres_en_posici�n_par
				+ "\n"
				+ caracteres_en_posici�n_impar
				+ ""
				+ "");
		
	}
}
