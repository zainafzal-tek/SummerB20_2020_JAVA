package day25_Practices;

public class Array_1_100 {

    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0; i <= number.length - 1; i++){
            number[i] = i + 1;
        }

        for (int each : number){

            if (each % 2 != 0 ){
                continue;
            }
            System.out.println(each);
        }



    }

}
