import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 19) Leer tres números que compongan una fecha (día, mes, año). Comprobar que
		 * es una fecha válida. Si no es válida escribir un mensaje de error. Si es
		 * válida escribir la fecha cambiando el número del mes por su nombre. Ej. Si se
		 * introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año debe
		 * ser mayor que 0. (Usa la estructura caso de o según).
		 */
		int dia, mes, anyo;
		Scanner teclados = new Scanner(System.in);
		String x = "números enteros";
		System.out.println(x);
		dia = teclados.nextInt();
		x = "números enteros";
		System.out.println(x);
		mes = teclados.nextInt();
		x = "números enteros";
		System.out.println(x);
		anyo = teclados.nextInt();
		boolean correcto = true;
		if (anyo <= 0) {
			System.err.println("Fecha imposible");
		} else {
			if (Utilidad.o(mes < 1, mes > 12)) {
				System.err.println("Fecha imposible");
			} else {
				if (Utilidad.o(dia < 1, dia > 31)) {
					System.err.println("Fecha imposible");

				} else {
					if (Utilidad.y(Utilidad.o(Utilidad.o(mes == 4, mes == 6), Utilidad.o(mes == 9, mes == 11)),
							dia > 31)) {
						System.err.println("Fecha imposible");
					} else {
						if (mes == 2) {
							if (Ejer19conMetodo.verifica(anyo)) {
								if (dia > 29) {
									System.err.println("Fecha imposible");
									correcto = false;
								}
							} else if (dia > 28) {
								System.out.println("Fecha imposible");
								correcto = false;
							}

						}
						if (correcto) {
							switch (mes) {
							case 1: {
								System.out.printf("%02d de enero de %-4d", dia, anyo);
								break;
							}
							case 2: {
								System.out.printf("%02d de febrero de %4d", dia, anyo);
								break;
							}
							case 3: {
								System.out.printf("%02d de marzo de %4d", dia, anyo);
								break;
							}
							case 4: {
								System.out.printf("%02d de abril de %4d", dia, anyo);
								break;
							}
							case 5: {
								System.out.printf("%02d de mayo de %4d", dia, anyo);
								break;
							}
							case 6: {
								System.out.printf("%02d de junio de %4d", dia, anyo);
								break;
							}
							case 7: {
								System.out.printf("%02d de julio de %4d", dia, anyo);
								break;
							}
							case 8: {
								System.out.printf("%02d de agosto de %4d", dia, anyo);
								break;
							}
							case 9: {
								System.out.printf("%02d de septiembre de %4d", dia, anyo);
								break;
							}
							case 10: {
								System.out.printf("%02d de octrobre de %4d", dia, anyo);
								break;
							}
							case 11: {
								System.out.printf("%02d de nomiembre de %4d", dia, anyo);
								break;
							}
							case 12: {
								System.err.println();

								System.out.printf("%02d de diciembre de %4d", dia, anyo);
								break;
							}
							}
						}
					}
				}
			}
		}
	}

//	/**
//	 * 
//public class Ejer19conMetodo {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/**
//		 * 19) Leer tres números que compongan una fecha (día, mes, año). Comprobar que
//		 * es una fecha válida. Si no es válida escribir un mensaje de error. Si es
//		 * válida escribir la fecha cambiando el número del mes por su nombre. Ej. Si se
//		 * introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año debe
//		 * ser mayor que 0. (Usa la estructura caso de o según).
//		 */
//		int anyo;
//		Scanner teclados = new Scanner(System.in);
//		String x = "números enteros";
//
//		x = "números enteros";
//		System.out.println(x);
//		anyo = teclados.nextInt();
//		boolean correcto = true;
//		correcto = verifica(anyo);
//		if (correcto) {
//
//		} else if (!correcto) {
//
//		}
//	}
//
////
//	/**
//	 * if (anyo % 4 == 0) { 
//	 * 			System.out.printf("%-4d es un año biseto m", anyo);
//	 *			 return correcto = true;
//	 *  }else { 
//	 *  		System.out.printf("%-4d es un año biseto m",anyo); 
//	 *  		return correcto = false; 
//	 *  }
//	 */
//	/**
//	 * 
//	 * @param anyo
//	 */
//	public static boolean verifica(int anyo) {
//		boolean correcto = false;
//		if ((anyo % 4 == 0)&&((anyo % 100 == 0)||(anyo % 400 == 0)) ){
//			System.out.printf("%-4d es un año biseto m", anyo);
//			return correcto = true;
//		} else {
//			System.out.printf("%-4d es un año biseto m", anyo);
//			return correcto = false;
//		}
//	}
//}
}
