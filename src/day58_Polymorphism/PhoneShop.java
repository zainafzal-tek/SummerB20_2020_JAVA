package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.Huawei;
import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;
import day57_Polymorphism.PhoneTasks.iPhone;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {

    public static void main(String[] args) {

        Phone[] phone = {
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new iPhone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Huawei("P30 pro", "5.5", 150)
        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));
        //System.out.println(phoneShop);

        int countIphone = 0;
        int countSamSung = 0;
        int countHuawei = 0;

        /*for (int i = 0; i <= phoneShop.size() - 1; i++){
            if (phoneShop.get(i) instanceof iPhone){
                countIphone++;
            } else if (phoneShop.get(i) instanceof Samsung){
                countSamSung++;
            } else {
                countHuawei++;
            }
        }*/

        for (Phone eachPhone : phoneShop){
            if (eachPhone instanceof iPhone){
                countIphone++;
            } else if (eachPhone instanceof Samsung){
                countSamSung++;
            } else {
                countHuawei++;
            }
        }

        System.out.println(countIphone);
        System.out.println(countSamSung);
        System.out.println(countHuawei);

    }

}
