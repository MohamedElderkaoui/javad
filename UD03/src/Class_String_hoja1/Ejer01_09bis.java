package Class_String_hoja1;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_09bis {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Escribir un programa que lea c�digos de personas de 8 caracteres de modo que
		 * los cuatro primeros sean num�ricos y contenidos entre 1990-1995 (un a�o), el
		 * quinto car�cter sea solo (H � M) sexo, el sexto un numero que representa el
		 * curso 1 � 2 y los caracteres s�ptimo y
		 * 
		 * octavo pueden tener cualquier valor. Deben rechazarse los c�digos que no
		 * cumplan estas condiciones, la finalizaci�n de entrada de c�digos se produce
		 * cuando se introduce el c�digo �00000000�. Al final el programa debe sacar un
		 * informe indicando cu�ntos hombres y mujeres hay matriculados en primero y
		 * segundo y cu�ntos c�digos correctos han sido le�dos.
		 */
		// TODO Auto-generated method stub
		String lectura;
		boolean correcta;
		int contadorFrases  = 0, frasesErroneas = 0, H = 0, hombres2 = 0, mujeres1 = 0, mujeres2 = 0;
		lectura = Leer.leerCadena("Introduce la cadena a tratar");
		do{
			contadorFrases++;
			correcta = true;
			// lectura = lectura.toUpperCase();
			if (lectura.length() == 8) {
				if (!lectura.substring(0, 3).equals("199")) {// compruebo las tres primeras posiciones
					correcta = false;
				}
				if (!"012345".contains(lectura.substring(3, 4))) {// el �ltimo del a�o
					correcta = false;
				}
				if (!"HM".contains(lectura.substring(4, 5))) {
					correcta = false;
				}
				if (!"12".contains(lectura.substring(5, 6))) {
					correcta = false;
				}
			} else {
				correcta = false;
			}
			// fin de comprobaciones
			if (correcta) {
				switch (lectura.substring(4, 6)) {
				case "H1":
					H++;
					break;
				case "H2":
					hombres2++;
					break;
				case "M1":
					mujeres1++;
					break;
				case "M2":
					mujeres2++;
					break;
				}
		
			} else {
				frasesErroneas++;
			}
			System.out.printf("valores %d %d \n hombre1 %d  hombre2 %d \n hombre1 %d  hombre2 %d  ", frasesErroneas,contadorFrases,H,hombres2,mujeres1,mujeres2);
			
			lectura = Leer.leerCadena("Introduce la cadena a tratar");
		}while (!(lectura.equals("00000000"))) ;
		System.out.println("Valores " + frasesErroneas + " " + contadorFrases + " H1 " + H + " H2 " + hombres2
				+ " M1 " + mujeres1 + " M2 " + mujeres2);
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
