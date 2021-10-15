import java.util.Scanner;

public class ejercicio4 {
    
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        try {
            
            int factorial = 1, num = 0, aux;
            
            System.out.println("Introduzca un numero: ");
            num = reader.nextInt();
            aux = num;

            while (num!=0) {
                factorial=factorial*num;
                num--;
            }

            System.out.println("El factorial de "+ aux + " es: " + factorial);


        } finally {
            reader.close();
        }
                    
    }
}