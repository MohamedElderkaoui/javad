/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer28 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 28.-Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz
		 */
		int moneda_al_aire= (int) (Math.random()*2);
		System.out.println((moneda_al_aire==0)?"salido cara":"salido cruz");
		
	}
}
