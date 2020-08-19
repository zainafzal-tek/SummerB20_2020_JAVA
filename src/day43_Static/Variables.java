package day43_Static;

public class Variables {

    int d; // this is an instance variable
    static int s; // static class, can be used in other static classes

    public void method2(){
        System.out.println(d); // we can print b because instance variables do take default value if not initialized
        System.out.println(s); // instace methods accpet both static and non static variables
    }

    public static void main(String[] args) {

        //System.out.println(d); static methods only accept static variables

       Variables obj = new Variables(); // new object
        System.out.println(obj.d); // this is the only way we can call instance variables.


    }

    public static void method1(){
        int a;

        if (true){
            int b = 20;
        }
        //System.out.println(b); gives compile error because variable b is local to the if statement
        //System.out.println(a); gives compile error because, while a is a variable, it is not initialized

    }

}
