package day04_variables;

import com.sun.org.apache.xpath.internal.objects.XString;
import sun.util.resources.cldr.en.TimeZoneNames_en_IN;

/*
       task:
           create a class called PersonalInfo
               SSN
               Gender
               First Name
               Last Name
               Age
        */
public class PersonalInfo {

    public static void main(String[] args) {

        String firstName = "Zain";
        String lastName = "Afzal";
        byte age = 26;
        char gender = 'M';
        String SSN = "123-45-678";
        String country = "USA";
        boolean isEmployed = true;

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: "+ gender);
        System.out.println("SSN: " + SSN);
        System.out.println("Country: " + country);
        System.out.println("Employed: " + isEmployed);

    }

}
