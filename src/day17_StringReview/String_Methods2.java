package day17_StringReview;

public class String_Methods2 {

    public static void main(String[] args) {

        String s1 = "Cat"; // String pool
        String s2 = new String("Cat"); // heap
        String s3 = new String("Cat");

        //equals(): (RETURNS BOOLEAN) checks value of variable and not the location of variable itself

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        System.out.println(s2 == s3); // false
        System.out.println(s2.equals(s3)); // true.

        // equalsIgnoreCase():
        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equals(s5)); // false. because java is case sensitive
        System.out.println(s4 == s5); // false because s4 and s5 are not sharing the same object

        System.out.println(s4.equalsIgnoreCase(s5)); // true, because this method ignores case sens.

        String s6 = "MuHtAr";
        String s7 = "muhtar";

        System.out.println(s6.equalsIgnoreCase(s7)); // true
        System.out.println(s6.equals(s7)); // false

        // isEmpty: is going to check if length of string is zero or not (RETURNS BOOLEAN)
        String s8 = "  ";
        System.out.println(s8.isEmpty()); // false since space still has an index value

        s8 = s8.trim();
        System.out.println(s8.isEmpty()); // true since trim removes unused space which leaves string s8 empty.

        // contains():
        String str = "Java, C#, Python, Ruby, C++";
        System.out.println(str.contains("Java")); //true
        System.out.println(str.contains("java")); //false

        System.out.println(s3.toLowerCase().contains("java")); //true

        String str2 = "ABCD";
        System.out.println(str2.contains("D")); // true

        //startsWith & endsWith:

        String str3 = "Cybertek";

        System.out.println(str3.startsWith("E") || str3.startsWith("C")); //true
        //                  false               ||          true        ==> true

        System.out.println(str3.startsWith("Cybabc")); // false

        String str4 = "Today is a great day";
        System.out.println(str4.endsWith("day")); // true

        System.out.println(str4.endsWith("great"));// false



    }

}
