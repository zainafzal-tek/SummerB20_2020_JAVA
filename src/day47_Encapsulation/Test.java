package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

        Encapsulation obj1 = new Encapsulation();
        obj1.setSsn(1234567);
        System.out.println(obj1.getSsn());

    }

}
