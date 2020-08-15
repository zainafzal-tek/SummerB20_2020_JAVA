package day12_Switch_Scanner;
/*
 write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED
 */
public class AgeGroups {

    public static void main(String[] args) {

        int age = 20;

        boolean validAge = (age >= 0 && age <= 150);
        boolean teen = (age < 21);
        boolean adult = (age >= 21 && age <= 55);
        boolean senior = (age > 55);
        String ageGroup = "";

        if (validAge){
            if (teen) {
                ageGroup = "Teen";
            }else if (adult){
                ageGroup = "Adult";
            }else {
                ageGroup = "Senior";
            }
        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);

        String result = (validAge) ? (teen) ? "teen" : (adult) ? "adult" : "senior" : "invalid";

        System.out.println(result);
    }

}
