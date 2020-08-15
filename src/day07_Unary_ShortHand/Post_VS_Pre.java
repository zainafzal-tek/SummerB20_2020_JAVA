package day07_Unary_ShortHand;

public class Post_VS_Pre {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a); // 11 due to increment

        int b = 10;
        System.out.println(b++); //10 since post increment passes through the value first
        System.out.println(b); //11

        int c = 25;
        int d = c++; // d=25 because post-increment is after the value of c
        //d=? c=?
        System.out.println(c);
        System.out.println(d);

        int e = ++d; // e = 26 since pre-increment is being read first by compiler.
        System.out.println(e);

        int x = 8;
        int y = x--;
        System.out.println(y); // y = 8  since x has not been incremended due to it being post decrement which is not applied in the same step
        System.out.println(x); // x = 7 since te decrement being applied to x in variable y is being applied in the print statement

        int X = 1;
        int Y = -X-- + X++;
        System.out.println("X= " +Y);

        int x1 = 2;
        int y1 = x1++;
        System.out.println(y1);

        int a1 = 1; // a1 = -1 , a1 = -1
        a1 = -a1-- + a1++ / -a1-- * --a1;
        // a1 = -1    +   0 / -1   *  -1
        // a1 = -1    +   0    *   -1
        // a1 = -1    +   0   = -1
        System.out.println(a1);

        int A = 50;
        A = --A + A++ + A-- + A++;
        // A = 49 + 49 + 50 + 49 = 197
        System.out.println(A);

        int a2 = 4; // -4 + -5 = -9
        a2 = a2 * 4 -a2++ - -a2;
        // a2 = 16 -a2++ - -a2;
        // a2 = 16 -4 - -5 ;
        // a2 = 16 + 1; = 17
        System.out.println(a2);


    }

}
