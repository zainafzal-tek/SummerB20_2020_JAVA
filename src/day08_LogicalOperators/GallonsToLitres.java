package day08_LogicalOperators;
/*
1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

 */
public class GallonsToLitres {


    public static void main(String[] args) {

        double gallon = 1;
        double litre = 3.785 * gallon;

        System.out.println("1 gallon is = " + litre + " Litres");


    }
}