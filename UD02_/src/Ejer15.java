
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer15 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 15.-Introducir dos n�meros por teclado. Imprimir los n�meros naturales que hay
		 * entre ambos (los n�meros tecleados no forman parte de los que se tratan)
		 * n�meros empezando por el m�s peque�o, contar cuantos hay y cu�ntos de ellos
		 * son pares. Calcular la suma de los impares. 
		 */
		int num=Utilidad.leer().leerEntero(""),numf=Utilidad.leer().leerEntero(""),n_par=0,suma_impar=0,in=0;
		if (numf<num) {
			int a =numf;
			numf=num;num=a;
		}
		for (int i = num; i < numf; i++) {
			in++;
			if ((i%=2)==0) {
				n_par++;
			}else {
				suma_impar+=i;
			}
			
			
		}
		System.out.printf("hay %d y %d son pares. %d la suma de los impares.", in,n_par,suma_impar);
	}

}
