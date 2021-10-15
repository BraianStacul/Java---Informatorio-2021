import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayList4 {
    public static void main(String[] args) {
        
        List<String> numbers = new ArrayList<String>(
        Arrays.asList("Jose","Maxi","Braian","Paula","Siesta","Jesus","Meki","Historia","Ayase","Ruso","Messi","Vivy")
    );

    List<String> matematica = numbers.subList(0, 4);
    List<String> fisica = numbers.subList(4, 8);
    List<String> quimica = numbers.subList(8, 12);

    System.out.println(matematica);
    System.out.println(fisica);
    System.out.println(quimica);
          
    }
}