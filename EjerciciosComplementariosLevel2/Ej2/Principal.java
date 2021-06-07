package Ej2;
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args){

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(25);
        numeros.add(5);
        numeros.add(10);
        numeros.add(50);
        numeros.add(65);

        for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("Tamaño: "+numeros.size());

        numeros.add(0,100);
        numeros.add(35);

        for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("Tamaño: "+numeros.size());
    }

}
