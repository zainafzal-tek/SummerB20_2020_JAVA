package day09_IfStatement;
/*
3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)

 */
public class MediumNumber {

    public static void main(String[] args) {

        double a = 3;
        double b = 5;
        double c = 9;

        boolean aIsMed = a > b && a < c || a > c && a < b;
        boolean bIsMed = b > c && b < a || b < c && b > a;
        boolean cIsMed = aIsMed == false && bIsMed == false;


        double med = 0;

        if (aIsMed){
            med = a;
        }

        if (bIsMed){
            med = b;
        }

        if (cIsMed){
            med = c;
        }

        System.out.println(med);

    }

}
