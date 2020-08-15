package day05_ArithmeticOperators;

public class  ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(20+3-2+1);
                            //23-2+1
                            //21+1
                            //22

        System.out.println(20*3);
                            //60

        System.out.println(20+3-1*2); //multiplication will be done first because it has higher procedure
                            //20+3-2
                            //23-2
                            //21

        System.out.println(10/3); //since both are int, answer will be int
                            //3

        System.out.println(10.0/3); // will give answer as double, double/int = double
                            // 3.333
        System.out.println(10/3.0); // int/double= double
                            //3.33
        System.out.println(10.0/3.0); //double/double=double
                            //3.33

        System.out.println(10%4); //modulus will give remainder of the equation, =2 in this case
                            // 10/4 = 2
                            // 10-(4*2) = 2

        System.out.println(30 % 8); // = 6
                        // 30/ 8 = 3
                        // remainder: 30 - (8*3)
                        // 30-24 = 6

        System.out.println(99 % 4); // =24
                            // 99/4 = 24 wit remainder of 3
                            // remainder: 99 - (4*24)
                            // 99-96 = 3

        System.out.println(99*4/3%(5*3)); // when all high priority operators are joined together, they will be calculated from left to right order.
                            //99*4/3%15
                            //396/3%15
                            //132%15
                            //12
    }

}
