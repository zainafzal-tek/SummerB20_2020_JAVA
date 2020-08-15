package day16_StringCont;

import java.util.Scanner;

public class equalWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String s1 = scan.next();

        System.out.println("Enter second word");
        String s2 = scan.next();

        boolean equal = s1.equalsIgnoreCase(s2);

        /*if (equals){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }
         */

        String result = equal ? "They are equal" : "They are not equal";
        System.out.println(result);

    }

}
