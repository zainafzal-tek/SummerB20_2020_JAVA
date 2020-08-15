package day12_Switch_Scanner;

public class Switch_Practice3 {

    public static void main(String[] args) {

        String productName = "iPhone";

        switch (productName){

            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iPod":        // if either of these match the code will be executed to the break
            case "iPhone":      // This is how to use OR logic in Switch statement
            case "Macbook":     // this statement will execute the code if nay oof the both matches the switch statement
                System.out.println("Apple");
                break;


        }

        System.out.println("============================================");

    }

}
