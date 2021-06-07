package Ej3;
import java.util.ArrayList;
import java.util.Collections;


public class Principal {

    public static void main(String[] args){
        ArrayList<Integer> cartas = new ArrayList<Integer>();
        int cont=0;
        int carta=2;

       for (int i=0;i<36;i++){
               cartas.add(carta);
               cont++;
               if(cont==4){
                   carta++;
                   cont=0;
               }
       }

       System.out.println("Cartas ordenadas: \n"+cartas);
       
       Collections.reverse(cartas);
       System.out.println("Cartas en orden inverso: \n"+cartas);

       Collections.shuffle(cartas);
       System.out.println("Cartas mezcladas: \n"+cartas);
 
    }

}
