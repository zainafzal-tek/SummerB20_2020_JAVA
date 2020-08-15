package day09_IfStatement;

public class Even_Odd {

    public static void main(String[] args) {

        int b = 3;
        boolean even = b%2 == 0;

        if (even == true){
            System.out.println(b + " is an even number");
        }else {
            System.out.println(b + " is an odd number");
        }

    }

}
