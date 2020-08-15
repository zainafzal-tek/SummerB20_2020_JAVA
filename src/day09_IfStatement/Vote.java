package day09_IfStatement;

public class Vote {

    public static void main(String[] args) {

        int age = 17;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not Eligible to vote ");
        }

    }

}
