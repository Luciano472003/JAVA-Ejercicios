
package ejercicio3;

import java.util.Scanner;

public class EJERCICIO3 {

    
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in); 
    System.out.println("Ingresa una palabra o frase");
    String Palabra = leer.nextLine();
    
    System.out.println("minusculas: " + Palabra.toLowerCase());
    
    System.out.println("MAYUSCULAS: " + Palabra.toUpperCase());
    
    }
    
}
