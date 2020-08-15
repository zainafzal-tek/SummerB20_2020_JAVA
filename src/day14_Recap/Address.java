package day14_Recap;

import java.util.Scanner;

/*
write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

 */
public class Address {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Full Name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter Building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Street Name: ");
        String streetName = scan.nextLine();

        System.out.println("Enter City Name: ");
        String city = scan.next();

        System.out.println("Enter State name: ");
        String state = scan.next();

        System.out.println("Enter Zip Code: ");
        int zipCode = scan.nextInt();

        scan.close();

        System.out.println("Ship To: " + fullName);
        System.out.println(buildingNumber + " " + streetName);
        System.out.println(city + ", " + state + " " + zipCode);



    }

}
