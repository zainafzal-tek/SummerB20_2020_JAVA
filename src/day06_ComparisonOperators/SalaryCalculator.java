package day06_ComparisonOperators;

public class SalaryCalculator {

    /*
     task04:
                Create a class called SalaryCalculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
                    ex:
                        if: rate = 55;
                            stateTaxRate = 0.04;
                            federalTaxRate =0.22;
                            weeklyHours = 40;
                        then output will be:
                                your salary is: 105600 USD
                                your total tax is: 27456 USD
                                your income after tax is: 78144 USD
                    Assume that a year has 48 weeks (excluding PTO)

     */
    public static void main(String[] args) {


            int rate = 55;
            double stateTaxRate = 0.04;
            double federalTaxrate = 0.22;
            int weeklyHours = 40;
            double salary = rate * weeklyHours;
            double yearlySalary = salary * 48;

            double totalStateTax = yearlySalary * stateTaxRate;
            double totalFederalTax = yearlySalary * federalTaxrate;
            double totalTax = totalStateTax + totalFederalTax;
            double incomeAfterTax = yearlySalary - totalTax;

            System.out.println("Salary per week is: $" + salary);
            System.out.println("Salary per year is: $" + yearlySalary);
            System.out.println("State tax owed this year is: $" + totalStateTax);
            System.out.println("Federal tax owed this year is: $" + totalFederalTax);
            System.out.println("Total tax owed this year is: $" + totalTax);
            System.out.println("Salary after tax is: $" + incomeAfterTax);


    }

}
