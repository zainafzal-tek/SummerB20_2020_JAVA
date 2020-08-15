package day27_Recap;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        String[] names = {"Odina", "Liliia", "Berk", "Emine"};

        Arrays.sort(names); // it will follow the asci table order

        int[] num = {80, 75, 65,110,90,45,56, 78};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("Max num is: " + num[num.length-1]);
        System.out.println("Min num is: " + num[0]);

        System.out.println("=======================================");




    }

}
