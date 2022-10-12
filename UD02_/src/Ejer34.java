/**
 * 
 */
/**
		 * 34.-Hacer un programa que lea las calificaciones de un alumno en 10
		 * asignaturas, las almacene en un vector y calcule e imprima su media.
		 * 
		 */
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lista_de_alumnos = 2;
		String[] nombre = new String[lista_de_alumnos];
		int notas[][] = new int[lista_de_alumnos][3];
		for (int i = 0; i < nombre.length; i++) {
			nombre[i] = Utilidad.leer().leerCadena("");
			for (int j = 0; j < notas[i].length; j++) {
				
				ponerLaNota(nombre, notas, i, j);
			}
		}
		for (int i = 0; i < nombre.length; i++) {
			System.out.printf("%s[%f,%f,%f]\n", nombre[i], notas[i][0] * 1.00, notas[i][1] * 1.00, notas[i][2] * 1.00);
		}
	}

	/**
	 * @param nombre
	 * @param notas
	 * @param i
	 * @param j
	 * pone la nota 
	 * 
	 */
	public static void ponerLaNota(String[] nombre, int[][] notas, int i, int j) {
	
		do {
			
			notas[i][j] = Utilidad.leer().leerEntero(i + ".-" + "" + nombre[i] + "(" + i + "):" + "");
		} while ((notas[i][j]  <0)||(notas[i][j]  >10));
	}

}
