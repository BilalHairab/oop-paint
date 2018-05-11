/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.models;
import java.awt.Point;
/**
 *
 * @author m1
 */
public class Circle extends Shape {
    private int radius;
    private Point point;

    public Circle() {
        point = new Point(0, 0);
        radius = 1;
    }

    public Circle(int x, int y, int r) {
        point = new Point(x, y);
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
