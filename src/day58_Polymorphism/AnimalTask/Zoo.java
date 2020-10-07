package day58_Polymorphism.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston", 4, 'M');
        dog1.sleep();
        dog1.eat();
        dog1.bark();

        System.out.println("==============================================");

        Animal dog2 = new Dog("Grizzly", 4, 'M');
        dog2.sleep();
        dog2.eat();

        System.out.println(dog2);

    }

}
