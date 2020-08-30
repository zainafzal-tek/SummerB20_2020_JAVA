package day47_Encapsulation;

public class CapitalOneEmployees {

    String employeeName;
    int employeeAge;
    String jobTitle;
    private int ID;
    private double salary;
    private String address;

    static {
        String companyName;
        companyName = "Capital One";
    }

    public CapitalOneEmployees(String employeeName, int employeeAge, String jobTitle){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTitle = jobTitle;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

}
