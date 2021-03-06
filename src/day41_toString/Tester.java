package day41_toString;

public class Tester {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Salary: $" + salary;
    }

}

class TesterObject{     // should be used for ease of sharing codes on slack, preferred way is to create separate classes for each file

    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester(), new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Aalia", 150000, "Female", 18);
        testers[1].setInfo("Naz", 150000, "Female", 18);
        testers[2].setInfo("Kalbinur", 150000, "Female", 18);
        testers[3].setInfo("Rakhat", 150000, "Female", 19);
        testers[4].setInfo("Edward", 110000, "Male", 30);

        for (Tester each : testers){
            System.out.println(each);
        }

    }

}
