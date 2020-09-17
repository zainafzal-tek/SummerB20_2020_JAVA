package day55_Abstraction.ShapeTask;

public final class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0){
            throw new ArithmeticException("Length and width cannot be zero or negative!");
        }

        this.length = length;
        this.width = width;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        hasVolume = false;
        name = "Rectangle";
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
