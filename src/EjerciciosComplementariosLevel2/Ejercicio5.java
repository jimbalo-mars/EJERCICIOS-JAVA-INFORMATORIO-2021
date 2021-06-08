package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println(payment.calculator());
    }
}

class Payment{

    List<Integer> workedHours = List.of(4,5,8,20,6,7);
    List<Integer> payPerHour = List.of(20, 50, 54, 32, 48, 25);
    List<Integer> totalPayments = new ArrayList<>();

    public List<Integer> calculator(){
        for (int i = 0; i < workedHours.size(); i++) {
            int total;
            total = workedHours.get(i) * payPerHour.get(i);
            totalPayments.add(total);
        }
        return totalPayments;
    }

}
