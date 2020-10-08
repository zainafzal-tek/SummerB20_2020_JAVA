package day61_Maps;

import java.time.LocalDate;
import java.util.*;

public class IteratingKeyValues {

    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();

        students.put("Hasan", LocalDate.of(1985, 4, 4));
        students.put("Jesus", LocalDate.of(1985, 1, 31));
        students.put("Muhtar", LocalDate.of(1985, 5, 19));

        System.out.println(students);

        //.keySet(): returns all the keys as a set:
        //We can iterate a set with a for-each loop:
        for (String each : students.keySet()) {
            System.out.println(each);
        }
        System.out.println("=========================");

        //.values(): returns all the values as a set:
        for (LocalDate eachDate : students.values()) {
            System.out.println(eachDate);
        }

    }

}
