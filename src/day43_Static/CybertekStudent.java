package day43_Static;

class A{
    static int a = 200;
}

public class CybertekStudent {

    String studentName;
    int age;
    char gender;
    static String schoolName = "Cybertek School";

    public void getInfo(){
        System.out.println("Name is " + studentName);
    }

    public static void schoolName(){
        System.out.println("School is " + schoolName);
    }
}
