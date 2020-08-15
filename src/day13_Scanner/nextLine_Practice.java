package day13_Scanner;

import java.util.Scanner;

public class nextLine_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Building Number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine(); // used to clear Enter key inout from scanner memory.

        System.out.println("Enter your Street Name: ");
        String streetName = scan.nextLine();

        System.out.println(buildingNumber + " " + streetName);

        scan.close(); //this method is used to close the scanner.   It (RECOMMENDED) to close the scanner after typing.

    }

}
