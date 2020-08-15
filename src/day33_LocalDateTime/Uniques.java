package day33_LocalDateTime;

import javax.swing.plaf.IconUIResource;

public class Uniques {

    public static void main(String[] args) {

        double[] n2 = {10, 20, 30, 40, 50};
        uniqueElements(n2);
        System.out.println();

        System.out.println("============================");

        String[] n3 = {"A", "B", "C", "D", "D", "E"};
        uniqueElements(n3);
        System.out.println();

        char[] n4 = {'A', 'A', 'B', 'C', 'C'};
        uniqueElements(n4);
        System.out.println();

    }

    public static void uniqueElements(int[] arr){

        for (int element : arr) {
            int count = 0;
            for (int each : arr) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
    }

    public static void uniqueElements(String[] arr){

            for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
    }

    public static void uniqueElements(char[] arr){

        for (char element : arr) {
            int count = 0;
            for (char each : arr) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
    }

    public static void uniqueElements(double[] arr){

        for (double element : arr) {
            int count = 0;
            for (double each : arr) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
    }

}





