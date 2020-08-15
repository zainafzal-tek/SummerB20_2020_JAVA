package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        // Arrays.toString(arr): this is used to convert array to String. (USED for printing)

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        String[] s2 = {"Muhtar", "Zain", "Nadir", "Asiya", "Kuzzat"};

        // in order to print array we MUSt convert to string first

        System.out.println(Arrays.toString(s2));
        System.out.println("=============================================");

        // Arrays.sort(): this method is used to sort an array in ascending order.

        int[] nums = {5, 3, 1, 4, 2};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum num: " + nums[nums.length - 1]);
        System.out.println("Minimum num: " + nums[0]);

        System.out.println("==============================================");

        // Arrays.equal(): checks if arrays values are equal to each other (RETURNS boolean)

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        Arrays.sort(a);
        Arrays.sort(b);

        boolean r1 = Arrays.equals(a, b);
        System.out.println(r1);



    }
}