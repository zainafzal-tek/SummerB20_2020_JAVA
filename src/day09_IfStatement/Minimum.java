package day09_IfStatement;
/*
  2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)

 */
public class Minimum {

    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;

        boolean aIsMin = a < b && a < c;
        boolean bIsMin = aIsMin == false && b < c;
        boolean cIsMin = bIsMin == false && aIsMin == false;

        double min = 0;

        if (aIsMin){
            min = a;
        }

        if (bIsMin){
            min = b;
        }

        if (cIsMin){
            min = c;
        }
        System.out.println(min + " is the minimum number");

    }

}
