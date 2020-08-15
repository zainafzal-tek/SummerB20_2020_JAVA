package day08_LogicalOperators;
/*
 3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */
public class Post_Pre {

    public static void main(String[] args) {

        int a = 200;
        int b = -a++ + - --a * a-- % 2;

        // -200 + - 200 * 200 % 2
        // -200 + - 0
        // -200

        System.out.println(b);


        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;

        // 300 + 400 -300 * 400 + 300 / 400;
        // 300 + 400 - 300 * 400 + 0;
        // 300 + 400 - 120_000 + 0;
        // 700 - 120_000 + 0
        // -119_300

        System.out.println(z);

    }

}
