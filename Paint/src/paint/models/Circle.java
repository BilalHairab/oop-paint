/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.models;

import java.awt.Color;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import paint.JSONContract;

/**
 *
 * @author m1
 */
public class Circle extends Shape {
    private int radius;
    private int x,y;

    public Circle() {
        
    }

    public Circle(int x, int y, int r) {
       // point = new Point(x, y);
       this.x=x;
       this.y=y;
       this.radius = r;
    }
    
     public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void setY1(int y) {
        this.y= y;
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

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public JSONObject getInfo() {
        JSONObject object =  new JSONObject();
        object.put(JSONContract.X, x);
        object.put(JSONContract.Y, y);
        object.put(JSONContract.RADIUS, radius);
        object.put(JSONContract.FONT, fontWidth);
        object.put(JSONContract.COLOR, color.getRGB());
        object.put(JSONContract.TYPE, Circle.class.getSimpleName());
        return object; 
    }
    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" center of the circle is (").append(x+","+y+")");
        return builder.toString(); 
    }
}
