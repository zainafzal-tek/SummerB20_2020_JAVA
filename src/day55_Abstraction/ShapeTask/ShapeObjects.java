package day55_Abstraction.ShapeTask;
/*
 create a class called shape objects:
            create objects of each shapes and calculate thier area, perimeter, and volume

 */
public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(2.4);
        double cirArea = circle.calculateArea();
        double cirPerimeter = circle.calculatePerimeter();
        double cirVolume = circle.calculateVolume();

        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3.2, 2.1);
        double recArea = rectangle.calculateArea();
        double recPerimeter = rectangle.calculatePerimeter();
        double recVolume = rectangle.calculateVolume();

        System.out.println(rectangle);

        Cylinder cylinder = new Cylinder(2.3, 1.5);
        double cylArea = cylinder.calculateArea();
        double cylPerimeter = cylinder.calculatePerimeter();
        double cylVolume = cylinder.calculateVolume();

        System.out.println(cylinder);

        System.out.println("====================================");

    }

}
