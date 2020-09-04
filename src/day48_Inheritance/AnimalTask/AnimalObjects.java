package day48_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog = new Dog("Winston", "Medium", 3, 'M', "Scottish Terrier", 50);

        System.out.println(dog.name);
        System.out.println(dog.size);

        dog.bark();
        dog.eat();
        dog.sleep();

        System.out.println(dog.age);
        System.out.println( dog.gender );

        System.out.println(dog);

        Cat cat = new Cat("Altunhan","small",1, 'F', "Angora", 25);

        System.out.println(cat);

    }

}
