package day23_Arrays;

public class Array_Practice1 {

    public static void main(String[] args) {

        String[] students = {"Cybertek", "Muhtar", "Nadir", "Asiya"};

        String name1 = students[0];

        System.out.println("=============================================");

        int[] scores = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};

        for (int i = 0; i <= 4; i++){
            System.out.println(names[i] + " : " + scores[i]);
        }

        System.out.println("=================================================");

        String[] classMates = new String[5];
        classMates [0] = "Fatih";
        classMates [1] = "Hazel";
        classMates [2] = "Viorel";
        classMates [3] = "Virginia";
        classMates [4] = "Adam";

        // since the array sizez was determined when we created it with new key word, we cannot store more that 5 data types in it

        for (int i  = 0; i <= classMates.length - 1; i++){
            System.out.println(classMates[i]);
        }


    }

}
