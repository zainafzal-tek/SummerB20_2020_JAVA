package day15_String;

import java.lang.String;
import java.util.Scanner;

public class String_Intro {

    public static void main(String[] args) {

        String str = "Cybertek";
        Scanner input = new Scanner(System.in);

        String name = new String("Cybertek"); // This is creating a String by using the 'new' keyword.

        String s1 = "Cat"; // String literal
        String s2 = "Cat"; // String literal. String literals are located in String pool which is in Java heap memory
        // there is no duplication in the string pool. if there are two same objects, only one will be saved in String pool.
        // objects must match to be equal to each other.

        String t1 = new String("Tiger"); // every time we use the new keyword, a new object is created in the Heap memory.
        String t2 = new String("Tiger"); // duplicates are accepted in the JAVA heap memory.
        // t1 !=(not equal) t2 since they are not the same objects even though they have the same value.

        System.out.println("===============================================");

        String c1 = "Cybertek"; // this object is created in String pool
        String c2 = new String("Cybertek"); //this object is created in JAVA heap memory

        System.out.println(c1 == c2);  // ==> false, because they are 2 different objects in 2 different locations

        String c3 = new String("Cybertek"); // even though located in heap, this is created using new keyword, which makes it a unique object.
        String c4 = "Cybertek"; //saved in String pool.

        System.out.println(c1 == c4); //==> true, because located in same located and in pool duplicated Strings willbe saved once, hence they will be equal if identical.

        String c5 = "cybertek"; // String literal.
        System.out.println(c4 == c5); // ==> false, because JAVA is case-sensitive language, hence these are two different objects, even though both are located in String pool

        // String is a combination of sequences of characters.
        // every character has a representative number called index number located in ASCI table
        // By using the methods of the String and Character numbers, we can manipulate the String.

        // length(): This will givce the total number of characters in a string. It is returned as an int.

        int l = str.length() ; // will return the amount of characters in the string typed in te scanner. ==> int.
        System.out.println(l);
        //str.length() - 1 willl give us the index of the last character in the variable

        //last index: length of String - 1
        String name2 = "Cybertek School";
        int lastIndexNumber = name2.length() - 1; // to find the last index number of characters in a string
        System.out.println(lastIndexNumber);

        // to find the last character in the string using the last index number we found out by calculating.
        char lastChar = name2.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(Str):
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School"); // will concat cybertek and school, "Cybertek School"

        //toLowerCase(): will make every uppercase character convert to lower case in the string, (RETURNS NEW STRING)
        String name4 = "CYBERTEK SCHOOL";
        String lowerCase = name4.toLowerCase();
        System.out.println(lowerCase);

        //toUpperCase(): will make every lowercase character convert ot Uppercase in the String. (RETURNS NEW STRING)
        String name5 = "cybertek school";
        String upperCase = name5.toUpperCase();
        System.out.println(upperCase);

        //trim(): removes the unused space (White Space). (RETURNS NEW STRING)
        String p = "     Cybertek School    ";
        p = p.trim(); // "Cybertek School"
        System.out.println(p);

        //substring(): creates the substring of the string.
        // Creates the substring from the given beginning index till the ending index
        // (ENDING INDEX WILL BE EXCLUDED)



    }

}
