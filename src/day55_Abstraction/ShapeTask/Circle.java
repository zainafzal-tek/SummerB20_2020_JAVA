package day55_Abstraction.ShapeTask;

public final class Circle extends Shape {

    public double radius;

    public Circle(double radius){
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    static {
        name = "Circle";
        hasVolume = false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }

}
