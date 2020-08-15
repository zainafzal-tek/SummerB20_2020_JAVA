package day19_ForLoop_Cont;
/*
 1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
 2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

 */
public class OddEven {

    public static void main(String[] args) {
// Task 01:
        for (int i = 1; i <= 99; i += 2){

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

        for (int i = 0; i <= 100; i++){

            if (i % 2 != 0) { // pre-condition: i MUST be odd number
                if (i % 5 == 0 && i % 3 == 0) { // sub: must be divisible by 3 & 5
                    System.out.print(i + " ");
                }

            }

        }
        System.out.println();

        System.out.println("==================================");

        // Task 02:

        for (int i = 0; i <= 100; i += 2){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){ // pre-cond: i MUST be even number
                if (i % 3 == 0 && i % 5 == 0){ // sub-cond: i MUST be divisble by 3 & 5
                    System.out.print(i + " ");
                }

            }

        }
        System.out.println();

    }

}
