
package ejercicio4.enc9.pkg11;

import java.util.Random;


public class Ejercicio4Enc911 {

 
    public static void main(String[] args) {
        
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                Random aleatorio = new Random();
                
                matriz[i][j] = aleatorio.nextInt(20);            
            }   
        }
        System.out.println("Matriz Normal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                System.out.print("[" + matriz[i][j]+ "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz Transpuesta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
