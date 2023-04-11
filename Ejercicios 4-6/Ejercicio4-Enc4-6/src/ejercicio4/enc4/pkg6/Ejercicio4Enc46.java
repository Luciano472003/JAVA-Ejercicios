
package ejercicio4.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio4Enc46 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase que inicie con A");
        
        String frase = sc.nextLine();
        String primera_letra = frase.substring(0,1).toLowerCase();
        
        System.out.println("Primera letra: " + primera_letra);
        
        if (primera_letra.equals("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
