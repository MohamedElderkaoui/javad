
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer30 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 30.-Simular una carrera de caballos, tienen que recorrer 40 metros y en cada
		 * ronda avanzan entre 1 y 5 metros. Gana el que supera antes los 40 metros.
		 * 
		 */
		int[] carrera= new int[5];
		carrera[0]=0; 
		carrera[1]=0; 
		carrera[2]=0; 
		carrera[3]=0; 
		carrera[4]=0; 
		do {
		
			for (int i = 0; i < carrera.length; i++) {
				carrera[i]+=(int)( Math.random()*5+1);
				System.out.print("caballos"+i);
				System.out.printf("%"
						+ carrera[i]
						+ "s", "||\n");
				if (carrera[i]>=40) {
					System.out.print("\ncaballos"+i);
				}
			}			
			System.out.println("\n----------------------\n");
			
		} while (!(carrera[0]>=40||carrera[1]>=40||carrera[2]>=40||carrera[3]>=40||carrera[4]>=40));
		for (int i = 0; i < carrera.length; i++) {
			if (carrera[i]>=40) {
				System.out.printf("\ncaballos %02d",i);
			}
		}
	}
}
