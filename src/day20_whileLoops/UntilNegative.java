package day20_whileLoops;

import java.util.Scanner;

/*
 write a program that can print the numbers between 1 to 100.
                if the number is divisible by 3, do not print it

 */
public class UntilNegative {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i == 0;){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num < 0){
                break;
            }

            sum += num; // sum = sum + num

        }

        System.out.println("sum is: " + sum);

    }

}
