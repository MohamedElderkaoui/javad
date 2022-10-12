package Class_String_hoja1;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_09 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Escribir un programa que lea códigos de personas de 8 caracteres de modo que
		 * los cuatro primeros sean numéricos y contenidos entre 1990-1995 (un año), el
		 * quinto carácter sea solo (H ó M) sexo, el sexto un numero que representa el
		 * curso 1 ó 2 y los caracteres séptimo y
		 * 
		 * octavo pueden tener cualquier valor. Deben rechazarse los códigos que no
		 * cumplan estas condiciones, la finalización de entrada de códigos se produce
		 * cuando se introduce el código “00000000”. Al final el programa debe sacar un
		 * informe indicando cuántos hombres y mujeres hay matriculados en primero y
		 * segundo y cuántos códigos correctos han sido leídos.
		 */
		String frase = "";
		boolean correcta = false;
		int ContadoFrase = 0, fraseError = 0, H1 = 0, H2 = 0, M1 = 0, M2 = 0;
		do {
			ContadoFrase += 1;
			correcta = true;
			frase = Utilidad.leer().leerCadena("Introduce la cadena a tratar:").toUpperCase();
			if (frase.length() == 8) {
//				if (frase.substring(0, 3).equals("199")) {
//					correcta = false;
//				}
				extracted(frase, 0, 1, "1");
				extracted(frase, 1, 2, "9");
				extracted(frase, 2, 3, "9");
				extracted(frase, 3, 4, "012345");
				extracted(frase, 4, 5, "HM");
				extracted(frase, 5, 6, "12");

			} else {
				correcta = false;
			}
			if (correcta) {
				switch (trozo(frase, 4, 6)) {
				case "H1":
					H1++;
					break;
				case "H2":
					H2++;
					break;
				case "M1":
					M1++;
					break;
				case "M2":
					M2++;
					break;

				default:
					break;
				}
			} else {
				fraseError++;
			}
			System.out.printf("valores %d %d \n hombre1 %d  hombre2 %d \n hombre1 %d  hombre2 %d  ", fraseError,ContadoFrase,H1,H2,M1,M2);
		} while (!(frase.equals("00000000")));
	}

	/**
	 * @param frase
	 * @param l1
	 * @param l2
	 * @param string
	 */
	public static void extracted(String frase, int l1, int l2, String string) {
		boolean correcta;
		if (!(string.contains(trozo(frase, l1, l2)))) {
			correcta = false;
		}
	}

	/**
	 * @param frase
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static String trozo(String frase, int l1, int l2) {
		return frase.substring(l1, l2);
	}
}
