package day04_variables;

public class Variables2 {

    public static void main(String[] args) {

        char ch1 = 'A'; // To declare a character, we need to use char. Another way to declare a char is by giving the number of the character from ASCI table.
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 35000;
        System.out.println(ch3);

        char ch4 = 45876; // 'char' is not limited to the ASCI table, in its whole range it, prints the character assigned to the number.
        System.out.println(ch4);

        char c1 = 'A'; // ASCI table no: 65
        char c2 = 'B'; // ASCi table no: 66

        /* c1 + c2 will result in the sum being of the
            ASCI table number sum of both the characters
         */

        System.out.println(c1+c2);

        int result = c1 + c2;

        System.out.println(result);

        double d = c1+c2;

        System.out.println(d);

        int num1 = 'A';
        System.out.println(num1);

        char c4 = 65 + 45;
        System.out.println(c4);

        char c7 = '1'; // 49
        System.out.println(c7 + 1); // 50 ="n"

        char c8 = 49;
        System.out.println(c8);

        char c9 = '@';
        char c10 = 64;
        System.out.println(c9);
        System.out.println(c10);

        // Every 'char' has its own corresponding number





    }

}
