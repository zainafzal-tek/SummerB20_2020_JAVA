package day11_NestedIf_Switch;

public class Ternary {

    public static void main(String[] args) {

        int num = 100;

        String result = (num % 2 == 100) ? "Even" : "Odd"; //?: in ternary ? is the equivelant of if and : is equal to else.
        System.out.println(result); // the above statement is read as, if the number is even, "Even" will be printed, : (else) "Odd" wil be printed

        System.out.println("=======================================");

        int num1 = 1000;
        int num2 = 20;
        int max = 0;

        if (num1 > num2) {
            max = num1;
        }else {
            max = num2;
        }
        System.out.println(max);

        int max2 = (num1 > num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("=======================================");

        int age = 12;
        boolean eligibleToVote = age >= 18;

        String eligibleVote = (eligibleToVote) ? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println(eligibleVote);

        System.out.println("========================================");

        boolean eligibleToDrink = age >= 21;
        String eligibleDrink = (eligibleToDrink) ? "Eligible To Drink" : "Not Eligible to drink";


    }

}
