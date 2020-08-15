package day17_StringReview;

public class String_Methods {

    public static void main(String[] args) {
        //charAt(index): ==> char

        String str = "Cybertek";
        //            01234567

        char ch1 = str.charAt(1);

        // +:
        String str2 = "Cybertek";
        str2 = str2 + " School";

        // length(): ==> int
        String str3 = "Cybertek";
        int l = str3.length();
        System.out.println("Length: " + l);
        // last index = length() - 1
        char ch2 = str3.charAt(l - 1); // 8 - 1 = 7
        System.out.println(ch2); // char at index 7 is k

        //upperCase & lowerCase:

        String str4 = "cybertek";
        str4 = str4.toUpperCase(); // "CYBERTEK"
        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase(); // "java"

        // trim():
        String str6 = "        cybertek       ";
        System.out.println(str6);
        str6 = str6.trim();
        System.out.println(str6);

        // substring:

        String str7 = "I like Java Language";
        //             012345678910

        String word = str7.substring(7 , 10 + 1); // "Java" added + 1 to last index as java ignores last last index represented by the int (DOESNT APPLY TO LAST INDEX OF STRING)
        System.out.println(word);

        String word2 = str7.substring(12);
        System.out.println(word2);

        // indexOf & lastIndexOf:  ==> int

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);

        System.out.println(str8.charAt(i1));

        int i2 = str8.indexOf("We ");
        System.out.println(i2);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        System.out.println(i4);

        //replace & replaceFirst:
        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#");
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");
        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replaceFirst("Java is", "C# is");
        System.out.println(s3);



    }

}
