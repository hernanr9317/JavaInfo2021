package Ej4;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int factorial=1, numero;

        System.out.print("Factorial de : ");
        numero= sc.nextInt();
        sc.close();

        for(int x=2;x<=numero;x++){
            factorial= factorial * x;
        }

        System.out.print("El factorial de "+numero+" es : "+factorial);





    }

}
