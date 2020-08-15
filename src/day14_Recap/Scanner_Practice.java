package day14_Recap;
/*
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Gender: ");
        String gender = scan.next();

        System.out.println("Enter Age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Country Name: ");
        String country = scan.nextLine();

        System.out.println("Enter ZIP code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Full Name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter Full Company Name: ");
        String companyName = scan.nextLine();

        System.out.println(gender + ", " + age + ", " + country + ", " + zipCode + ", " + fullName + ", " +  companyName);

    }

}
