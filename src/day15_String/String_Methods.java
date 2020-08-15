package day15_String;

import java.util.Scanner;

public class String_Methods {

    public static void main(String[] args) {

        String name = "Cybertek";
        //             01234567

        //charAt(index):
        char ch1 = name.charAt(0); //will return 'C'. Since each of these are single character, it will return me char and we can assign to char variable

        System.out.println(ch1);

        char ch2 = name.charAt(5); //will return 't'
        System.out.println(ch2);


    }

}
