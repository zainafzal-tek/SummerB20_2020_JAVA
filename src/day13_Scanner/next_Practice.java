package day13_Scanner;

import java.util.Scanner;

public class next_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //if we type two words if we have more than 1 next method (Zain Afzal), Afzal will automatically take scanner memory and fill the next method.

        System.out.println("Enter your First Name: ");
        String firstName = scan.next(); // only use this next method for one word only. ONLY take ONE word

        System.out.println("Enter your Last Name: ");
        String lastName = scan.next();
        String fullName = firstName + " " + lastName;

        System.out.println("Your Full name is: " + fullName);

    }

}
