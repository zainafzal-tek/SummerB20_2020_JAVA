package day06_ComparisonOperators;
/*relational operators: returns boolean at the end (true or false)
                    > : greater than
                    < : less than
                    >= : greater than or equal to
                    <= : less than or equal to
                    == : equal to, syntax must be == to use this operator as = in java is the assignment operator
                    != : not equal to

                    =: assigns value to variable
                    == : returns boolean

                    9 > 8 ==> true
                    7 < 6 ==> false
                    7 >= 7 ==> true
                    6 <= 5 ==> false
                    "Muhtar" == "Good Guy" ==>false
                    "Muhtar" != "Good Guy" ==>true

        */
public class RelationalOperators {

    public static void main(String[] args) {

        boolean r1 = 10 > 9; //10 is greater than 9
        System.out.println(r1);

        boolean r2 = 100 < 9000; // 100 is less than 9000
        System.out.println(r2);

        boolean r3 = 87 >= 85; // 87 is greater than 85 but not equal, at least one condition needs to be true to get true result
        System.out.println(r3);

        boolean r4 = 877 >= 878; // 877 is not greater than and not equal to 879 so result will be false
        System.out.println(r4);

        boolean r5 = 200 <= 300; // 200 is less than 300, as long as one condition is true, result will be true
        System.out.println(r5);

        // == : equal
        boolean r6 = 900 == 800; // 900 is not equal to 800 so result will be false
        System.out.println(r6);

        boolean r7 = true == false; // true is not equal to false
        System.out.println(r7);

        boolean r8 = "muhtar" == "good guy"; //statement is not true so result will be false
        System.out.println(r8);

        // only apply == to same data types. it will not compile if, "text" == 123(number), we are trying to apply text to integers

        boolean r12 = true != false; // true is not equal to false so the result will  be true.
        System.out.println(r12);

        boolean result1 = 'A' == 65; // no compile error because, 'char' characters have a corresponding number. in this case 'A' number is 65 which is == 65 so result will be true.
        System.out.println(result1);

        boolean result2 = 100 == 100.0; // in maths 100 is equal to 100.0 because the valuse is the same as 100.0 has zero after decimal
        System.out.println(result2);

        boolean result3 = 10 == (int)10.9999999; // casting the decimal to 'int' will remove the decimal point as int is whole number primitive, this will cause the statement to be true
        System.out.println(result3);

        boolean result4 = "100" == "100.0"; // this will be false as the first string of text has 3 letters and the second has 5
        System.out.println(result4);

        boolean result5 = 100%2 == 0; // will be true as 100/2 will provide zero remainder (%)
        System.out.println(result5);

        int number = 101;
        boolean even = number % 2 == 0;

        System.out.println(even);

        boolean odd = number%2 != 0;
        System.out.println(odd);

        /*
        divisible by 3: x % 3 == 0 ==> false
        divisible by 5: x % 5 == 0 ==> true
        divisible by 1o: x % 10 == 0 ==> true
         */

        int x = 1000;
        boolean divisibleBy = x%3 == 0;
        System.out.println(divisibleBy);




    }

}
