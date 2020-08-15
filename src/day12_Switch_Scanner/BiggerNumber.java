package day12_Switch_Scanner;
/*
rite a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT

 */
public class BiggerNumber {

    public static void main(String[] args) {

        double n1 = 100;
        double n2 = 200;
        double n3 = 300;

        boolean n1Greater = n1 > n2 && n1 > n3;
        boolean n2Greater = n2 > n1 && n2 > n3;
        boolean n3Greater = !n1Greater && !n2Greater;

        String r = (n1Greater) ? "n1 is greater" : (n2Greater) ? "n2 is greater" : "n3 is greater";
        System.out.println(r);
    }

}
