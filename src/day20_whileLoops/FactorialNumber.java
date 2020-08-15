package day20_whileLoops;

import java.util.Scanner;

/*
write a program that can ask the user enter a number
for five times and the returns the sum of those five numbers

 */
public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 1;

        for (int i = scan.nextInt(); i >= 1; i--){ // i: 5, 4, 3, 2, 1
            result *= i;              // result = result * i ==> 5 * 4 * 3 * 2 * 1
        }
        System.out.println(result);

    }

}
