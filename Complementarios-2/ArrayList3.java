import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    try {

        //Creamos el array list
        ArrayList<String> baraja = new ArrayList<String>();  

        //Agregamos las cartes de corazones
        for(int i=0;i<=13;i++) {

            String valor = (i+1) + " de corazones";
            baraja.add(valor);
        }

        //Agregamos las cartes de diamantes
        for(int i=0;i<=13;i++) {

            String valor = (i+1) + " de diamante";
            baraja.add(valor);
        }

        //Agregamos las cartes de tréboles
        for(int i=0;i<=13;i++) {

            String valor = (i+1) + " de tréboles";
            baraja.add(valor);
        }

        //Agregamos las cartes de picas
        for(int i=0;i<=13;i++) {

            String valor = (i+1) + " de picas";
            baraja.add(valor);
        }

        //Imprimimos en orden
        System.out.println("BARAJA EN ORDEN");
        for (int i=0;i<baraja.size();i++) {
      
            System.out.println(baraja.get(i));
        }

        //Invertimos el orden e imprimimos
        System.out.println("BARAJA INVERTIDA");
        Collections.reverse(baraja);

        for (int i=0;i<baraja.size();i++) {
      
            System.out.println(baraja.get(i));
        }

        //Desordenamos el array e imprimimos
        System.out.println("BARAJA DESORDENADAS");
        Collections.shuffle(baraja);

        for (int i=0;i<baraja.size();i++) {
      
            System.out.println(baraja.get(i));
        }




    } finally {
        reader.close();
    }
          
  }
}