package day18_ForLoop;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First name:");
        String firstName = scan.next();

        System.out.println("Enter Last name");
        String lastName = scan.next();

        /*
        firstName.substring(0 , 1);
        lastName.substring(0 , 1);

        String initial = firstName.substring(0 , 1) + "." + lastName.substring(0 , 1);
        initial = initial.toUpperCase(); // JP

        System.out.println("Initials are: " + initial);
        */

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial = ch1 + "." + ch2;
               initial = initial.toUpperCase();

        System.out.println("Initials are: " + initial); // to get Char value as character we need to concat with a string.



    }


}
