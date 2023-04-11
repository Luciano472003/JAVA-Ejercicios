
package ejercicio6ext.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio6EXTEnc46 {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        
        int CantPersonas = sc.nextInt();
        double Estatura = 0;
        double sumaEst = 0;
        double Est160 = 0;
        double P160 = 0;
        
        for (int i = 1; i <= CantPersonas; i++) {
            System.out.println("Ingrese la estatura de la persona N°" + i);
           Estatura = sc.nextDouble();
           
           
           sumaEst = sumaEst + Estatura;
           
            if (Estatura <= 1.60) {
                
                P160 = P160 + Estatura;
                Est160 = Est160 + Estatura;
            }
        }
        
        System.out.println("La estatura promedio de " + CantPersonas + " es: " + (sumaEst/CantPersonas));
        System.out.println("El Promedio de los que miden 1.60 o menos es: " + (Est160/P160));
        
        
        
        
        
        
    }
    
}
