package day16_StringCont;

import java.util.Scanner;

/*
write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double n1 = scan.nextDouble();

        System.out.println("Enter second number");
        double n2 = scan.nextDouble();

        System.out.println("Enter math operator");
        char c1 = scan.next().charAt(0);

        boolean validOperator = c1 == '*' || c1 == '/' || c1 ==  '+' || c1 ==  '-' || c1 == '%';

        if (validOperator){
            switch (c1){
                case '*':
                    System.out.println(n1 * n2);
                    break;

                case '/':
                    System.out.println(n1 / n2);
                    break;

                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                default:
                    System.out.println(n1 % n2);
            }
        }else {
            System.out.println("Enter Valid Operator");
        }


    }

}
