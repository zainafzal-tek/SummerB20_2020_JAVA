package day21_loops;

public class DoWhile {

    public static void main(String[] args) {

        boolean result = false;

        while (result){ // will not be ewxecuted even once cause conditon is false
            System.out.println("Hello world");
        }

        System.out.println("================================");

        do { // will still be executed once even if while condition is false
            System.out.println("Hello World");
        }while (result);

    }

}
