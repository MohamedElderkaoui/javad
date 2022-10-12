package Class_arrays;

import java.util.Scanner;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 * @author Danil
 *
 */
public class Leer {

	// Clase Leer que leer� diferentes tipos

	// M�todo leerEntero devuelve el entero leido
	public static int leerEntero(String str) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.print(str);
		valor = teclado.nextInt();

		// teclado.close();
		return valor;
	}

	public static double leerDouble(String str) {

		double valor;
		String valorSTR;
		Scanner teclado = new Scanner(System.in);

		System.out.print(str);
		// valor = teclado.nextDouble();
		valorSTR = teclado.next();
		if (valorSTR.indexOf(".") > 0) {
			valorSTR.replace(".", ",");
		}
		valor = Double.parseDouble(valorSTR);

		return valor;
	}

	public static String leerCadena(String str) {

		String valor;
		Scanner teclado = new Scanner(System.in);

		System.out.print(str);
		valor = teclado.nextLine();

		return valor;
	}

	public static boolean esPrimo(int num) {
		boolean valor = // false
				true;
//		
//		if ((num%2 !=0 && num%3 !=0 && num%5 != 0) || (num == 2 || num == 3 || num == 5) )
//			valor = true;
		int num2 = num;
		for (int i = 2; i <= num2 / 2; i++) {
			if (num % i == 0) {
				valor = false;
				break;
			}
		}
		return valor;
	}

	public static int miFactorial(int num) {
		int valor = 0;

		if (num > 0) {
			valor = 1;
			for (int i = 1; i <= num; i++)
				valor = valor * i;
		}

		return valor;
	}

	public static void tablaMultiplicar(int num) {
		System.out.println("Tabla de multiplicar de " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%4d x %02d = %3d\n", num, i, (num * i));
		}

	}

	public static double miMedia(double[] vector) {
		double valor = 0.0, suma = 0.0;

		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}

		valor = suma / vector.length;

		return valor;
	}

	public static double misuma(double[] vector) {
		double valor = 0.0, suma = 0.0;

		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}

		valor = suma;

		return valor;
	}

	public static double miMedia(int[] vector) {
		double valor = 0.0, suma = 0.0;

		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}

		valor = suma / vector.length;

		return valor;
	}

	public static int miBusca(double[] vector, double nota) {
		int valor = -1;
		boolean encontrado = false;

		for (int i = 0; i < vector.length; i++) {
			// if(vector[i] == nota && encontrado == false) {
			if (vector[i] == nota && !encontrado) {
				valor = i + 1;
				encontrado = true;
			}

		}

		return valor;
	}

	public static int miBusca(String[] vector, String nota) {
		int valor = -1;
		boolean encontrado = false;

		for (int i = 0; i < vector.length; i++) {
			// if(vector[i] == nota && encontrado == false) {
			if (vector[i].compareTo(nota) == 0 && !encontrado) {
				valor = i + 1;
				encontrado = true;
			}

		}

		return valor;
	}

	public static int miBusca1(String[] vector, String nota) {
		int valor = -1;
		boolean encontrado = false;

		for (int i = 0; i < vector.length; i++) {
			// if(vector[i] == nota && encontrado == false) {
			if (vector[i].compareToIgnoreCase(nota) == 0 && !encontrado) {
				valor = i + 1;
				encontrado = true;
			}

		}

		return valor;
	}

	public static int miBusca(int[] vector, int nota) {
		int valor = -1;
		boolean encontrado = false;

		for (int i = 0; i < vector.length; i++) {
			// if(vector[i] == nota && encontrado == false) {
			if (vector[i] == nota && !encontrado) {
				valor = i + 1;
				encontrado = true;
			}

		}

		return valor;
	}

	/**
	 * 
	 * String name = "";
	 * 
	 * @param String[] miles = { "", "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM",
	 *                 "MMMMMMM", "MMMMMMMMM", "M" };
	 * @param String[] cienes = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
	 *                 "DCCC", "CM" };
	 * @param String[] diezes = { "", "X","XX", "XXX", "XL", "L", "LX", "LXX",
	 *                 "LXXX", "XC" };
	 * @param String[] unidades = {"", "i", "ii", "iii", "iv", "v", "vi", "vii",
	 *                 "viii", "iv" };
	 * 
	 * @param num
	 * @return
	 */
	public static String name(int num) {
		String name = "";
		String[] miles = { "", "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMMM", "MMMMMMMMM" };
		String[] cienes = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String[] diezes = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] unidades = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		return miles[num / 1000] + cienes[(num % 1000) / 100] + diezes[(num % 100) / 10] + unidades[num % 10];
	}

	/************************************************************************
	 * @param vector
	 * 
	 ************************************************************************
	 */
	public static void ordernar_str(String[] vector) {
		// Ordenar
		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = 0; j < vector.length - 1; j++) {

				if (vector[j].compareTo(vector[j + 1]) > 0) {

					String aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;

				}

			}

		}
	}

	/************************************************************************
	 * @param vector
	 * 
	 ************************************************************************
	 */
	public static void ordernar_int(int[] vector) {
		// Ordenar
		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = 0; j < vector.length - 1; j++) {

				if ((""+vector[j]).compareTo(""+vector[j + 1]) > 0) {

					int aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;

				}

			}

		}
	}
	/************************************************************************
	 * @param vector
	 * 
	 ************************************************************************
	 */
	public static void ordernar_int_reversed(int[] vector) {
		// Ordenar
		for (int i = 0; i < vector.length ; i++) {
			for (int j = 0; j < vector.length - 1; j++) {

				if ((""+vector[j]).compareTo(""+vector[j + 1]) < 0) {

					int aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;

				}

			}

		}
	}

}