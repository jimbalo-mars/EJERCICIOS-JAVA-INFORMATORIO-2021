package EjerciciosComplementariosLevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {

    public static void main(String[] args) {

        Set<Employee> workers = new HashSet<>();
        HashMap dniSalaries = new HashMap();

        Employee worker1 = new Employee("Jeff", "Bezzos", 38999666, 40, 400);
        Employee worker2 = new Employee("Elon", "Musk", 39666333, 20, 250);
        Employee worker3 = new Employee("Bill", "Gates", 40000666, 60, 350);
        Employee worker4 = new Employee("Robert", "Downey", 41666444, 36, 500);
        Employee worker5 = new Employee("Luis", "Miguel", 8555888, 45, 450);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);

        for (Employee i : workers) {
            dniSalaries.put(i.dni, i.salaryCalculator());
        }

        for (Object i : dniSalaries.keySet()){
            System.out.println("Dni: " + i + " Salary: " + dniSalaries.get(i));
        }
    }
}

class Employee{

    String name, lastName;
    float workedHours, payPerHour;
    int dni;

    public Employee(String name, String lastName, int dni, float workedHours, float payPerHour){
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.workedHours = workedHours;
        this.payPerHour = payPerHour;
    }

    public float salaryCalculator(){
        return this.payPerHour * this.workedHours;
    }
}
