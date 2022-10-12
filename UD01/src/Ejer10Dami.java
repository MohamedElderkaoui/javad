import java.util.Scanner;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer10Dami {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*System.out.print("Introduce un número: ");
		int num=0;
		num = teclado.nextInt();
		
		while(num <= 0) {
			System.err.println("El número debe ser mayor de 0");
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
		}*/
	
		int num=0;
		do {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if(num <= 0)
				System.err.println("El número debe ser mayor de 0");
			
		}while(num <= 0);
		
		
		if(num%2==0) {
			System.out.print(num+" es par.");
		}else{
			System.out.print(num+" es impar.");
		}

	}
}
