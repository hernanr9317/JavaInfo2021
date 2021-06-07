package Ej6;
import java.util.Set;
import java.util.HashMap;

public class Empleado {
    String nombreYApellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;
    int sueldo;

    public String getNombre(){
        return this.nombreYApellido;
    }

    public int getDni(){
        return this.dni;
    }

    public int getSueldo(){
        return this.sueldo;
    }


    public  Empleado(String nombreYApellido, int dni,int horasTrabajadas, int valorPorHora){
        this.nombreYApellido= nombreYApellido;
        this.dni= dni;
        this.horasTrabajadas= horasTrabajadas;
        this.valorPorHora= valorPorHora;
    }

    public static void cargarSet(Set<Empleado> empleados){
        empleados.add(new Empleado("Paco Clemente", 12345678, 30, 200));
        empleados.add(new Empleado("Marcel Cobo", 87654321, 36, 350));
        empleados.add(new Empleado("Markel Pineda", 52698753, 48, 250));
        empleados.add(new Empleado("Jose-Tomas Zaragoza", 35871298, 42, 150));
        empleados.add(new Empleado("Unai Cerdan", 15698324, 40, 400));
    }

    public static void cargarMap(Set<Empleado> empleados, HashMap<Integer, Integer> map){
        for (Empleado empleado: empleados){
            map.put(empleado.getDni(),empleado.getSueldo());
        }

    }

    public static void calcularSueldo(Set<Empleado> empleados){
        for (Empleado empleado: empleados){
            empleado.sueldo = empleado.valorPorHora * empleado.horasTrabajadas;
        }

    }
}
