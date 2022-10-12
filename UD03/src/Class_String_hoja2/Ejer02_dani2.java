package Class_String_hoja2;

import java.util.Arrays;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_dani2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 3;
		String[] nombre = new String[num];
		String[] apreido = new String[num];
		int num2 = num * num;
		String[] nombreapreido = new String[num2];
		String[] nombreapreido_apoyo = new String[num2];
		for (int i = 0; i < nombre.length; i++) {
			nombre[i] = Utilidad.leer().leerCadena("".format("nombre%2d", i));
		}
		for (int i = 0; i < apreido.length; i++) {
			apreido[i] = Utilidad.leer().leerCadena("".format("apreido%2d", i));
		}
		for (int i = 0; i < nombre.length; i++) {
			for (int j = 0; j < apreido.length; j++) {
				nombreapreido[i * nombre.length + j] = nombre[i] + " " + apreido[j];
			}
		}
		nombreapreido_apoyo = nombreapreido;
	//	System.out.println(Arrays.toString(nombreapreido));
		int j = 0, j2 = 0;
		for (int i = 0; i < nombreapreido.length; i++) {
			j = (int) Math.ceil(num2 * Math.random()) - 1;
			String apoyo = nombreapreido_apoyo[j];
			nombreapreido_apoyo[j] = nombreapreido_apoyo[i];
			nombreapreido_apoyo[i] = apoyo;
		}
		for (int i = 0; i < 3; i++) {
			System.out.printf(" %s,",nombreapreido_apoyo[i]);
		}
	}
}
