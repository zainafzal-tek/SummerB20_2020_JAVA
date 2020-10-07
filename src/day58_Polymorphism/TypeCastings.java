package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;
import day57_Polymorphism.PhoneTasks.iPhone;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class TypeCastings {

    public static void main(String[] args) {

        Dog dog1 = new Dog("a", 2, 'F');
        Cat cat1 = new Cat("A", 2, 'F');

        Animal animal = dog1; // implicit type casting(done automatically)

        Animal animal2 = cat1; // (implicit) casting subclass to super class.

        System.out.println("================================================");

        Animal animal3 = new Dog("A", 2, 'F');

        Dog dog2 = (Dog) animal3;
        dog2.bark();

        System.out.println("==================================================");

        iPhone phone1 = new iPhone("12", "6", 1200);
        Phone phone2 = phone1;

        Phone phone3 = new Samsung("S20", "9", 1100);

        Samsung phone4 = (Samsung) phone3;


        //iPhone phone5 = (iPhone) phone3; no IS - A reation between iphone and samsung

    }

}
