package day12_Switch_Scanner;

import java.util.Scanner; //this will import (only) the scanner class(to use scanner we must import it)
                            // import java.util.*; this will import every class under the util package.


public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // declaring Scanner syntax

        System.out.println("Enter your Number");
         //  int num1 = input.nextInt(); // this allows users to enter (only) int primitive. Can enter positive and negative
        //  long num2 = input.nextLong();
            double num3 = input.nextDouble(); // this allows the user to enter decimal (even if int is entered)


        System.out.println("You entered: " + num3);

    }

}
