package day11_NestedIf_Switch;
/*
write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
 */
public class DaysInMonth2 {

    public static void main(String[] args) {

        int month = 12;
        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        String r = "";

        if (validNumber){
            if (days28){
                r = "28 Days";
            }else if (days30){
                r = "30 Days";
            }else {
                r = "31 Days";
            }
        }else {
            r = "Invalid";
        }
        System.out.println(r);

        double version = 1.3;
        String result = "";

        if(version < 1.4){
            result = "Cupcake";
        }else{
            result = "Sorry, I don't know this version!";
        }
        System.out.println(result);

    }

}
