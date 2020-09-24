package day57_Polymorphism.EmployeeTask;

public abstract class Employee {

    public String name, id, jobTitle;
    public double salary;
    public char gender;

    public Employee(String name, String id, String jobTitle, double salary, char gender){
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();

}
