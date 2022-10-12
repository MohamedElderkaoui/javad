import java.util.Arrays;

/**
 * 35.-Usando el ejemplo anterior, hacer un programa que busque una nota en el
 * vector.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer35 {
	/**
	 * 
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lista_de_alumnos = 2;
		String[] nombre = new String[lista_de_alumnos];
		int notas[][] = new int[lista_de_alumnos][3];
		int mnota []= new int[lista_de_alumnos];
		for (int i = 0; i < nombre.length; i++) {
			nombre[i] = Utilidad.leer().leerCadena("nom");
			for (int j = 0; j < notas[i].length; j++) {

				ponerLaNota(nombre, notas, i, j);
			}
		}
		for (int i = 0; i < mnota.length; i++) {
			mnota[i] = (int) Math.ceil(Utilidad.leer().miMedia(notas[i]))
					;
				}
		for (int i = 0; i < nombre.length; i++) {
			System.out.printf("%s[%f,%f,%f]\n", nombre[i], notas[i][0] * 1.00, notas[i][1] * 1.00, notas[i][2] * 1.00);
		}
		int nota_a_buscar = Utilidad.leer().leerEntero("una nota");
		int miBusca_nota = Leer.miBusca(mnota, nota_a_buscar);
		extracted(miBusca_nota);
		
	}

	/**
	 * @param miBusca_nota
	 */
	public static void extracted(int miBusca_nota) {
		System.out.println(miBusca_nota);
	}

	/**
	 * @param nombre
	 * @param notas
	 * @param i
	 * @param j      pone la nota
	 * 
	 */
	public static void ponerLaNota(String[] nombre, int[][] notas, int i, int j) {
		do {
			System.out.println(i);
			System.out.println(j);
				notas[i][j] = Utilidad.leer().leerEntero(i + ".-" + "" + nombre[i] + "(" + i + "):" + "");
			} while (extracted(notas, i, j));
	}

	/**
	 * @param notas
	 * @param i
	 * @param j
	 * @return
	 */
	public static boolean extracted(int[][] notas, int i, int j) {
		return (notas[i][j]  <0)||(notas[i][j]  >10);
	}
}