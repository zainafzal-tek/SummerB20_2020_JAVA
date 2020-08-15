package day32_MethodOverloading;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scan.nextDouble();

        System.out.println("Enter operator: ");
        char oper = scan.next().charAt(0);

        System.out.println("Enter second number: ");
        double secondNum = scan.nextDouble();

        double res = calculator(firstNum, oper , secondNum);
        System.out.println("Result: \n" + res);

    }

    public static double calculator(double num1, char oper, double num2){
        double result = (oper == '+') ? num1 + num2 : (oper == '-') ? num1 - num2 : (oper == '*') ? num1 * num2 : (oper == '/') ? num1 / num2 : (oper == '%') ? num1 % num2 : 0;

        return result;
    }

}
