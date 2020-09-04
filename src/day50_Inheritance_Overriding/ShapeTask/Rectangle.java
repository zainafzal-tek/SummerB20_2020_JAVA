package day50_Inheritance_Overriding.ShapeTask;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }

}
