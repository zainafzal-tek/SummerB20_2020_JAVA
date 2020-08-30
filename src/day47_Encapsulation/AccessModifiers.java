package day47_Encapsulation;

public class AccessModifiers {

public static int publicVariable = 9;

    public static void publicMethod(){
        System.out.println(publicVariable);
    }

    // default: is accessible within every class in the same package

    static int defaultVariable = 2000;

    static void defaultMethod(){
        System.out.println("default method");
    }

    //private: is not visible outside the original class it was declared in
    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("private method");
    }

}
