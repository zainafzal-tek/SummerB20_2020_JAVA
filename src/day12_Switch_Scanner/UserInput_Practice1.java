package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_Practice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        double num = input.nextDouble();

        boolean even = num % 2 == 0;

        String result = (even) ? num + " is Even" : num + " is Odd";
        System.out.println(result);


    }


}
