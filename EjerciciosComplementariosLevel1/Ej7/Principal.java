package Ej7;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String texto;
        char aux[];
        aux = new char[20];
        int ascii[];
        ascii = new int[20];
        
        
        System.out.print("Ingresar palabra en minusculas: ");
        texto = sc.nextLine();
        sc.close();

        for(int i=0;i<texto.length();i++){

            aux[i]= texto.charAt(i);
            ascii[i]= (int)aux[i];
        }

        for(int i=0;i<20;i++){
            int aux2 = 0;
            char convertido;
            aux2= ascii[i] - 32;
            convertido= (char) aux2;
            if(aux2 > 0)
            System.out.print(convertido);
        }
    }
}
