import java.util.Scanner;

public class ejercicio6 {
    
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        try {
            
            int num = 0;
            int num2 = 0;
            
            System.out.println("Introduzca dos numeros: ");
            num = reader.nextInt();
            num2 = reader.nextInt();

            int producto = 1;

            for(int i=1;i<=num;i++){

                producto = producto * num2;
            }

            System.out.println("La potencia de " + num + " ^ " + num2 + " es " + producto);

        } finally {
            reader.close();
        }
                    
    }
}