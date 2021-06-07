package Ej8;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();

        System.out.print("Ingresar nombre y apellido: ");
        persona1.nombreYapellido= sc.nextLine();
        System.out.print("Inresar edad: ");
        persona1.edad= sc.nextInt();
        System.out.print("Ingresar dirección: ");
        sc.nextLine();
        persona1.direccion= sc.nextLine();
        System.out.print("Ingresar ciudad: ");
        persona1.ciudad= sc.nextLine();
        sc.close();

        System.out.print(persona1.ciudad+" - ");
        System.out.print(persona1.direccion+" - ");
        System.out.print(persona1.edad+" - ");
        System.out.print(persona1.nombreYapellido);


    }

}
