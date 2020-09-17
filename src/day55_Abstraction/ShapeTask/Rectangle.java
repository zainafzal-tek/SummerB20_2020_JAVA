package day55_Abstraction.ShapeTask;

public final class Rectangle extends Shape {

    public double length;
    public double width;

    static {
        name = "Rectangle";
        hasVolume = false;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
