package Shapes;

import java.awt.Point;

public class Circle extends behaviour {
    double radius;


    @Override
    public void shape() { }


    @Override
    public Point findCenter() {
        return this.center;
    }

    @Override
    public boolean isInShape(int x, int y) {
        if (Circle.this.getDistance(x, y) < this.radius) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getDistance(int x, int y) {
        distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));

        return distance;
    }


    public Circle(int radius, int xPoint, int yPoint) {
        this.radius = radius;
        this.center = new Point(xPoint, yPoint);
    }


    @Override
    int getAreal() {
        return 0;
    }


    public double getCircumference() {
        this.circumference = (double)((int)(6.283185307179586D * this.radius));
        return this.circumference;
    }


    public double getArea() {
        this.area = (radius)*(radius)*Math.PI;
        return this.area;
    }


}