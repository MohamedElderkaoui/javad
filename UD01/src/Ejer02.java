import java.util.Scanner;

public class Ejer02 {
public static void main(String[] args) {
	//definir variables
	int A;
	int B;
	// introducir datos por 
	Scanner teclados = new Scanner(System.in);
	System.out.println("introducir datos para a");
	A=teclados.nextInt();
	System.out.println("introducir datos para b");
	
	B=teclados.nextInt();
	//mostrar lo que he reco
	System.out.println("mostrar datos para a="+A);
	System.out.println("mostrar datos para b="+B);
	//suma
	System.out.println("la suma"+(A+B));
	//resta
	System.out.println("la suma"+(A-B));
	//multiplica
	System.out.println("la suma"+(A*B));
	//divicion
	System.out.println("la suma"+(B!=0?A/B:"NO PO"));
	
	
	
}
}
