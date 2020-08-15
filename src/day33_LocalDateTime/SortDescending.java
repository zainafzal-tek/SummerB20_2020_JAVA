package day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int[] arr = {1,2, 3, 4, 5};
        arr = sortDescend(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sortDescend(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static double[] sortDescend(double[] arr){
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static String[] sortDescend(String[] arr){
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static char[] sortDescend(char[] arr){
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

}
