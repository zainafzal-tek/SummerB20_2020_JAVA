package day59_OOPReview;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;

public class PolyMorphism {

    public static void main(String[] args) {

        Shape shape1 = new Circle(3);

        System.out.println(((Circle)shape1).radius); //down casting to get access to shape instance

        Rectangle rectangle = new Rectangle(3, 5);
        Shape shape = (Shape)rectangle; //upcasting



    }

}
