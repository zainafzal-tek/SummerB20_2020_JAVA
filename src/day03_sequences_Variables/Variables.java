package day03_sequences_Variables;
/*
declare variables:
        Datatype variableName = Data
 */
public class Variables {

    public static void main(String[] args) {
        //length: 2, width: 4, area:?

        byte length = 11;
        byte width = 12;
        System.out.println(length*width);

        //140
        //Byte cannot hold 140

        short num1 = 140;

        //40000
        //short datatype cannot hold 40000 as its higher than its range

        int salary = 40000;

        //99999999999
        /*
        compiler will always assume a whole number as an int data type.
        to bypass this and tell compiler a number is long we need to type "l"at the end of number.
         */
        long largenumber = 99999999999l;

        int score = 100;

        System.out.println(score);

        //PI = 3.14

        double PI = 3.5;
        System.out.println(PI);

        float decimal1 = 2.3f; //any decimal value will be recognized by default as a double, to specify floater we will specify with letter 'f'

        // double > float > long > int > short > byte
        /*Variable declaration rules:
            1. MUST be unique, (cannot be duplicated)
            2. Has to start with letters, (cannot start with numbers or special characters)
            3. Cannot contain any special characters except '$' and '_'
            4. Cannot use any of JAVA reserved word.
            5. Variable must be readable (use camelCase e.g double taxRate = 3)
            6. Must be readable and meaningful
         */

    }

}
