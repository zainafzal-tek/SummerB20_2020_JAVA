package day58_Polymorphism;

import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal1 = new Animal(10, 'F');
        Animal animal2 = new Dog("Winston", 4, 'M');
        Animal animal3 = new Cat("Kiko", 2, 'M');

        if (animal3 instanceof Animal){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
