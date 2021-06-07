package Ej9;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int cont=0;
        String texto;
        char aux;

        
        System.out.print("Ingresar  texto: ");
        texto= sc.nextLine();
        char texto2[] = texto.toCharArray();
        System.out.print("Ingresar letra a buscar: ");
        aux= sc.next().charAt(0);
        sc.close();
    

        for(int i=0;i< texto2.length;i++){
            if(aux == texto2[i]){
                cont++;
            }
        }

        System.out.print(cont);

    }

}
