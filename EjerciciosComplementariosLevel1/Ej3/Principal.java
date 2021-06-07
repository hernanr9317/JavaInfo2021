package Ej3;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero,cont;

        System.out.println("Ingrese numero de secuencia : ");
        numero= sc.nextInt();
        sc.close();

        cont = 1;
        
        while(cont<=numero){
            for(int x=1;x<=cont;x++){

                System.out.print(x);
            }
            System.out.println();
            cont++;
        }


    


    }

}
