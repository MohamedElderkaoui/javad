import java.util.Scanner;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer13 {
	public static void main(String[] args) {
		int i2 = 0;
		Scanner teclados = new Scanner(System.in);
		System.out.print("si tiene bachiller(s:1 yn:0)");
		int num = teclados.nextInt();
/**
		for (int i = 1; i < num; i++) {
			i2 += i;// i2=i2+i;
			System.out.println("el `valor: " + i2 + " \n\ty su cuadro es " + i2);
		}*/
		int i = 1;
		do {
			i2 += i;// i2=i2+i;
			System.out.println("el `valor: " + i2 + " \n\ty su cuadro es " + (i2*i2));
			i+=1;
		} while (i < num);
		
	}

}
