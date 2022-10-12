import java.util.Scanner;

public class Ejer01 {
public static void main(String[] args) {
	//definir variables
	int A;
	int B;
	int aux=0;
	// introducir datos por 
	Scanner teclados = new Scanner(System.in);
	System.out.println("introducir datos para a");
	A=teclados.nextInt();
	System.out.println("introducir datos para b");
	
	B=teclados.nextInt();
	//mostrar lo que he reco
	System.out.println("mostrar datos para a="+A);
	System.out.println("mostrar datos para b="+B);
	aux=A;
	A=B;
	B=aux;
	System.out.println("mostrar datos para a="+A);
	System.out.println("mostrar datos para b="+B);
	
	
}
}
