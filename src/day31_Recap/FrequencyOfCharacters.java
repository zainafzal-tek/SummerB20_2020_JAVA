package day31_Recap;
import Library.Util;

/*
use the methods removeDup and frequency in util class to create a thrid method called frequencyOfChars that can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3
            please copy paste the method to the util class

 */
public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AABBCC";
        String expectedResult = "";

        String nonDup = Util.removeDup(str);

        for (int i = 0; i <= nonDup.length() - 1; i++) {

            char ch1 = nonDup.charAt(i);
            int count1 = Util.frequency(str, ch1);
            expectedResult += "" + ch1 + count1;

        }
        System.out.println(expectedResult);
    }

    public static String frequencyOfChars(String str) {

        String expectedResult = "";

        String nonDup = Util.removeDup(str);

        for (char each : nonDup.toCharArray()) {
            int count1 = Util.frequency(str, each);
            expectedResult += "" + each + count1;
        }
        return expectedResult;
    }
}
