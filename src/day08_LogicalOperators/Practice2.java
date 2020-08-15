package day08_LogicalOperators;

public class Practice2 {

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





    }

}
