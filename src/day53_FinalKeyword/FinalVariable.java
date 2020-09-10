package day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor = "Brown";
    final String bloodType = "A-";

    //final int x; Compile error because with final keyword, the instace variables must be initialized immediately

    public static void main(String[] args) {

        // Final: This key word is to make a variable immutable.
        final LocalDate dateOfBirth = LocalDate.of(1994, 3, 7);

        System.out.println(dateOfBirth);

        final long ssn = 1234567;
        System.out.println(ssn);

        final double PI = 3.14;
        System.out.println(PI);

        final char gender = 'M';
        System.out.println(gender);

        final String fatherName = "HI";
        System.out.println(fatherName);

    }

}
