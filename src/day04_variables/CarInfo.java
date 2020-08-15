package day04_variables;

import com.sun.org.apache.xpath.internal.objects.XString;

/*
       Task:
           create a class called CarInfo:
               Year
               Brand
               Model
               Mileage
               Price

               print info of car
               ex:
                   2020
                   BMW
                   X5
                   30000
                   45000

                2020 BMW X5, 30000 miles, $45000
        */
public class CarInfo {

    public static void main(String[] args) {

        int year = 2020;
        String brand = "BMW";
        String model = "X5";
        int mileage = 30000;
        double price = 45000.5;
        String color = "Red";

        System.out.println(year + " " + brand + " " + model + ", " + color + ", " + mileage + " miles, $" + price );



    }

}
