package day25_Practices;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] arr2 = {4, 5};

        int size = arr.length + arr2.length;

        int[] arr3 = new int[size];

        int index = 0;

        for ( int each : arr){
            arr3[index] = each;
            index++;
        }

        for (int each : arr2){
            arr3[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println("Max num: " + arr3[arr3.length - 1]);
        System.out.println("Min num: " + arr3[0]);

    }

}
