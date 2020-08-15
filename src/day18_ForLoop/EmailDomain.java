package day18_ForLoop;

import java.util.Scanner;

public class EmailDomain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.next();

        String domain = email.substring(email.indexOf("@") + 1 , email.lastIndexOf("."));

        System.out.println(domain);

        String str = " ";
        str.trim();
        boolean result = str.isEmpty();
        System.out.println(result);

    }

}
