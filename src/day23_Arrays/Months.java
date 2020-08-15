package day23_Arrays;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Enter a number between 1 ~ 12");
        int n = scan.nextInt();

        System.out.println(months[n-1]);

    }

}
