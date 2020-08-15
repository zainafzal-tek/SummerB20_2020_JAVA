package day16_StringCont;

import java.util.Scanner;

/*
Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If
 */
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = scan.next();

        System.out.println("Enter second word");
        String second = scan.next();

        boolean invalid = first.length() == 5 && second.length() == 5;

       /*
        if (invalid){
            char ch1 = first.charAt(first.length() - 1);
            char ch2 = second.charAt(0);

            if (ch1 == ch2){
                System.out.println("Fuzz");
            }else {
                System.out.println("Buzz");
            }

        }else {
            System.out.println("Need to be exactly 5 chars length");
        }
       */

        boolean b1 = first.endsWith(second.charAt(0)+ "");
        boolean b2 = second.startsWith(first.charAt(first.length()-1) + "");


        if (invalid){

            if (b1 && b2) {
                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }
        }else {
            System.out.println("Need to be exactly 5 character length");
        }

    }

}
