package day15_String;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scan.next();
        char n1 = firstName.charAt(0);

        System.out.println("Enter last name:");
        String lastName = scan.next();
        char n2 = lastName.charAt(0);

        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Initials are: " + n1 + "." + n2 + ".");




    }

}
