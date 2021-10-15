import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList2 {
  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    try {

        //Creamos el array list
        ArrayList<Integer> a = new ArrayList<Integer>();  

        //Agregamos 5 elementos
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        a.add(10);

        for (int i=0;i<a.size();i++) {
      
            System.out.println(a.get(i));
        }

        int size1 = a.size();

        System.out.println("El tamaño del array sin agregar elementos es: "+ size1);

        //Añadimos al comienzo y al final
        a.add(0,1);
        a.add(6,11);

        for (int i=0;i<a.size();i++) {
      
            System.out.println(a.get(i));
        }

        int size2 = a.size();

        System.out.print("El tamaño del array con elementos agregados es: "+ size2);        

    } finally {
        reader.close();
    }
          
  }
}