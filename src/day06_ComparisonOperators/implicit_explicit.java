package day06_ComparisonOperators;

public class implicit_explicit {

    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1; // implicit casting is done automatically.

        long l2 = (long)s1; // this step is manually casting (long) to the data. This is not recommended since it is already done by IDE.
                            // implicit casting: casting a smaller primitive to a larger primitive.

                /*
                 explicit casting: casting a larger primitive to a smaller.
                                    THIS MUST BE DONE MANUALLY.
                 */

        double num1 = 100.5;
        int b =(int) num1; // casting is done manually to assign larger primitive to smaller
        System.out.println(num1);

        double d1 = 400.5555555;
        int il = (int)d1;
        System.out.println(il); // = 400, due to the double being manually casted to int which would result in a whole number.

        long L1 = 4400;
        short S2 =(short)L1;
        System.out.println(S2);

        int n1 = 1000;
        byte b1 = (byte)n1; // since byte range is only till -127 the answer given will be derived from other calcualtions.
        // when explicit casting always stay within ranges of data types.
        System.out.println(b1);

        double m1 = 34.5;
        float f1 =(float) m1; /*explicit casting can be done to this value to any of the smaller primitive types because it is in the range of every primitive type. */
        long L2 = (short)f1;

        System.out.println(f1);
        System.out.println(L2);

        long r1 = -500;
        int p1 = (int)r1;

        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte)r2;

        System.out.println(t1); // AGAIN, explicit casting is only needed when assigning larger primitive type to smaller primitive type.





    }

}
