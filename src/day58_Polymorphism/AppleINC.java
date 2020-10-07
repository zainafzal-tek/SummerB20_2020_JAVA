package day58_Polymorphism;

import day57_Polymorphism.EmployeeTask.Developer;
import day57_Polymorphism.EmployeeTask.Employee;
import day57_Polymorphism.EmployeeTask.ScrumMaster;
import day57_Polymorphism.EmployeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {

    public static void main(String[] args) {

        Employee[] workers = {
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new ScrumMaster("Kamil", "78945", "Scrum Master", 120000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new ScrumMaster("Kamil", "78945", "Scrum Master", 120000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M')
        };

        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));
        int countTester = 0;
        int countDeveloper = 0;
        int countScrumMaster = 0;

        for (int i = 0; i <= scrumTeam.size() - 1; i++){
            if (scrumTeam.get(i) instanceof Tester){
                countTester++;
            } else if (scrumTeam.get(i) instanceof Developer){
                countDeveloper++;
            } else {
                countScrumMaster++;
            }
        }

    }

}
