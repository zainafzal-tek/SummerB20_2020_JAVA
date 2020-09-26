package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;
import day57_Polymorphism.PhoneTasks.iPhone;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new iPhone("11", "6", 1000);
        iPhone iphone1 = (iPhone) phone1;

        //phone 1 facetiming after downcasting to iphone
        iphone1.faceTiming(1234);

        //second way
        ((iPhone)phone1).faceTiming(1234556);

        System.out.println("========================================");
        Phone phone2 = new Samsung("S20", "7", 1000);

        ((Samsung)phone2).googleDuo(12345678);

    }

}
