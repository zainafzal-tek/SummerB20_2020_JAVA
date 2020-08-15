package day18_ForLoop;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        String s1 = str.substring(1);
        String s2 = str.substring(0 , 1);
        String result1 = s1 + s2;

        System.out.println(result1);



    }

}
