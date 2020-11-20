package Shapes;

import java.awt.*;

public abstract class behaviour {

    int areal;
    double area;
    double circumference;
    double distance;
    public Point center;

    public abstract void shape();
    abstract Point findCenter();
    abstract boolean isInShape(int x, int y);
    abstract double getDistance(int x, int y);
    abstract int getAreal();
    abstract double getArea();
    abstract double getCircumference();
}
