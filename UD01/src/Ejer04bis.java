import java.util.Scanner;

public class Ejer04bis {
	public static void main(String[] args) {
		int num1; 
        int num2; 
        int num3; 
        
        Scanner cuenta = new Scanner(System.in);
        System.out.println("Introduce valor para num1"); 
         num1 = cuenta.nextInt();
        System.out.println("Introduce el valor para num2");
         num2 = cuenta.nextInt();
        System.out.println("Introduce el valor para num3");
         num3 = cuenta.nextInt();
        cuenta.close();
         
     if (num1 == num2 || num1 == num3 || num2 ==num3) {
                
                System.out.println("TIENEN QUE SER NUMEROS DIFERENTES Ejercico 4");
            }
         
     else if (num1 > num2 && num2 > num3) {
            
        System.out.println("Num1 es el mayor");    
            
            
        }
        
        else if (num2 > num1 && num2 > num3) {
            
            System.out.println("Num2 es el mayor");
            
        }
        
        
            else {
            
            System.out.println("Num3 es el mayor");
        
        }
        
        
        
        
        
        
    }


	}

