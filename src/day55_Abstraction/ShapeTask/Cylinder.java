package day55_Abstraction.ShapeTask;
/*
4. create a sub class of shape called Cylinder
            attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
            override the abstrat methods
            add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume

 */
public final class Cylinder extends Shape {

    public double radius;
    public double height;

    static {
        name = "Cylinder";
        hasVolume = true;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return (2 * Math.PI * radius *  height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * height) + (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius, 2) * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
