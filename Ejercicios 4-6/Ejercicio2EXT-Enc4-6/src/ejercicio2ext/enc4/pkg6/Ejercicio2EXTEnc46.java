
package ejercicio2ext.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio2EXTEnc46 {

  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int A = 25;
        int B = 30;
        int C = 27;
        int D = 66;
        
        /*
        B -> C
        C -> A
        A -> D
        D -> B
        */
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        int aux = 0;
        
        do {

            aux = aux + B;
            B = B - B;
            B = B + C;
            
            System.out.println("B con valor de C: " + B);
            
        }while(B!=C);
        
        do {

           
            C = C - C;
            C = C + A;
            
            System.out.println("C con valor de A: " + C);
         
        }while(C!=A);
        
        do {
            
            A = A - A;
            A = A + D;
            
            System.out.println("A con valor de D: " + A);
            
        }while(A!=D);
        
        do {
           
            D = D - D;
            D = D + aux;
            System.out.println("D con valor de B: " + D);
        }while(D!=aux);
    }
    
}
