package day20_whileLoops;

import java.util.Scanner;

public class WhileLoop_Practice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "Cybertek123";

        System.out.println("Enter you password");
        String input = scan.nextLine();
        int i = 1;

        while (!input.equals(password) && i <= 3){
            System.out.println("Invalid Password, Please retry:");
            input = scan.nextLine();
            i++;
        }

        if (i > 3){
            System.exit(0);
        }

        System.out.println("Logged in");



    }

}
