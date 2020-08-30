package Library;

import day47_Encapsulation.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);

        AccessModifiers.publicMethod();

        //System.out.println(AccessModifiers.defaultVariable); cannot access since this is outide of the package

    }

}
