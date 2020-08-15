package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethod3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 67, 7,89 ,-1, 13123};
        int num = max(arr);
        System.out.println(num);
        System.out.println(num > 200);

    }

    public static int max(int[] arr){

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        return max;

    }

    public static void max2(int[] arr){

        Arrays.sort(arr);
        int max = arr[arr.length-1];

    }

}
