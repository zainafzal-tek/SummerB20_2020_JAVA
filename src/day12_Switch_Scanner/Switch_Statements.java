package day12_Switch_Scanner;

public class Switch_Statements {

    public static void main(String[] args) {

        int noOfDay = 1;
        String
                day = "";

        switch (noOfDay){   // order of cases does not matter.
            case 1:day = "Monday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 5:
                day = "Friday";
                break;

            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid Case";

        }
        System.out.println(day);

    }

}
