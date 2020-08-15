package day13_Scanner;

import java.util.Scanner;

public class Scanner_next {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your company name: ");
        String companyName = scan.next(); // this method only takes one word (first word written)

        System.out.println("Your company name: " + companyName); // (Bank of America) this will return Bank only as next method only returns the first and only one word.

    }

}
