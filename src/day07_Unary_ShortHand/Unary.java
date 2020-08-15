package day07_Unary_ShortHand;

public class Unary {

    public static void main(String[] args) {

        // unary operators: +, -, ++, --
        System.out.println(-1 + -10);
            // -1 -10 = -11

        System.out.println(-11 - -10);
        // -11 + 10 = -1

        //--: decreases value by 1

        int a = 20;
        // a = a - 1; a = 19
        --a;
        System.out.println(a);

        //++: increases value by 1
        int b = 10;
        //b = b + 1; final value of b = 11 (b = 10 + 1)
        ++b;
        System.out.println(b);

                  /*
                2 types of increment/decrement:
                    pre:
                        increases or decreases the value by 1 immediately.
                                --a, ++a
                    post: postpone, place the increment/decrement operators after variable
                          first passes current value, then next step increases/decreases value by 1
                                a++, a--

                 */
        //pre;
        int x = 100;
        System.out.println(++x); // 101

        int y = 200;
        System.out.println(--y); // 199

        int z = 80;
        System.out.println(++z); // 81 , after this step z = 81
        System.out.println(--z); // 80 , because after increment z = 81, so decrement will be z = 81 - 1



    }

}
