package EJ4;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){
        ArrayList<String> estudiantes = new ArrayList<String>();
        ArrayList<String> curso1 = new ArrayList<String>();
        ArrayList<String> curso2 = new ArrayList<String>();
        ArrayList<String> curso3 = new ArrayList<String>();

        estudiantes.add("Francisco Luis Rial");
        estudiantes.add("Maialen Bernabe");
        estudiantes.add("Serafina Montero");
        estudiantes.add("Jose-Pedro Toro");
        estudiantes.add("Samir Paniagua");
        estudiantes.add("Teresa Trigo");
        estudiantes.add("Nour Navarro");
        estudiantes.add("Leticia Caparros");
        estudiantes.add("Flor Sastre");
        estudiantes.add("Alejo Egea");
        estudiantes.add("Paulo Pineda");
        estudiantes.add("Federico Alcalde");

        for(int i=0;i<4;i++){
            curso1.add(estudiantes.get(i));
        }

        for(int i=4;i<8;i++){
            curso2.add(estudiantes.get(i));
        }

        for(int i=8;i<12;i++){
            curso3.add(estudiantes.get(i));
        }

        System.out.println("Curso1 : "+curso1);
        System.out.println("Curso2 : "+curso2);
        System.out.println("Curso3 : "+curso3);
    }
    
}
