package day12_Switch_Scanner;

import java.util.Scanner;
/*
write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. ask the user how many hours does he/she works in a week
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
 */
public class RateCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter Hours working per Week: ");
        int hours = input.nextInt();

        double rate = salary/(hours * 52);
        System.out.println("Hourly rate = $" + rate);


    }

}
