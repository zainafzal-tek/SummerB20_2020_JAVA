package day21_loops;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 1; i <= 5; i++){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num > max){ // if the number inout is greater than int max value
                max = num; // the user input will be assigned to max value
            }              // the loop will repeat this 5 times and only numbers entered greater than the previous input will be assigned to max variable

            if (num < min){ // if the number inout is less than int min variable value
                min = num;  // the user input will be assigned to min value
            }               // the loop will repeat this 5 times and only numbers entered less than the previous input will be assigned to min variable

        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

    }

}
