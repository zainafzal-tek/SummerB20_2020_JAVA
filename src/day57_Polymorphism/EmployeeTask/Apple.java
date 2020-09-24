package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester1 = new Tester("Rob", "1T2345", "SDET", 120_000, 'M');
        Employee tester2 = new Tester("John", "1T4567", "SDET", 119_000, 'M');
        Employee tester3 = new Tester("Aalia", "1T5678", "Senior SDET", 145_000.50, 'F');
        Employee tester4 = new Tester("Zain", "1T6789", "Junior SDET", 100_000.45, 'M');

        Employee developer1 = new Developer("Muhtar", "2D1234", "Senior Dev", 145_000.34, 'M');
        Employee developer2 = new Developer("Saim", "2D2345", "Junior Dev", 110_000.25, 'M');
        Employee developer3 = new Developer("Asiya", "2D3456", "Senior Dev", 145_000.29, 'F');

        Employee scrumMaster = new ScrumMaster("Kamil", "1SM234", "Scrum Master", 120_000, 'M');

        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1, tester2, tester3, tester4, developer1, developer2, developer3, scrumMaster));

        for (Employee each : scrumTeam){
            System.out.println(each.toString());
        }

    }


}
