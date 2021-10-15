import java.util.*;

public class ArrayList6 {


    public static void main(String[] args) {

        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleado.add(new Employee("Braian Stacul", 42378815, 6, 350));
        empleado.add(new Employee("Elias Stacul", 22438947, 7, 345));
        empleado.add(new Employee("Ivan Stacul", 40238897, 8, 550));
        empleado.add(new Employee("Maximiliano Milessi", 42567897, 4, 600));
        empleado.add(new Employee("Gladys Gonzalez", 24564213, 5, 320));

        System.out.println("CALCULO DE LOS SALARIOS DE LOS EMPLEADOS");

        for (Employee lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee crearUnaTabla : empleado) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSALARIO PERCIBIDO:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
    }
}