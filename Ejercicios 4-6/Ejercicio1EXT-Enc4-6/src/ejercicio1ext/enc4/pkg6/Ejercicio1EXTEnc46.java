


package ejercicio1ext.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio1EXTEnc46 {

   
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos y se le mostrara el equivalente en:"
                + " HORAS y DIAS");
        
        int min = sc.nextInt();
        
        double horas = (min / 60);
        double dias = (min / 1440);
        
        System.out.println(min + " Minuto/s equivale/n a: ");
        System.out.println(horas + " Hora/s");
        System.out.println(dias + " Dia/s");
        
    }
    
}
