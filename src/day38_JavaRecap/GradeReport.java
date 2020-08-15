package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 90, 85, 75, 55, 45, 73, 73, 35, 47, 60, 87, 77, 67, 57, 47, 93, 83, 73, 63, 53, 43));
        System.out.println(list);
        System.out.println();

        ArrayList<Integer> gradeA = new ArrayList<>(); // 90 ~ 100
        gradeA.addAll(list);
        gradeA.removeIf(p -> p < 90);
        System.out.println("Grade A " + gradeA);
        System.out.println("Students that got A: " + gradeA.size());
        System.out.println();

        ArrayList<Integer> gradeB = new ArrayList<>(); // 80 ~ 89
        gradeB.addAll(list);
        gradeB.removeIf(p -> p < 80 || p >= 90);
        System.out.println("Grade B " + gradeB);
        System.out.println("Students that got B: " + gradeB.size());
        System.out.println();

        ArrayList<Integer> gradeC = new ArrayList<>(); // 70 ~ 79
        gradeC.addAll(list);
        gradeC.removeIf(p -> p < 70 || p >= 80);
        System.out.println("Grade C " + gradeC);
        System.out.println("Students that got C: " + gradeC.size());
        System.out.println();

        ArrayList<Integer> gradeD = new ArrayList<>(); // 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf(p -> p < 60 || p >= 70);
        System.out.println("Grade D " + gradeD);
        System.out.println("Students that got D: " + gradeD.size());
        System.out.println();

        ArrayList<Integer> gradeF = new ArrayList<>(); //  < 60
        gradeF.addAll(list);
        gradeF.removeIf(p -> p > 60);
        System.out.println("Grade F " + gradeF);
        System.out.println("Students that failed: " + gradeF.size());


    }

}
