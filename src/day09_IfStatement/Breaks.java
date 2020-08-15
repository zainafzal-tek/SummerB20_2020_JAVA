package day09_IfStatement;

public class Breaks {

    public static void main(String[] args) {

        String itsBreakTime = "Yes";

        if (itsBreakTime == "Yes"){
            System.out.println("Take 15 mints break");
        }else {
            System.out.println("Continue the class");
        }

        int a = 100;
        int b = 200;

        if (a > b){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b + " is greater");
        }

    }

}
