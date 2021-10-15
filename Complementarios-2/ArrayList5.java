import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList5 {
  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    try {

        //Creamos el array list
        ArrayList<Integer> horastrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorporhora = new ArrayList<Integer>();
        ArrayList<Integer> totalacobrar = new ArrayList<Integer>();

        horastrabajadas.add(6);
        horastrabajadas.add(7);
        horastrabajadas.add(8);
        horastrabajadas.add(4);
        horastrabajadas.add(5);

        valorporhora.add(350);
        valorporhora.add(345);
        valorporhora.add(550);
        valorporhora.add(600);
        valorporhora.add(320);

        int valor, total = 0;

        //Agregamos las cartes de diamantes
        for(int i=0;i<5;i++) {

            valor = 0;
            valor = horastrabajadas.get(i)*valorporhora.get(i);
            totalacobrar.add(valor);
            total = total + valor;
        }

        System.out.println(totalacobrar);
        System.out.println("TOTAL A COBRAR: $" + total);
        

        
    } finally {
        reader.close();
    }
          
  }
}