package day24_Arrays;
/*
Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]

 */
public class Average {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            sum += arr[i];
        }

        double average = sum / (double)arr.length ;

        System.out.println("Average is: " + average);

    }

}
