
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
		 * 15.-Introducir dos números por teclado. Imprimir los números naturales que hay
		 * entre ambos (los números tecleados no forman parte de los que se tratan)
		 * números empezando por el más pequeño, contar cuantos hay y cuántos de ellos
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
