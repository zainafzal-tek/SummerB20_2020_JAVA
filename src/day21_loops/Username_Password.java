package day21_loops;

import java.util.Scanner;

/*
Write a program that asks user to enter his/her username and password until user enters  correctly.
                there are only three attempts
                after three attempts:  lock the account
 */

public class Username_Password {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username = "Cybertek";
        String password = "Cybertek123";

        System.out.println("Enter you password");
        String input = scan.nextLine();
        int i = 1;

        while (!input.equals(password) && !input.equals(username) && i <= 3){
            System.out.println("Invalid Password, Please retry:");
            input = scan.nextLine();
            i++;
        }

        if (i > 3){
            System.out.println("Account locked!");
            System.exit(0);
        }

        System.out.println("Logged in");

    }

}
