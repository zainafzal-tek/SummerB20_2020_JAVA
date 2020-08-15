package day25_Practices;
/*
Write a program that can return the longest string of text from a String array
 */
public class ShortestString {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int minLength = arr[0].length();     // 4

        for (int i = 0; i <= arr.length - 1; i++){      // to find out the min length of the string in the array

            int l = arr[i].length();

            if (l < minLength){
                minLength = l;
            }

        }

        System.out.println(minLength);

        for (int i = 0; i <= arr.length - 1; i++){

            if (arr[i].length() == minLength){
                System.out.println(arr[i]);
            }

        }

    }

}
