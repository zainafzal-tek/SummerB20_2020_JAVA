package day29_CustomMethods;

public class Eligibility {

    public static void main(String[] args) {

        vote("John", 21, true, "Bden");

        vote("Daniel", 17, true, "biden");

        eligibilityToBuyAlcohol(true, 19);

        calculator(10, '*', 20);

    }

    public static void vote(String name , int age, boolean citizen , String presidentName){
        boolean eligibleToVote = age >= 18 && citizen == true;
        if (eligibleToVote){
            System.out.println(name + " is eligible to vote for " + presidentName);
        } else {
            System.out.println(name + " is not eligible to vote");
        }
    }

    public static void eligibilityToBuyAlcohol(boolean hasID, int age){
        if (hasID && age >= 21){
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }
    }

    public static void calculator(double num1 , char operator, double num2){

        switch (operator){

            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            case '%':
                System.out.println("Remainder: " + (num1 % num2));
                break;

            default:
                System.out.println("invalid operator");

        }

    }

}
