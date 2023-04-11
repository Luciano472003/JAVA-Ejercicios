
package ejercicio5.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio5Enc46 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite");
        int limite = sc.nextInt();
        int suma = 0;
        
        do {
            
            System.out.println("Ingrese numeros para sumar");
            int numeros = sc.nextInt();
            
            suma = suma + numeros;
            
        }while(suma < limite);
        
        System.out.println("La suma de los nuemros es superior al limite ingresado");
        System.out.println("Limite: " + limite);
        System.out.println("Suma: " + suma);
    }
    
}
