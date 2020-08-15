package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Full Name");
        String fullName = scan.nextLine();

        System.out.println("Enter Your Company Name: ");
        String companyName = scan.nextLine();

    }

}
