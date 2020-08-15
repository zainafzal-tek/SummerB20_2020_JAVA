package day15_String;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scan.next();

        System.out.println("Enter Last Name:");
        String lastName = scan.next();

        String fullName = firstName.concat(" " .concat(lastName));
        System.out.println(fullName);



    }

}
