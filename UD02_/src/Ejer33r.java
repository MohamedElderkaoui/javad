/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer33r {
	public static void main(String[] args) {
		//String vector[] = new String[20];
				String vector[] = {"Miguel","Alvaro","Daniel","Mohamed","Pilar","Omar"};
				
				System.out.println("Hay "+vector.length);
				
				for (int i = 0; i < vector.length; i++) {
					System.out.println(vector[i]);
				}
				
				
				ordernar_str(vector);
				
				System.out.println("\n\t ---- Ordenado ---- \n");
				
				for (int i = 0; i < vector.length; i++) {
					System.out.println(vector[i]);
				}
				
	}

	/**
	 * @param vector
	 */
	public static void ordernar_str(String[] vector) {
		//Ordenar
		for (int i = 0; i < vector.length-1; i++) {
			for (int j = 0; j < vector.length-1; j++) {
				
				if(vector[j].compareTo(vector[j+1]) > 0) {
					
					String aux = vector[j];
					vector[j]= vector[j+1];
					vector[j+1]=aux;
							
				}
				
			}
			
		}
	}
	
}
