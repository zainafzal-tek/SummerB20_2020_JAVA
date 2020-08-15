package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {
        String firstName = "Zain";
        String lastName = "Afzal";
        String fullName = firstName + " " + lastName;

        int age = 19;
        String citizenship = "USA";

        boolean eligibleToVote = age >= 18 && citizenship == "USA";
        //                       true       &&      true
        //                  true because both conditions returned are true

        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);

        if ( eligibleToVote == true) {
            System.out.println("You are eligible to vote.");
        }

        if (eligibleToVote == false){
            System.out.println("You are not eligible to vote.");
        }
    }

}
