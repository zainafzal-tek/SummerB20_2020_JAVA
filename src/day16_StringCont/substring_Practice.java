package day16_StringCont;

import java.util.Scanner;

public class substring_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String str1 = scan.next();

        System.out.println("Enter your second word");
        String str2 = scan.next();

        //String result = str1.substring(1) .concat(str2.substring(1));
        String result = str1.substring(1) + str2.substring(1);
        System.out.println(result);

    }

}
