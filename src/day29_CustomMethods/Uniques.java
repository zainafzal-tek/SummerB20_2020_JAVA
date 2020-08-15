package day29_CustomMethods;
/*
 Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */
public class Uniques {

    public static void main(String[] args) {

        String[] arr = {"A", "A", "B", "C", "C"};



        for (String a : arr) { //  retrieves each element in array
            int count = 0;
            for (String each : arr) { // retrieves frequency of element
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a + " ");
            }
        }


    }

}
