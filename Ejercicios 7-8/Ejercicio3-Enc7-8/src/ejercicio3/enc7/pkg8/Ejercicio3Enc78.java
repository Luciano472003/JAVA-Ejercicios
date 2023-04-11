
package ejercicio3.enc7.pkg8;

import java.util.Scanner;


public class Ejercicio3Enc78 {

   
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        int euros = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Ingrese la moneda a la que desea convertir");
        System.out.println("LIBRAS");
        System.out.println("DOLARES");
        System.out.println("YENES");
        
        String moneda = sc.nextLine().toLowerCase();
        
        ConvertirA(euros, moneda);
    }
    
    public static void ConvertirA(int euros, String moneda){
        
        switch(moneda){
            case "libras":
                System.out.println(euros + " EUROS = " + euros*0.86 + " LIBRAS");
                break;
            case "dolares":
                System.out.println(euros + " EUROS = " + euros*1.28611 + " DOLARES");
                break;
            case "yenes":
                System.out.println(euros + " EUROS = " + euros*129.852 + " YENES");
                break;
            default:
                System.out.println("Lo sentimos, por el momento el programa no esta capacitado para convertir a otra moneda");
        }
        
        
    }
    
    
}
