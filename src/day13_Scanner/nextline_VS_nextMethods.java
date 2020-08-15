package day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextMethods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you salary: ");
        double salary = scan.nextDouble();
        scan.nextLine(); //this line is used to clear the scanner memory of the enter key. (MUST) use this to not have the enter key remaining in the scanner memory causing bug after using other scan methods before nextline method.
        //this bug is only for the nextline method, every other method will not take the enter key input.

        System.out.println("Enter Full Name: ");
        String fullName = scan.nextLine(); //this takes everything from inside the scanner memory (even enter key) which will cause a bug using after other scanner methods.


        System.out.println("Salary: " + salary);
        System.out.println("Full Name: " + fullName);

    }

}
