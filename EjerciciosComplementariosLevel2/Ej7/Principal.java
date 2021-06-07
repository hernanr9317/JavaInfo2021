package Ej7;


public class Principal {
    
    public static void main(String[] args){
        
        String[] cadena;

        cadena = fizzBuzzFuncion(1, 8);

        for(int i=1;i<cadena.length;i++){
            System.out.print(cadena[i]+" ");
        }

    }

    public static String[] fizzBuzzFuncion(int a, int b){
        
        int tamaño = b-a;
        String[] c = new String[tamaño+1];

        for(int i=a;i<b;i++){
            if (i%2==0 && i%3==0){
                c[i]="FizzBuzz";
            }else if (i%2==0){
                c[i]="Fizz";
            }else if (i%3==0){
                c[i]="Buzz";
            }else c[i]=String.valueOf(i);
        }
        return c;
    }
}
