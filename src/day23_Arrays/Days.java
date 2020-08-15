package day23_Arrays;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] days = new String[7];

        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";


        System.out.println("Enter a number between 1 ~ 7");
        int input = scan.nextInt();

        System.out.println(days[input - 1]);

    }

}
