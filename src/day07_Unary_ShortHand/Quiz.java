package day07_Unary_ShortHand;

public class Quiz {

    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 123;
        float fvar = 200;




        System.out.println("result a" + 0 + 1);

        long a = 30L;
        long b = (short)a;
        System.out.println(b);

        float d = 100.5436_54f;
        short e = (byte)d;
        byte t = (byte) e;
        System.out.println(t);

        int a1 = 3;
        int a2 = 2;
        long c = (a1 + a2) *2/3%2;
        System.out.println(c);

        System.out.println(5*2/3%2+(3+2));

        System.out.println(3000%1000);

        byte A1 = 30;

        //int B1=B1+=A1;
        // B1 = B1 + A1;
        int B1 = A1;
        B1 += A1;
        System.out.println(B1);




    }

}
