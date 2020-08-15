package day24_Arrays;

import java.util.Scanner;

public class Uniques2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String unique = "";

        for (int j = 1; j <= str.length() - 1; j++){
            char ch1 = str.charAt(j); // a
            int count1 = 0; // frequency of ch

            for (int i = 0; i <= str.length() - 1; i++){        // used for finding the frequency of ch and assign to count
                char each = str.charAt(i); // a  a  b  c  c
                if (ch1 == each){
                    count1 += 1;
                }

            }

            if (count1 == 1){ // this is used to assign if a certain character only occurred once
                unique += ch1;
            }
        }

        System.out.println(unique);


    }

}
