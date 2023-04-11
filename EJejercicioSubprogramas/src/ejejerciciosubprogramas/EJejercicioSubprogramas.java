package ejejerciciosubprogramas;

import java.util.Scanner;

public class EJejercicioSubprogramas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la Frase o palabra para traducir: ");
        
        String Frase = sc.nextLine();
               
        String Retorno = Reemplazo(String Frase);
        
        System.out.println("La Frase con caracteres reemplazados: " + Retorno);
    }
    
    public static String Reemplazo(String Frase) {
        
        String fraseSalida = "";
        
        for (int i = 0; i < Frase.length(); i++) {
            
            String caracter = Frase.substring(i, i+1);
            
            switch (caracter){
                case "a":
                case "A":
                    caracter = "@";
                break;
                case "e":
                case "E":
                    caracter = "#";
                break;
                case "i":
                case "I":
                    caracter = "$";
                break;
                case "o":
                case "O":
                    caracter = "%";
                break;
                case "u":
                case "U":
                    caracter = "*";
                break;
                  
            } 
            
            fraseSalida = fraseSalida.concat(caracter);
            
        }
        
        
        return fraseSalida;
    
    
    
}

    
    
}
