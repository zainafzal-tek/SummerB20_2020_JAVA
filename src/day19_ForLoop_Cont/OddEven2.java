package day19_ForLoop_Cont;

public class OddEven2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++){

            if (i % 2 != 0){ // if the number is odd skip it
                continue;
            }

            System.out.println(i + " ");
        }

        for (int i = 0; i <= 50; i++){ // in order to print odd, we can choose to skip even number

            if (i % 2 == 0){ // if the number is odd skip it
                continue;
            }

            System.out.println(i + " ");
        }

    }

}
