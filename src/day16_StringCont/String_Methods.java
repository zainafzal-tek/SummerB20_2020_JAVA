package day16_StringCont;

public class String_Methods {

    public static void main(String[] args) {

        //replace(): replaces old value with new value. will return  a new String.

        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo"); // new string returned will be cybetek@yahoo.com
        System.out.println(email);

        String word = "java";
        word = word.replace("a", "e"); // new string returned will be jeve.
        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#"); // try to make replace value unique so that replacing a specific value is easier
        System.out.println(sentence);

        sentence = sentence.replace("Java ", "Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybetek, Cybertek is nice place";
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek"); //to replace mit with cybertek
        System.out.println(s1);

        //replaceFirst(old value, new value): replaces the first value entered in the string if the value is repeated in the sentence. (RETURNS String)

        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola"); // this will replace the first tea to cola without replacing the second tea.
        System.out.println(s3);

        //indexOf(value): is used to find the index number of the first occured character in the sentence. (RETURNS int)
        String s4 = "I like to stay in cybertek, we are learning java";
        int n1 = s4.indexOf("r");
        int n2 = s4.indexOf("re"); //using unique value to find the index number of the second r in the sentence
        System.out.println(n1);

        //lastIndexOf(): is used to find index number of the last occured value of a certain character (RETURNS int)
        String s6 = "Java is a programming language,and java is fun";

        int i1 = s6.indexOf("J"); //finds the index numebr of the first J in the sentence
        int i2 = s6.lastIndexOf("J"); //finds the index number of the last J in the sentence
        // Index number cannot be any lower than zero

        System.out.println(i1);
        System.out.println(i2);

        String s7 = "java";
        int a1 = s7.indexOf("A"); //since A does not exist in the string, te int returned will be -1.
        System.out.println(a1); // since index number cannot be negative integers, a negative value will mean that character does not exist in the string.

        //isEmpty(): checks if the string is empty. (RETURNS boolean)
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty()); //false cause string isnt empty

        String name2 = "";
        System.out.println(name2.isEmpty()); //true cause string is empty

        //equals(string): checks if the text of one string has the same text as another one
        // this is used to compare strings and this is the only way to compare a string literal and "new object" string values as '==' operator will return false because of memory locations of the two and as they are two separate objects.
        // (DOES NOT IGNORE CASE-SENS) (RETURNS boolean)

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2); // false because they are separate objects
        System.out.println(str1.equals(str2)); // true because the texts of the strings are the same

        String str3 = "Java";
        String str4 = "Java";

        System.out.println(str3 == str4); //true because in the pool these both are linked to the same word which will cause them to be equal to each other
        System.out.println(str3.equals(str4));// true because they have the same text value

        //equalsIgnoreCase(): checks if the text of one string has the same text as another one
        //(IGNORES CASE-SENS) (RETURNS boolean)

        //contains(str): checks if the given str(value) is in the string or not. (RETURNS boolean, is CASE-SENS)

        //startsWith(""):  will only check the first letter of the first word in the string
        String str5 = "Zain is good";
        System.out.println(str5.startsWith("Zain is")); //true
        System.out.println(str5.startsWith("M"));

    }

}
