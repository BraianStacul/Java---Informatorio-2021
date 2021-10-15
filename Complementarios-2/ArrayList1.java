import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    int n = 0;
    String ciudad;
    ArrayList<String> lista = new ArrayList<String>();  

    try {

        System.out.println("Cantidad de ciudades: ");
        n = reader.nextInt();

        for(int i=0;i<=n;i++) {

            System.out.println("Introduzca las ciudades favoritas: ");
            ciudad = reader.nextLine();
            lista.add(ciudad);
        }

        for (int i=0;i<=n;i++) {
      
            System.out.println("#"+ i + " - " + lista.get(i));
        }

    } finally {
        reader.close();
    }
          
  }
}