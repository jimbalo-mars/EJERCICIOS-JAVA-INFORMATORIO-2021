package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println(payment.calculator());
        long total = payment.payments.stream().mapToLong(Integer::longValue).sum();
        System.out.println(String.format("The sum of payments is: %s", total));
    }
}

class Payment{

    List<Integer> workedHours = List.of(6,7,8,4,5);
    List<Integer> payPerHour = List.of(350, 345, 550, 600, 320);
    List<Integer> payments = new ArrayList<>();

    public List<Integer> calculator(){
        for (int i = 0; i < workedHours.size(); i++) {
            int total;
            total = workedHours.get(i) * payPerHour.get(i);
            payments.add(total);
        }
        return payments;
    }
}


