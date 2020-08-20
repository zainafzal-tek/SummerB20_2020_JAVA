package day44_Constructor;

import java.lang.reflect.Constructor;

public class ConstructorIntro {

    public ConstructorIntro(String arr){    // if constructor is not created, compiler creates default constructor with empty parameter.
        System.out.println("Hello " + arr);
    }

    public static void main(String[] args) {

        //ConstructorIntro obj = new ConstructorIntro();

        ConstructorIntro obj3 = new ConstructorIntro("Muhtar"); // when constructor with parameter is created, any obj crreated must havce the same datatype as arguement.
        ConstructorIntro obj4 = new ConstructorIntro("Dawud");
        ConstructorIntro obj5 = new ConstructorIntro("Zeliha");

    }

}
