package day08_LogicalOperators;
/*
2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

 */
public class LitresToGallons {

    public static void main(String[] args) {

        double litre = 200;
        double gallon = litre/3.785;

        System.out.println("1 litre = " + (int)gallon + " gallons");



    }

}
