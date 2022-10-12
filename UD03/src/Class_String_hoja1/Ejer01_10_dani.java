package Class_String_hoja1;

import java.util.Arrays;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_10_dani/**
						 * Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas
						 * letras distintas tiene y la frecuencia de las mismas, para homogeneizar el
						 * conjunto de letras debemos trabajar solo con mayúscula
						 */
{
	/**
	 * 
	 * @param args
	 */
//	public static void main(String[] args) {
//
//		String frase = "";
//		String frase2 = "";
//		char apoyo;
//		int cantidad;
//		do {
//			frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
//		} while (frase.length() > 60);
//		frase2 = frase;
//		char[] letras2 = frase.toCharArray();
//		String[] letras = frase.split("");
//		for (int i = 0; i < letras.length; i++) {
//			apoyo = frase2.charAt(i);
//			cantidad = 0;
//			for (int j = 0; j < letras2.length; j++) {
//				if (apoyo == frase2.charAt(j)) {
//					cantidad++;
//				}
//			}
//			frase2 = frase.replace("" + apoyo, "");
//			letras2 = frase2.toCharArray();
//			letras = frase2.split("");
//
//			System.out.printf("%s sale %d veces\n", apoyo, cantidad);
//		}
//	}
	public static void main(String[] args) {
		
		
		String str = "BUENOS DIÀS";
		int posLetra=0;
		
		//String str2 = "BUENAS NOCHES";
		
		
		char letra[] = new char[str.length()]; //60 max
		int veces[] = new int[str.length()];
		
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
			//ver si existe la letra
			int pos=-1;
			for (int j = 0; j < letra.length; j++) {
				
				if(letra[j] == str.charAt(i)) {
					pos=j;
					System.out.println("Pos: "+j);
					veces[j]+=1;//veces[j]=veces[j]+1;
				}
			}
			
			//Si no la encuentra
			if(pos == -1) {
				letra[posLetra] = str.charAt(i);
				veces[posLetra] = 1;
				posLetra++;
			}
	System.out.println();		
			
			
		}
		
		
		System.out.println(Arrays.toString(letra));
		System.out.println(Arrays.toString(veces));
		
			//Número de letras DIFERENTES
		boolean logitude_es_iguial = letra.length==veces.length;
		if (logitude_es_iguial==true) {
			for (int i = 0; i < letra.length; i++) {
				System.out.printf("%S -> %d\n", ""+letra[i],veces[i]);
			}
			//Frecuencia de repetición
		}
		
		
	}
}
