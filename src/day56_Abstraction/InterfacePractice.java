package day56_Abstraction;

public abstract class InterfacePractice {


    int a = 10; //by default public static final

    public static final int b = 300;

    static void method1(){ // static method
        //System.out.println(a); // static only accepts statics
        System.out.println(b);

        //  a = 100;
        //  b = 30;
    } // static method

    static void main(String[] args) { }  // static method

    //public default void method2(){ } // default method

    //  public void method3(){ }  instance method

    //   public InterfacePractice(){ }  // constructor


    public abstract void method4(); // abstract method
    abstract void method5(); // abstract method

    // static{ } // static block


    //  { }  // instance block

    // instance variables



}
