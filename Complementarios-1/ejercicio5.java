import java.util.Scanner;

public class ejercicio5 {
    
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        try {
            
            int num = 0;
            int num2 = 0;
            
            System.out.println("Introduzca dos numeros: ");
            num = reader.nextInt();
            num2 = reader.nextInt();

            int suma = 0;

            for(int i=1;i<=num;i++){

                suma = suma + num2;
            }

            System.out.println("El producto de " + num + " * " + num2 + " es " + suma);

        } finally {
            reader.close();
        }
                    
    }
}