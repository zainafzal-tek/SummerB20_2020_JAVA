package day46_ConstructorCalls;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("A"); // A

    }

    public ConstructorCalls2(int a){
        //ConstructorCalls2();
        this(); // calling default constructor
        System.out.println("B"); // AB
    }

    public ConstructorCalls2(String str){
        this(4);
        System.out.println("C");        // ABC
    }

    public ConstructorCalls2(char a){
        this();
        System.out.println("D");    // AD
    }

    public static void main(String[] args) {

        new ConstructorCalls2("Hi");

    }

}
