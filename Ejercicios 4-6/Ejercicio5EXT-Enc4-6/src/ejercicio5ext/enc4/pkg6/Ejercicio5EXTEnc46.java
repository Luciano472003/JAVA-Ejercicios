
package ejercicio5ext.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio5EXTEnc46 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String Eleccion = " ";
        int Precio = 0;
        
        do{
            System.out.println("Ingrese el tipo de Socio y el importe que este debe pagar por los tratamientos(ingrese 'end' y '0' para salir del programa)");
                System.out.println("----------------------------------");
                System.out.println("Socios tipo A (50% de descuento)");
                System.out.println("Socios tipo B (35% de descuento)");
                System.out.println("Socios tipo C (sin descuentos)");
                System.out.println("----------------------------------");
                
            Eleccion = sc.nextLine().toLowerCase();
            Precio = sc.nextInt();
            
            switch(Eleccion){
                case "a":
                    System.out.println("Socio tipo: " + Eleccion);
                    System.out.println("Importe a pagar: " + Precio);
                    System.out.println("Total (aplicando descuento por tipo de socio): " + (Precio*0.50));
                break;
                case "b":
                    System.out.println("Socio tipo: " + Eleccion);
                    System.out.println("Importe a pagar: " + Precio);
                    System.out.println("Total (aplicando descuento por tipo de socio): " + (Precio*0.35));
                break;
                case "c":
                    System.out.println("Socio tipo: " + Eleccion);
                    System.out.println("Importe a pagar: " + Precio);
                break;
                case "end":
                    System.out.println("Saliendo del programa...");
                break;
                default:
                    System.out.println("ERROR");
                break;    
            }
            
        }while(!Eleccion.equals("end"));
        
    sc.close();
    }
    
}
