package day13_Scanner;

import java.util.Scanner;
/*
 write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
                MUST use Scanner

 */
public class TaxCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Annual Salary:");

        double annualSalary = scan.nextDouble();

        System.out.println("Enter State Tax:");

        double stateTaxRate = scan.nextDouble();
        double stateTaxOwed = annualSalary * stateTaxRate;

        System.out.println("Enter Federal Tax");

        double federalTaxRate = scan.nextDouble();
        double federalTaxOwed = annualSalary * federalTaxRate;

        double salaryAfterTax = annualSalary - (stateTaxOwed + federalTaxOwed);

        System.out.println("Your Annual Salary: $" + annualSalary);

        System.out.println("State Tax Owed: $" + stateTaxOwed);

        System.out.println("Federal Tax Owed: $" + federalTaxOwed);

        System.out.println("Salary After Tax: $" + salaryAfterTax);

    }

}
