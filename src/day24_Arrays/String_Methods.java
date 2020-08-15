package day24_Arrays;

import java.util.Arrays;

public class String_Methods {

    public static void main(String[] args) {

        //.toCharArray():

        String str = "ABCDEFGHIJ";
        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("===================================");

         String str1 = "DCEBA";
         String str2 = "ABCDE";

         char[] ch1 = str1.toCharArray();
         char[] ch2 = str2.toCharArray();

         Arrays.sort(ch1);
         Arrays.sort(ch2);

         Arrays.equals(ch1 , ch2);

        System.out.println("==================================");

        // .split(): splits the array from the given value, (RETURNS String)

        String sentence = "I Love Programming Language";

        String[] words = sentence.split(" "); // { I, Love, Programming, Language}
        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();
        System.out.println("==========================================");

        String s = "JAVA";
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray(); // difference between toCharArray and split is that the value returned by split are String
        System.out.println(Arrays.toString(c));



    }

}
