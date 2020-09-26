package day58_Polymorphism.AnimalTask;

public class Animal {

    public int age;
    public char gender;

    public Animal(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }

}
