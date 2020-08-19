package day43_Static;

import day42_Static.Tester;

public class StaticBlock2 {

    static int a;
    static String b;
    static Tester tester1;

    //tester1.newTester();
    //tester1.setInfo(); causing compile error due to multiple steps for one variable

    static {    // main purpose of the block is to initialze variables that take more than one step
        a = 100;
        b = "Cybertek";

        tester1 = new Tester(); // initializing objext to variable
        tester1.setInfo("Muhtar", 'M', 123, "SDET", 100000); // setting variable info

    }

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);

    }

}
