package day33_LocalDateTime;

public class Calculate {

    public static void main(String[] args) {
        //addition int
        System.out.println(addition(4 , 6));

        //addition decimal
        System.out.println(addition(1.4, 6.5));

        //multiplication int
        System.out.println(multiplication(2, 4));

        //multiplication decimal
        System.out.println(multiplication(2.5, 3.7));

    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static double addition(double a, double b){
        return a + b;
    }

    public static int multiplication(int a , int b){
        return a * b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }



}
