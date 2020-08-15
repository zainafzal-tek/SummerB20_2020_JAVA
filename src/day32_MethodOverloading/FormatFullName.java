package day32_MethodOverloading;

import java.util.Scanner;

/*
 write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
 */
public class FormatFullName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String last = scan.nextLine();

        String name = formatFullName(first , last);
        System.out.println(name);

    }

    public static String formatFullName(String firstName, String lastName){
        String result = "";

        String firstName2 = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastName2 = lastName.substring(0 , 1).toUpperCase() + lastName.substring(1).toLowerCase();
        result = firstName2 + " " + lastName2;

        return result;
    }

}
