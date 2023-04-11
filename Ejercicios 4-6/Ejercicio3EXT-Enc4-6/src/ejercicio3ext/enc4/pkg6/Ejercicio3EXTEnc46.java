
package ejercicio3ext.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio3EXTEnc46 {

   
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una letra para verificar si es una vocal o consonante: ");
        String letra = sc.nextLine().toLowerCase();
        
        if(!letra.equals("a") && !letra.equals("e") && !letra.equals("i") && !letra.equals("o") && !letra.equals("u")){
            System.out.println("Esta letra es una CONSONANTE (no vocal) o no es una letra");
            
        }else{
            System.out.println("Esta letra es una VOCAL");

        }
        
        /*switch(letra){
            case "a":
                System.out.println("La letra es una VOCAL");
            break;
            case "e":
                System.out.println("La letra es una VOCAL");
            break;    
            case "i":
                System.out.println("La letra es una VOCAL");
            break;    
            case "o":
                System.out.println("La letra es una VOCAL");
            break;    
            case "u":
                System.out.println("La letra es una VOCAL");
            break;    
            default:
                System.out.println("La letra es una CONSONANTE(no vocal) o no es una letra");
            break;    
        }*/
        
        
        
        
        
        
        
    }
    
}
