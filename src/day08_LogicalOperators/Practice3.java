package day08_LogicalOperators;

public class Practice3 {

    public static void main(String[] args) {

        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        //              3 == 2 ||  2  ==  2  && 1  ==  2
        //               false  ||   true   &&   false
        //               false   ||  false
        //                      false

        System.out.println(res);

        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5 || c == 5;
        //          5 == 6 || 6 == 5 || c == 5
        //          false || false  ||  true
        //                  true

        System.out.println(r2);

        boolean a = true;
        boolean B = !a;

        boolean C = a != B && a == !B && !a == B;
        //    true != false  &&  true  ==  true  &&  false == false
        //      true        &&      true        &&      true
        //                    =     true

        System.out.println(C);

        double e = 20;
        double f = 80;

        double g = f + e;
        double g1 = g * 25;
        double g2 = g1 % 40;
        boolean g3 = g2 <= 20;
        System.out.println(g3);




    }

}
