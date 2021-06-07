package Ej1;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String saludo;
        
        
            System.out.println("Ingresar nombre de usuario: ");
            saludo = sc.nextLine();
            sc.close();
        
            System.out.println("HOLA "+saludo);
        }
    }  

   

