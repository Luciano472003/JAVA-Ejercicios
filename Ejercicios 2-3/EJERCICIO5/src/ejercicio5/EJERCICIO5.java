
package ejercicio5;

import java.util.Scanner;

public class EJERCICIO5 {

    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese un número");
       
       int num = leer.nextInt();
       
       
       int doble;
       doble = num * 2;
        System.out.println("El Doble de: " + num + " es: " + doble);
       
       int triple;
       triple = num * 3;
       System.out.println("El Triple de: " + num + " es: " + triple);
       
       
       System.out.println("La Raiz Cuadrada de: " + num + " es " + Math.sqrt(num));
        
        
        
        
        
    }
    
}
