package day59_OOPReview;

interface X{
    public abstract void method1();
    void method2();

    int a = 100;    // every variable created in interface is final
    static int b = 20;  // since every variable is final, they must be initiated immediately

}

abstract class Y{
    int a = 100;
    static int b = 200;
    public abstract void method1();

}

public  class Abstraction extends Y implements X {

    public static void main(String[] args) {


    }

    @Override
    public void method2() {

    }

    @Override
    public void method1() {

    }
}
