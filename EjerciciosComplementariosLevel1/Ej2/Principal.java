package Ej2;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.println("Ingresar primer numero: ");
        num1= sc.nextInt();
        System.out.println("Ingresar segundo numero: ");
        num2= sc.nextInt();
        sc.close();

        //SUMA
        System.out.print(num1+ " + " + num2 + " = ");
        System.out.println(num1 + num2);
        //RESTA
        System.out.print(num1+ " - " + num2 + " = ");
        System.out.println(num1 - num2);
        //MULTIPLICACION
        System.out.print(num1+ " * " + num2 + " = ");
        System.out.println(num1 * num2);
        //DIVISION
        System.out.print(num1+ " / " + num2 + " = ");
        System.out.println(num1 / num2);
        //RESTO
        System.out.print(num1+ " % " + num2 + " = ");
        System.out.println(num1 % num2);

    }

}
