package day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {

        int a = 10;

        switch (a){    // switch statement expression can be any datatype , CANNOT be Boolean

            case 5:     // to execute this case, value of case MUST match expression in the switch statement
                System.out.println("Five");
                break;  // Break is used to exit the switch, if break is not placed, the rest of the switch will be run until either the switch ends (by reaching the last curly brace ending the switch), or it reaches another break.

            case 1: // cases should have different values, if case vales matches, there will be compile error
                System.out.println("One");
                break;

            default:                                   // the function of default is to be executed when case values are not matching the switch statement value
                System.out.println("Invalid Case"); // default statement can be placed anywhere in the switch statement because compiler knows that default is only executed when cases are not matching wiht switch expression
                break;              // default is not mandatory // preferred way should be putting default after all cases

        }



    }

}
