package day03_sequences_Variables;

public class variablepractice {

    public static void main(String[] args) {
        //100 , 200

        byte num1 = 100;
        short num2 = 200;
        System.out.println(num1+num2);
        int sum = num1+num2;
        System.out.println(sum);

        long x = 100;
        float y = x;
        double z = x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


       // int p = 3.5; cannot compile due to int being smaller than double

        float f = 100; // specifying float with "f" is not required because this number is an int by default
        float f2 = 100.0f; //we need to specify float with "f" due to decimal values are by default a double.

        System.out.println(f);
        System.out.println(f2);


    }

}
