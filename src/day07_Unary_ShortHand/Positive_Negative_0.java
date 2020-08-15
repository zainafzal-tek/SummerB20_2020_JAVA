package day07_Unary_ShortHand;
/*
write a umber that can verify if the number is positive, negative, 0

    Ex.
        number = 120
    Output:
        120 is a positive number? true
 */

public class Positive_Negative_0 {

    public static void main(String[] args) {

        double number = 120;

        boolean positiveNumber = number > 0;
        boolean negativeNumber = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is a positive number? " + positiveNumber);
        System.out.println(number + " is a negative number? " + negativeNumber);
        System.out.println(number + " is equal to zero? " + isZero);


    }

}
