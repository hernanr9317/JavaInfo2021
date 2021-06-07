package Ej6;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;


public class Principal {

    public static void main(String[] args){

        Set<Empleado> empleados = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        Empleado.cargarSet(empleados);
        Empleado.calcularSueldo(empleados);
        Empleado.cargarMap(empleados,map);

        System.out.println("\nDni/ Nombre / Sueldo: ");
        for(Empleado empleado: empleados){
            System.out.println(empleado.getDni()+" "+empleado.getNombre()+" "+empleado.sueldo);
        }
        System.out.println("\nMapeo dni/sueldos: ");
        System.out.println(map);
        
        
    }
    
}
