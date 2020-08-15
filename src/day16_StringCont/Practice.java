package day16_StringCont;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //equalsIgnoreCase:

        Scanner scan = new Scanner(System.in);
        System.out.println("Employed:");
        String answer = scan.next();
        boolean isEmployed = answer.equalsIgnoreCase("yes");

       if( isEmployed) {
           System.out.println("Employed");
       }else {
           System.out.println("Not Employed");
       }
    }

}

