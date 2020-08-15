package day16_StringCont;

import java.util.Scanner;

/*
Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true

 */
public class FirstLastCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word");
        String str = scan.next();

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        System.out.println(firstChar == lastChar);

    }

}
