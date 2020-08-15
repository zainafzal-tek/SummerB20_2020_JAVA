package day04_variables;

public class Variables3 {

    public static void main(String[] args) {
        // school name: Cybertek School

        String schoolName = "Cybertek School";
        System.out.println(schoolName);
        System.out.println();

        /*
        task:
            declare the following variables
                employeeName
                employeeID
                jobTitle
                salary
                gender (char)
                isFullTime (boolean)
         */

        String employeeName = "Zain Ul Aabideen Afzal";
        int employeeID = 223123;
        String jobTitle = "SDET";
        double salary = 100_000.50;
        char gender = 'M';
        boolean isFullTime = true;

        System.out.println(employeeName);
        System.out.println(employeeID);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(isFullTime);

        System.out.println("\nEmployee Name: " + employeeName); //adding '+' will bring "message in quotes" and a "string together"(concatenation)
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary + " USD");
        System.out.println("Gender: " + gender);
        System.out.println("Full-Time: " + isFullTime);




    }

}
