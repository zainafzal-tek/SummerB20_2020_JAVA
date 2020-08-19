package day43_Static;

public class StaticBlock {

    static {    // this is a static block. sttic block gets executed first before even the main mathod
        System.out.println("Static block");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

    }

}
