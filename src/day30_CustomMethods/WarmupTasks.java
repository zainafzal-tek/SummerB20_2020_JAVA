package day30_CustomMethods;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {

        maxNum(6, 6);

        int arr[] = {5, 2, 4 ,7, 8, 21 ,411, 2421, 63, 8, - 100 , -123, - 45345, 2000};
        printDesc(arr);

        int[] a1 = {1, 2, 3,4,5};
        int[] a2 = {6 ,7 , 8, 9, 10,11,12};
        combine2Arrays(a1, a2);

        posNeg(1);

        System.out.println("=================================");

        int[] a3 = {100 ,200, -300, 4000, 500, 60,0 , 0 ,9000};

        for (int each : a3){

            posNeg(each);

        }

    }


    public static void maxNum(int a , int b){

        if (a == b){
            System.out.println("Equal");
            return; // exitd the method not the whole program
        }

        if (a >= b){
            System.out.println(a + " is maximum");
        } else {
            System.out.println(b + " is maximum");
        }

    }


    public static void printDesc(int[] arr){

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    public static void combine2Arrays(int[] arr1 , int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1){
            arr3[i] = each;
            i++;
        }

        for (int each : arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void posNeg(int a){

        if (a > 0){
            System.out.println(a + " is positive");
        } else if (a < 0){
            System.out.println(a + " is negative");
        } else {
            System.out.println(a + " is zero");
        }

    }

}
