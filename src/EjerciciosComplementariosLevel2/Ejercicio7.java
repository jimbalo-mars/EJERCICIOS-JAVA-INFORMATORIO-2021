package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {

    List<String> fizzBuzzList =  new ArrayList<>();
    public static Ejercicio7 obj = new Ejercicio7();

    public static void main(String[] args) {
        System.out.print(obj.fizzBuzzFunction(1,6));
    }

    public List<String> fizzBuzzFunction(int num1, int num2){

        for (int i = num1; i < num2; i++){
            if (i % 2 == 0 && i % 3 == 0){
                fizzBuzzList.add("FizzBuzz");
            }else if (i % 2 == 0){
                fizzBuzzList.add("Fizz");
            }else if (i % 3 == 0){
                fizzBuzzList.add("Buzz");
            }else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }
        return fizzBuzzList;
    }
}






