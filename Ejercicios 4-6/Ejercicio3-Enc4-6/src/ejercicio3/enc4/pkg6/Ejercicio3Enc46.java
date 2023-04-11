
package ejercicio3.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio3Enc46 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       String frase= " ";

        do{
            System.out.println("Ingrese una palabra o frase de 8 caracteres: ");
            frase = sc.nextLine();

            if(frase.length() != 8){
            System.out.println("INCORRECTO");
            }

        }while(frase.length() != 8);
 
        
        if(frase.length() == 8){
            System.out.println("CORRECTO");
            }
        
        
        
        
        
    }
    
}
