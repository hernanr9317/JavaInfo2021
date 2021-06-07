package Ej5;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
        ArrayList<Integer> total = new ArrayList<Integer>();
        int totalFinal=0;

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);

        for(int i=0;i<horasTrabajadas.size();i++){
            total.add(horasTrabajadas.get(i)*valorHora.get(i));
            totalFinal+=total.get(i);
        }

        System.out.println(total);
        System.out.println("Total Final: $ "+totalFinal);
        
    }
    
}
