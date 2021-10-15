import java.util.Scanner;

public class ejercicio2 {
    
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        try {
            int num = 0;
            int num2 = 0;
            
            System.out.println("Introduzca dos numeros: ");
            num = reader.nextInt();
            num2 = reader.nextInt();
            
            System.out.println("La suma es: " + (num + num2));
            System.out.println("La resta es: " + (num - num2));
            System.out.println("La multiplicacion es: " + (num * num2));
            System.out.println("La division es: " + (num / num2));
            System.out.println("El modulo es: " + (num % num2));


        } finally {
            reader.close();
        }
            

        
    }
}