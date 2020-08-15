package day31_Recap;
/*
 write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class

 */

public class WarmupTasks {


    public static void main(String[] args) {

        String str = "aabbccd";
        String uniques = "";

        for (char each : str.toCharArray()) {

            char ch = str.charAt(each);
            int count = frequencyOfString(str, ch);
            if (count == 1) {
                uniques += ch;

            }

        }
        System.out.println(uniques);
    }

    public static int frequencyOfString(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()){

            if (each == ch) {
                count++;
            }

        }

        return count;
    }

    public static String uniques(String str){

        String uniques = "";

        for (char each : str.toCharArray()) {

            char ch = str.charAt(each);
            int count = frequencyOfString(str, ch);
            if (count == 1) {
                uniques += each;

            }

        }

        return uniques;
    }

}
