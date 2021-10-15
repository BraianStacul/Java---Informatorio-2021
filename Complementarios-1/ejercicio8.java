import java.util.Scanner;

public class ejercicio8 {
    
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        try {
            
            System.out.println("Introduzca su nombre: ");
            String nombre = reader.nextLine();

            System.out.println("Introduzca su edad: ");
            byte edad = reader.nextByte();
            reader.nextLine();

            System.out.println("Introduzca su direccion: ");
            String direccion = reader.nextLine();

            System.out.println("Introduzca su ciudad: ");
            String ciudad = reader.nextLine();

            System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);


        } finally {
            reader.close();
        }
                    
    }
}