package Class_String_hoja2;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02_dani {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 10;
		String[] nombre = new String[num];
		String[] apreido = new String[num];
		for (int i = 0; i < nombre.length; i++) {
			nombre[i]=Utilidad.leer().leerCadena("".format("nombre%2d", i));
		}
		for (int i = 0; i < apreido.length; i++) {
			apreido[i]=Utilidad.leer().leerCadena("".format("apreido%2d", i));
		}
		int j=0,j2=0;
		for (int i = 0; i < 10; i++) {
			j=(int)Math.ceil(num*Math.random())-1; j2=(int)Math.ceil(num*Math.random())-1;
			System.out.printf("%S %s\n", nombre[j],apreido[j2]);
		}
	}
}
