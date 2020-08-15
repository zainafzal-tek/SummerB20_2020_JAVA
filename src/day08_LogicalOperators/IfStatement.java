package day08_LogicalOperators;

public class IfStatement {

    public static void main(String[] args) {


        String firstName = "Zain";
        String lastName = "Afzal";
        String fullName = firstName + " " + lastName;

        int age = 19;
        String citizenship1 = "USA";
        String citizenship2 = "France";

        boolean eligibleAge = age >= 18;
        boolean usCitizenship = citizenship1 == "USA" || citizenship2 == "USA";

        boolean eligibleToVote = eligibleAge  && usCitizenship;

        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);

        if (eligibleToVote == true) {
            System.out.println("You are eligible to vote.");
        }

        if (eligibleToVote == false) {
            System.out.println("You are not eligible to vote.");
        }
//--------------------------------------------------------------------


        int a = 10;
        int b = 20;

        if (a > b){
            System.out.println(a + " is the larger number");
        }

        if (b > a){
            System.out.println(b + " is the larger number");
        }

        if (a == b){
            System.out.println("Both are equal");
        }

//-------------------------------------------------------------------

        boolean breakTime = true;

        if (breakTime == true){
            System.out.println("Take 15 minutes break");
        }

        if(breakTime == false){
            System.out.println("Keep Studying");
        }

//--------------------------------------------------------------------


    }

}
