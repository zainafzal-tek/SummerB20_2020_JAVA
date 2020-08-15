package day21_loops;
/*
write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                Output: 3 with a remainder of 1
 */
public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        if(b == 0){
            System.out.println("invalid Input");
            System.exit(0);
        }

        int count = 0;

        while (a >= b){
            a -= b;
            count++;
        }

        System.out.println(count);
        System.out.println(a);

    }

}
