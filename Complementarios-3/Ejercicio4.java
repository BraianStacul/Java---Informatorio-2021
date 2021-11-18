import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {

    public static Integer factorial(Integer num) {
        if (num == 1){
            return 1;
        }else {
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args) {
        List<Integer> listaFactorial = List.of(1, 2, 4, 4, 4);
        List<Integer> otraListaFactorial = listaFactorial.stream()
                .map(p -> Ejercicio4.factorial(p))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(otraListaFactorial);
    }   

}