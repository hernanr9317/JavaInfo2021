package Ej6;
import  java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int num1,num2,pot;

        System.out.print("Ingresar la base : ");
        num1= sc.nextInt();
        System.out.print("Ingresar el exponente : ");
        num2= sc.nextInt();
        sc.close();

        pot = num1;

        for(int x=1;x<num2;x++){

            pot= pot*num1;
        }

    System.out.print(num1 +" elevado a "+ num2 + " = " + pot );
    }

}
