package day12_Switch_Scanner;
/*
write a program that can print out the name of the month based on the number
	ex
	out "Jan"
not use multibranch or ternary
 */
public class Switch_Practice2 {

    public static void main(String[] args) {

        int noOfMonth = 12;

        String nameOfMonth = "";

        switch (noOfMonth){
            case 1:
                nameOfMonth = "January";
                break;

            case 2:
                nameOfMonth = "February";
                break;

            case 3:
                nameOfMonth = "March";
                break;

            case 4:
                nameOfMonth = "April";
                break;

            case 5:
                nameOfMonth = "May";
                break;

            case 6:
                nameOfMonth = "June";
                break;

            case 7:
                nameOfMonth = "July";
                break;

            case 8:
                nameOfMonth = "August";
                break;

            case 9:
                nameOfMonth = "September";
                break;

            case 10:
                nameOfMonth = "October";
                break;

            case 11:
                nameOfMonth = "November";
                break;

            case 12:
                nameOfMonth = "December";
                break;

            default:
                nameOfMonth = "Invalid Case";

        }

        System.out.println(nameOfMonth);



    }

}
