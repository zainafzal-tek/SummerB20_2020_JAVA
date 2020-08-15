package day22_NestedLoop;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username = "Cyber";
        String password = "tek123";

        System.out.println("Enter your username");
        String userName = scan.next();

        System.out.println("Enter your password");
        String input = scan.next();

        int i = 1;

        while (!userName.equals(username) && !input.equals(password)) {

            if (i > 2) {
                System.out.println("Account locked!");
                System.exit(0);
            }


            System.out.println("Invalid Credentials, Please retry:");

            System.out.println("Enter your username");
            userName = scan.next();
            System.out.println("Enter your password");
            input = scan.next();

            i++;
        }


        System.out.println("Logged in");


    }

}
