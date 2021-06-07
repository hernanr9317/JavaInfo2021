package Ej5;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int num1,num2,aux=1,mult=0;

        System.out.print("Ingresar primer numero a multiplicar : ");
        num1= sc.nextInt();
        System.out.print("Ingresar segundo numero a multiplicar : ");
        num2= sc.nextInt();
        sc.close();

       while (aux<=num2){
        
        mult= mult+num1;
        aux++;
       }

    System.out.print(num1 +" * "+ num2 + " = " + mult );
    }

}
