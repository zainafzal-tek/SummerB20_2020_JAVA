package day42_Static;

public class Circle {

    double radius;
    double diameter;
    static double pi = 3.14;

    public void setInfo(double radius){

        this.radius = radius;
        diameter = radius * 2;

    }

    public double calcArea(){
        return pi * radius * radius;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }

    public String toString(){
        return "Radius: " + radius + "\nDiameter: " + diameter + "\nPI: " + pi + "\nArea: " + calcArea() + "\nPerimeter: " + calcPerimeter();
    }

}
