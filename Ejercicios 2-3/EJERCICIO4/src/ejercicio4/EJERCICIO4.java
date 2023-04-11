
package ejercicio4;

import java.util.Scanner;


public class EJERCICIO4 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese los grados Centigrados(C) a transferir a Fahrenheit (F)");
    int C = leer.nextInt();
    
    int F = 32 + (9 * C / 5);
    
    System.out.println("Celsius: " + C + " a Fahrenheit: " + F);
    
    
    
    
    
    
    
    }
    
}
