package day45_Constructors;

public class Paycheck {

    public static void main(String[] args) {

        SalaryCalculator obj1 = new SalaryCalculator(58, 40, .2, .12);
        System.out.println(obj1.salary());
        System.out.println(obj1.salaryAfterTax());
        System.out.println("Total Tax: " + (obj1.salary() - obj1.salaryAfterTax()));

        System.out.println(obj1);

    }

}
