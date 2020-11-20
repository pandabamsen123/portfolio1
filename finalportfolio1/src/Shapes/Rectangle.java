package Shapes;

import java.awt.*;

public class Rectangle extends behaviour{

    int sidelengthx;
    int sidelengthy;
    Point punkt1;
    Point punkt2;
    Point punkt3;
    Point punkt4;


    @Override
    public void shape() { }

    @Override
    public Point findCenter() {
        return this.center;
    }


    @Override
    public boolean isInShape(int x, int y) {
        return false;
    }


    @Override
    public double getDistance(int x, int y) {
        distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));
        return distance;
    }


    public int getAreal() {
        this.areal = this.sidelengthx * this.sidelengthy;
        return this.areal;
    }

    @Override
    double getArea() {
        return 0;
    }


    public double getCircumference(){
        this.circumference = this.sidelengthx + this.sidelengthy;
        return this.circumference;
    }

    public Rectangle(int sidelengthx, int sidelengthy, int xStart, int yStart){
        this.sidelengthx = sidelengthx;
        this.sidelengthy = sidelengthy;

        this.punkt1 = new Point(xStart, yStart);
        this.punkt2 = new Point((xStart + sidelengthx), yStart);
        this.punkt3 = new Point(xStart,(yStart + sidelengthy));
        this.punkt4 = new Point((xStart + sidelengthx),(yStart + sidelengthy));
        this.center = new Point(this.punkt1.x + (sidelengthx/2), this.punkt1.y + (sidelengthy/2) );
    }

}
