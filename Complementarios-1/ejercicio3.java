import java.util.Scanner;

public class ejercicio3 {
    
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        try {
            
            int num = 0,i = 0, j= 0;

            System.out.println("Introduzca un numero: ");
            num = reader.nextInt();

            for(i=1;i<=num;i++){

                for(j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.print("\n");
            }

        } finally {
            reader.close();
        }
                    
    }
}