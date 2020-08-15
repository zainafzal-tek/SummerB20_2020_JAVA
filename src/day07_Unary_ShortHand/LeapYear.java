package day07_Unary_ShortHand;

/*
 1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year

 */
public class LeapYear {

    public static void main(String[] args) {

        short year = 2020;
        boolean leapYear = year%4 == 0;

        System.out.println("Year " + year + " is a Leap Year: " + leapYear);

    }

}
