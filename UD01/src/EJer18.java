/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class EJer18 {
	/**
	 * º
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 18) Algoritmo que muestre cuántos números hay múltiplos de 2, cuántos hay
		 * múltiplos de 3, entre 1 y 100.
		 */
		int mutp2 = 0;
		int mutp3 = 0;
		for (int i = 1; i < 101; i++) /**
										 * para (int i = 1; i <101; i ++)
										 * 
										 **/
		{System.out.println(i);
			if (i % 2 == 0)/**
							 * 
							 * si i % 2 == 0 
							 * mutp2=mutp2+1;
							 * 
							 */
			{ mutp2 += 1; }
			if (i % 3 == 0)/**
							 * si i % 3 == 0
							 * 		 mutp3=mutp3+1;
							 */
			{ mutp3 += 1; }
		}
		System.out.printf("en el intrevalo \n " + "hay %3d múltiplos de "
				+ "2\n " + "hay %3d múltiplos de 2 ", mutp2,
				mutp3);
	}

}
