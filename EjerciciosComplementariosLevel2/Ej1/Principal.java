package Ej1;
import java.util.ArrayList;


public class Principal {    

    public static void main(String[] args){

        ArrayList<String> ciudades = new ArrayList<String>();
        
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");

        for(int i=0;i<ciudades.size(); i++){
            System.out.println("#"+(i+1)+" - "+ ciudades.get(i));
        }

    }
    
}
