package day11_NestedIf_Switch;

public class NestedIf_Practice3 {

    public static void main(String[] args) {

        int day = 7;

        boolean validNumber = day >= 1 && day <= 7;
        String r = "";

        if (validNumber){
            if (day == 1){
                r = "Monday";
            }else if (day == 2){
                r = "Tuesday";
            }else if (day == 3){
                r = "Wednesday";
            }else if (day == 4){
                r = "Thursday";
            }else if (day == 5){
                r = "Friday";
            }else if (day == 6){
                r = "Saturday";
            }else {
                r = "Sunday";
            }
        }else {
            r = "Invalid";
        }
        System.out.println(r);

        System.out.println("=====================================");

        String result = (validNumber) ? (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday" : "Rest of Week" : "Invalid";

        System.out.println(result);
    }

}
