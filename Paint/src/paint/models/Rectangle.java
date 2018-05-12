/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.models;

/**
 *
 * @author m1
 */
public class Rectangle extends Shape {
    
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getCircumference() {
        return 2*width+2*height;
    }
    
}
