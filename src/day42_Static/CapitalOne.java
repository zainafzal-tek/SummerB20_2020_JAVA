package day42_Static;

public class CapitalOne {

    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Aalia", 'F', 15111L,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',15222L,"Tester", 180000);
        testers[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);


        Developer[] developers = {new Developer(), new Developer(),new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Waqar", 'M', 2111L, "Dev Lead" , 450000);
        developers[1].setInfo("Roza", 'F', 3222L, "Dev", 550000);
        developers[2].setInfo("Burak", 'M', 43333L, "Dev", 650000);
        developers[3].setInfo("Virginia", 'F', 76543, "Dev", 130000);
        developers[4].setInfo("Akbar", 'M', 0005L, "Dev", 150000);

        ScrumTeam team1 = new ScrumTeam();

        team1.setInfo("Ramazan", "Hamit", "Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);

        System.out.println("==============================================");

        for (Tester each : team1.testers){
            System.out.println(each.name + ", Salary: $" + each.salary);
        }


        System.out.println("===============================================");

        for (Developer each : developers){
            System.out.println(each.name + ", Salary: $" + each.salary);
        }

        System.out.println("================================================");

        team1.removeTester(15111L);
        team1.removeDeveloper(0005L);
        System.out.println(team1);

        System.out.println("=================================================");

        Developer dev1 = new Developer();
        dev1.setInfo("luisa", 'F', 2113L, "Dev Lead", 500000);

        team1.addDeveloper(dev1);
        System.out.println(team1);

    }

}
