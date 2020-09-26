package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.iPhone;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new iPhone("11", "6", 1000);
        iPhone iphone1 = (iPhone) phone1;
        iphone1.faceTiming(1234);


    }

}
