package day11_NestedIf_Switch;
/*
  1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

 */
public class NumberToWords {

    public static void main(String[] args) {

        int num = 1;

       String result = "";

       if (num == 0){
           result = "zero";
       }else if (num == 1){
           result = "One";
       }else if (num == 2){
           result = "Two";
       }else if (num == 3){
           result = "Three";
       }else if (num == 4){
           result = "Four";
       }else if (num == 5){
           result = "Five";
       }else if (num == 6){
           result = "Six";
       }else if (num == 7){
           result = "Seven";
       }else if (num == 8){
           result = "Eight";
       }else if (num == 9){
           result = "Nine";
       }else {
           result = "Invalid";
       }
        System.out.println(result);

        System.out.println("================================");

        int a = 10;
        int b = 20;

        String r = (a > b) ? "a is greater" : (b > a) ? "b is greater" : "a is equal to b";
        System.out.println(r);

    }

}

