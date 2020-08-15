package day12_Switch_Scanner;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number: ");

        int num1 = input.nextInt();

        System.out.println("Enter your Second Number: ");

        int num2 = input.nextInt();

        System.out.println("Sum of Both numbers = " + (num1+num2) );

    }

}
