import java.util.Scanner;

public class ejercicio1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Se crea el lector
        try {
            System.out.println("Por favor ingrese su nombre: ");//Se pide un dato al usuario
            String nombre = sc.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato
            System.out.println("HOLA " + nombre + ".");//Se imprime el usuario
        } finally {
            sc.close();
        }
        

        
    }
}