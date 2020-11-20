package test;

import Shapes.Rectangle;
import Shapes.Triangle;
import Shapes.Circle;

public class testing {
    public static void main(String[] args) {

        Triangle tri = new Triangle(2,4,6,8,10,12);
        Rectangle rec = new Rectangle(4, 8, 4, 4);
        Circle circ = new Circle(2, 5, 2);

        System.out.println("TRIANGLE");
        System.out.println("The area of the triangle is: " + tri.getAreal());
        System.out.println("The circumference of the triangle is: " + tri.getCircumference());
        System.out.println("The center of the triangle is: " + tri.findCenter());
        System.out.println("Is the triangle in shape? " + tri.isInShape(1, 1));
        System.out.println("The distance from triangle to rectangle: " + tri.getDistance(rec.center.x, rec.center.y));
        System.out.println("The distance from triangle to circle: " + tri.getDistance(circ.center.x, circ.center.y));


        System.out.println("------------------------------------------------------");


        System.out.println("CIRCLE");
        System.out.println("The area of the circle is: " + circ.getArea());
        System.out.println("The circumference of the circle is: " + circ.getCircumference());
        System.out.println("The center of the circle is: " + circ.findCenter());
        System.out.println("Is the circle in shape? " + circ.isInShape(10000, 10000));
        System.out.println("is the circle in shape now? " + circ.isInShape(circ.center.x, circ.center.y));


        System.out.println("------------------------------------------------------");

        System.out.println("RECTANGLE");
        System.out.println("The area of the Rectangle is: " + rec.getAreal());
        System.out.println("The circumference of the Rectangle is: " + rec.getCircumference());
        System.out.println("The center of the Rectangle is: " + rec.findCenter());
        System.out.println("Is the Rectangle in shape? " + rec.isInShape(123231,4949494));
        System.out.println("Distance from rectangle to triangle: " + rec.getDistance(tri.center.x, tri.center.y));

    }
}
