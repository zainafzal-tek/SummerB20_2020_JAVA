package day27_Recap;

public class ForaEachLoop {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("=======================================");

        for (int each : arr){
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("========================================");

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("========================================");

        // we can never use for each loop when we need to provide index numbers
        // we should use is when we dont need to provide index numbers

        int count = 0;

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        for (int each : scores){
            if (each % 3 != 0){
                continue;
            }
            count++;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(count);
        System.out.println("=========================================");

        String[] names = {"AB", "AC", "A", "AB", "ABCD"};

        for(String each : names){
            if (!each.toLowerCase().contains("c")){
                continue;
            }
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("==========================================");


        int[] score = {80, 90 , 110, 65, 95 ,45, 56, 78};

        int max = 0;
        int min = 0;

        for (int each : score){
            if (each > max){
                max = each;
            }

            if (each < min){
                min = each;
            }

        }
        System.out.println(max);
        System.out.println(min);


    }

}
