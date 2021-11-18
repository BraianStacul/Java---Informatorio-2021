import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static Integer calcularPotencia(Integer number, Integer power) {
        if (power == 0){
            return 1;
        }else {
            return number * calcularPotencia(number, power-1);
        }
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        Integer potencia  = 2;

        List<Integer> numerosPotencia = numeros.stream()
                                            .map(p-> Ejercicio2.calcularPotencia(p, potencia))
                                            .collect(Collectors.toList());
        System.out.println(numerosPotencia);
    }
    
}