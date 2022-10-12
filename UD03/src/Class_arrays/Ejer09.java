/**
 * 
 */
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1,2,3,4,5,6,7,A,B,C
		 * OCEP
		 */
		String[] notation = { "1", "2", "3", "4", "5", "6", "7", "A", "B", "C" };
		String[] palo = { "O", "C", "E", "P"};
		String[] carta= new String[notation.length*palo.length];
		String[] apoyo_carta= new String[notation.length*palo.length];
		
			crear_carta(notation, palo, carta);
			apoyo_carta=carta;
		System.out.println(Arrays.toString(carta));
		//////////////////////////////////
		for (int i = 0; i < carta.length; i++) {
			int j= (int) (Math.random()*carta.length);
			System.err.println(i+"<->"+j);
			String pao =apoyo_carta[j];
			apoyo_carta[j]=apoyo_carta[i];
			apoyo_carta[i]=pao;
		}
		System.out.println(Arrays.toString(carta));
		System.out.println();
		System.out.println(carta[(int) (Math.random()*carta.length)]);
		System.out.println();
	}

	/**
	 * @param notation
	 * @param palo
	 * @param carta
	 */
	public static void crear_carta(String[] notation, String[] palo, String[] carta) {
		for (int j = 0; j < notation.length; j++) {
			for (int k = 0; k < palo.length; k++) {
				carta[j+notation.length*k]=notation[j]+palo[k];
			}
		}
	}

}
