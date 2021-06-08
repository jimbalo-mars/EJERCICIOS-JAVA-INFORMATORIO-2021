package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ejercicio4 {

    public static ArrayList<String> students = new ArrayList<String>();
    public static Scanner scanner = new Scanner(System.in);
    public static String student;

    public static void main(String[] args) {
        studentLoader();
        System.out.println(students);
        assignStudents();
    }
    public static void studentLoader(){
        for (int i = 0; i < 12; i++){
            System.out.println("Add a new student: ");
            student = scanner.nextLine();
            students.add(student);
        }
    }
    public static void assignStudents() {
        List curso1 = students.subList(0,4);
        List curso2 = students.subList(4,8);
        List curso3 = students.subList(8,12);
        System.out.println("curso1 = " + curso1);
        System.out.println("curso2 = " + curso2);
        System.out.println("curso3 = " + curso3);
    }
}
