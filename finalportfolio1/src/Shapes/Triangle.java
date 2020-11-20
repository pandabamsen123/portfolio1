package Shapes;

import java.awt.*;

public class Triangle extends behaviour {


    Point point1;
    Point point2;
    Point point3;
    int GL;
    int Height;

    @Override
    public void shape() {}


    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
        this.GL = x2 - x1;
        this.Height = y3 - y1;
        this.center = new Point((this.point1.x+this.point2.x+this.point3.x)/3, (this.point1.y+this.point2.y+this.point3.y)/3);

    }

    public int getAreal(){
        this.areal = this.GL * this.Height /2;
        return  this.areal;
    }

    @Override
    double getArea() {
        return 0;
    }

    public double getCircumference(){
        double distance12 = Math.sqrt((this.point1.x - this.point2.x) * (this.point1.x - this.point2.x) + (this.point1.y - this.point2.y) * (this.point1.y - this.point2.y));
        double distance23 = Math.sqrt((this.point2.x - this.point3.x) * (this.point2.x - this.point3.x) + (this.point2.y - this.point3.y) * (this.point2.y - this.point3.y));
        double distance31 = Math.sqrt((this.point3.x - this.point1.x) * (this.point3.x - this.point1.x) + (this.point3.y - this.point1.y) * (this.point3.y - this.point1.y));
        this.circumference = distance12 + distance23 + distance31;
        return this.circumference;
    }



    @Override
    public Point findCenter() {
        return center;
    }

    @Override
    public boolean isInShape(int x, int y) {
        int ay = x - point1.x;
        int ax = y - point1.y;

        boolean a = (point2.x - point1.x)* ay - (point2.y - point1.y) * ax > 0;

        if ((point3.x - point1.x) * ay - (point3.y - point1.y) * ax > 0 == a){
            return false;
        }
        if ((point3.x - point2.x) * (y - point2.y) - (point3.y - point2.y) * (x - point2.x) > 0 != a){
            return false;
        }

        return true;
    }

    @Override
    public double getDistance(int x, int y) {
        distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));
        return distance;
    }


}
