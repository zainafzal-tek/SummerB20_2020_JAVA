package day07_Unary_ShortHand;

public class ShortHand {

    public static void main(String[] args) {

// *=: Multiplication Assignment
        int a = 100;
        a *= 100; // a = a * a
        System.out.println(a); // = 10000

// /=: Division Assignment
        int b = 100_000;
        b /= 2; // b = 100,000 / 2
        System.out.println(b); // = 50,000

// %=: Modulus Assignment
        int c = 100;
        c %= 12; // the remainder of 100/12 = 4, hence % will be 4
        System.out.println(c);

// +=: (VERY IMPORTANT) THIS IS THE ONLY OPERATOR WE CAN ASSIGN TO "String"

        int d = 300;
        d += 200; // d = 300 + 200
        System.out.println(d);

        String schoolName = "Cybertek";
        schoolName += " School"; // schoolName = Cybertek + School

        System.out.println(schoolName);

        String fullName = "Zain";
        fullName += " Afzal"; // fullName = Zain + Afzal
        System.out.println(fullName);

// -=: Subtraction Assignment

        int e = 200;
        e -= 50; // 200-50 = 150, e = 150
        System.out.println(e);


    }

}
