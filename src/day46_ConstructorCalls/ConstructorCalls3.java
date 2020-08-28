package day46_ConstructorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        System.out.println("X");
    }

    public ConstructorCalls3(int a){
        this();
        System.out.println("Y");
    }

    public ConstructorCalls3(double b){
        this(5);    // only one constructor can be called, in this case, only the default or the int constructor can be called
        System.out.println("Z");
    }

    public void method1(){

    }

}
