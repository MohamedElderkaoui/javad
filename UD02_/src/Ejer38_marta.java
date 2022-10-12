import java.util.Arrays;

/**
 * 37.-Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1
 * y 100, y hacer su matriz transpuesta.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer38_marta {
	/**
	 * donde esta los indice 
	 * i,j
	 * @param args
	 */
	public static void main(String[] args) {
		int vNum[][] = new int[4][5];
		for (int i = 0; i < vNum.length; i++) {
			for (int j = 0; j < vNum[i].length; j++) {
			vNum[i][j] 	= (int) Math.ceil(Math.random()*100);
				
				
				
				
			}
			
		}
		System.out.println("Matriz: ");
		for (int i = 0; i < vNum.length; i++) {
			for (int j = 0; j < vNum[i].length; j++) {
				System.out.printf("%d ", vNum[i][j]);
				
			}System.out.println();
		}
		
		System.out.println("");
		
		System.out.println("Matriz: ");
		for (int i = 0; i < vNum[1].length; i++) {
			for (int j = 0; j < vNum.length; j++) {
				System.out.printf("%d ", vNum[j][i]);
				
			}System.out.println();
		}
		
	}
}
