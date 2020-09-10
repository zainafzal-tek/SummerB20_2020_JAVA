package day52_Exceptions;

public class ThrowsKeyword {

    public static void method1() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void method2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){

        }

    }

    public static void method3() throws InterruptedException{
        method1();
    }

}
