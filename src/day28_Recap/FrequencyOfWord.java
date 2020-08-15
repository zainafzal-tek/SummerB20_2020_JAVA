package day28_Recap;

import java.util.Scanner;

/*
 write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
 */
public class FrequencyOfWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String word = scan.next();

        int count = 0;
        for (int i = 0; i <= str.length() - word.length(); i++){

            if (str.substring(i , i + word.length()).equalsIgnoreCase(word)){
                count++;
            }

        }

        System.out.println(count);
    }

}
