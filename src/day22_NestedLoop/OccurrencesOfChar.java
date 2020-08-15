package day22_NestedLoop;

import java.util.Scanner;

/*
 Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2

 */
public class OccurrencesOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char ch = scan.next().charAt(0);

        int count = 0; // this is used to get the frequency of ch in str

        for (int i = 0; i < str.length() - 1; i++){

            char each = str.charAt(i);

            if (each == ch){
                count += 1;
            }

        }

    }

}
