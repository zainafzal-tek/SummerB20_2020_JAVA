package day05_ArithmeticOperators;

public class EmployeeInfo2 {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Daniel";
        String gender = "Male";
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFulltime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        String fullName = firstName + " " + lastName; // combining 2 strings to make one which makes calling the appended values easier.

        System.out.println("Employee' full name is: " + fullName);
        System.out.println(fullName + "' gender is: " + gender);
        System.out.println(fullName + "' age is: " + age);
        System.out.println(fullName + " works at: " + companyName);
        System.out.println(fullName + "' Job title is: " + jobTitle);
        System.out.println(fullName + " is full time employee: " + isFulltime);
        System.out.println(fullName + "' salary is: $" + salary);
        System.out.println(fullName + " is married: " + isMarried);




    }

}
