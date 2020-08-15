package day03_sequences_Variables;
/*
    Task: 
        variables: salary, tax
            total tax = salary * tax
            salary after tax = salary - total tax
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        
        int salary = 150000;
        double tax = 0.28;
        double totaltax = salary*tax;
        double salaryaftertax = salary-totaltax;
        System.out.println(salaryaftertax);



        /*System.out.println(salary*tax);
        double totaltax = 28000.000000000004;
        System.out.println(salary-totaltax);
        System.out.println("Total Tax = 28000.000000000004");
        System.out.println("Salary after tax = 72000.0")*/
        
        
    }
    
}
