package poo.ejemplo;

import Entidad.Personas;
import java.util.Scanner;

public class POOEjemplo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personas Persona1 = new Personas();
        System.out.println("Nombre: ");
        Persona1.nombre = sc.next();
        System.out.println("Edad: ");
        Persona1.edad = sc.nextInt();
        System.out.println("Nacionalidad: ");
        Persona1.nacionalidad = sc.next();
        System.out.println("Altura: ");
        Persona1.altura = sc.nextDouble();
        System.out.println("Peso: ");
        Persona1.peso = sc.next();
        
        System.out.print(Persona1.nombre + Persona1.edad + Persona1.nacionalidad + Persona1.altura + Persona1.peso);
        
    }

}
