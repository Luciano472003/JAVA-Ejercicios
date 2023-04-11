
package ejercicio1;

import java.util.Scanner;

public class EJERCICIO1 {

   public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); 

        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt(); // Leer un entero
        
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("el resultado de la suma de los numeros es " + suma);
        
 }
    
}
