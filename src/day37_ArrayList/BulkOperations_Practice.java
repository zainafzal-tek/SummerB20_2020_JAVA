package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra", "Muhtar"));
        System.out.println(r1);

        System.out.println("================================");

        ArrayList<String> group20 = new ArrayList<>();
        group20.addAll(Arrays.asList("Muhtar", "Nadir", "Asiya", "Saim"));

        boolean r = group20.containsAll(Arrays.asList("Muradil", "Kuzzat"));
        System.out.println(r);

        System.out.println("======================================");

        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed"));
        System.out.println(employee);

        employee.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employee);

    }

}
