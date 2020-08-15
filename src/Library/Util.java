package Library;

import java.util.Arrays;

public class Util {

    public static String removeDup(String str){

        String nonDup = "";

        for (String each : str.split("")){
            if (!nonDup.contains(each)){
                nonDup += each;
            }
        }

        return nonDup;
    }
    // removes the duplicated characters in a string

    public static String reverse(String str){
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }
    //reverses the string

    public static String formatFullName(String firstName, String lastName){
        String result = "";

        String firstName2 = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastName2 = lastName.substring(0 , 1).toUpperCase() + lastName.substring(1).toLowerCase();
        result = firstName2 + " " + lastName2;

        return result;
    }
    // gives full formatted name

    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }
    // retunrs the uniiques from the string

    public static String frequencyOfChars(String str) {

        String expectedResult = "";

        String nonDup = Util.removeDup(str);

        for (char each : nonDup.toCharArray()) {
            int count1 = Util.frequency(str, each);
            expectedResult += "" + each + count1;
        }
        return expectedResult;
    }
    //combines the character and the frquency of it from a string

    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for(String each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(String each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // Combines two String Arrays

    public static int maxNum(int[] arr){

        int max =arr[0];

        for (int each : arr){
            if (each > max){
                max = each;
            }
        }

        return max;
    }
    //returns the max number

    public static Integer maxNum(Integer[] arr) {

        Integer max =arr[0];

        for (Integer each : arr){
            if (each > max){
                max = each;
            }
        }

        return max;
    }
    //returns the max number

    public static int minNum(int[] arr2){

        int min = arr2[0];

        for (int each : arr2){
            if (each < min){
                min = each;
            }
        }

       return min;
    }
    //returns the minimum number

    public static Integer minNum(Integer[] arr2){

        Integer min = arr2[0];

        for (Integer each : arr2){
            if (each < min){
                min = each;
            }
        }

        return min;
    }
    //returns the minimum number

    public static int frequencyOfWord(String s1){

        String s = "";
        String word = "";

        int count = 0;
        for (int i = 0; i <= s.length() - word.length(); i++){

            if (s.substring(i , i + word.length()).equalsIgnoreCase(word)){
                count++;
            }

        }

        return count;
    }
    //returns the frequency of a word in a string

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static int frequency(String str, char ch){
        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }
    //  finds the frequency of char from string str and returns it as int

    public static int[] addElement(int[] arr, int num){

        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length-1] = num;
        int i = 0;
        for (int each : arr){
            arr2[i] = each;

            i++;
        }
        return arr2;
    }
    // adds an element to an array

    public static int[] sortDescend(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // sorts int in descending order

    public static double[] sortDescend(double[] arr){
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    //sorts decimals int descending order

    public static double maxNum(double[] arr){

        double max =arr[0];

        for (double each : arr){
            if (each > max){
                max = each;
            }
        }

        return max;
    }
    //returns the max number

    public static Double maxNum(Double[] arr){

        Double max =arr[0];

        for (Double each : arr){
            if (each > max){
                max = each;
            }
        }

        return max;
    }
    //returns the max number

    public static String[] sortDescend(String[] arr){
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    //sorts string in descending order

    public static char[] sortDescend(char[] arr){
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length- 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    //sorts chars in descending order

    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    //sorts Integer Array in descending order

    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    //Sorts Double Array

    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    //sorts Character Array in descending order

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Integer each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // Combines two Integer Arrays

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for(Double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two Double Arrays

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for(Character each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Character each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two Character Arrays



}


