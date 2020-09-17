package day55_Abstraction.ShapeTask;

public abstract class Shape {

    public  String name;
    public double area;
    public double perimeter;
    public  boolean hasVolume;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();

}
