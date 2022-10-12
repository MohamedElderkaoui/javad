package HojaEstáticosEjerciciosTema4ClasesObjeto;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01 {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		int num =Utilidad.leer().leerEntero("num");
		es_o_no_primo(num);
	}

/**
 * @param num
 */
public static void es_o_no_primo(int num) {
	int validad=-1;
	for (int i = 2; i <num+1; i++) {
		if (!extracted(num, i)) {
			validad=0;
		} else if (extracted(num, i)) {
			validad=1;
			break;
		}
	}
	if (validad==0) {
		System.out.printf("%-4d es caomplejo", num);
	} else if (validad==1) {
		System.out.printf("%-4d es primo", num);
	}
}

/**
 * @param num
 * @param desision
 * @return
 */
public static boolean extracted(int num, int desision) {
	return (num%desision)==0;
}
}
