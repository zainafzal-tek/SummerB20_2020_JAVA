package day09_IfStatement;

public class alcohol2 {

    public static void main(String[] args) {

        int age = 21;
        boolean hasID = true;

        if (age >= 21 && hasID){
            System.out.println("You can buy alcohol");
        }else {
            System.out.println("You cannot buy alcohol");
        }

    }

}
