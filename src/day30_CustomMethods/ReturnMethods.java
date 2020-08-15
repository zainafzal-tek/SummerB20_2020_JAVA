package day30_CustomMethods;

public class ReturnMethods {

    public static void main(String[] args) {

        int sum = addition2(10,20);
        System.out.println(sum * 2);

    }

    public static void addition1(int a, int b){  // void doesnt allow of return any value from method

        int sum = a + b;
        System.out.println(sum);

    }

    public static int addition2(int a , int b){

        int sum = a + b;
        return sum;

    }

}
