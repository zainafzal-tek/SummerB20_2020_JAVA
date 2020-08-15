package day20_whileLoops;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++){

            String s = "" + str.charAt(i);

           if (!result.contains(s)) { // if the character is already contained in thne result, we will not add  it again
               result = result + s; // or can be written as result += s
           }
        }
        System.out.println(result);
    }

}
