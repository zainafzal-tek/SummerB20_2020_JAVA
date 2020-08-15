package day08_LogicalOperators;

public class Triangle {

    public static void main(String[] args) {

        double angle1 = 60;
        double angle2 = 120;
        double angle3 = 20;

        double sumOfAngle = angle1 + angle2 + angle3;
        boolean validTriangle = sumOfAngle == 180;
        boolean invalidTriangle = !validTriangle;


        if (validTriangle){
            System.out.println("This is a valid Triangle");
        }
        if (invalidTriangle){
            System.out.println("This is an invalid Triangle");
        }



    }

}
