package day09_IfStatement;
/*
  1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */
public class Maximum {

    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;

        boolean aMax = a > b && a > c;
        boolean bMax = b > a && b > c;
        boolean cMax = c > a && c > b;

        double max = 0;

        if (aMax){
            max = a;
        }

        if (bMax){
            max = b;
        }

        if (cMax){
            max = c;
        }
        System.out.println(max + " is maximum number");

    }

}
