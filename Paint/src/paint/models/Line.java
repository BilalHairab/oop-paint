/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.models;

import org.json.simple.JSONObject;
import paint.JSONContract;

/**
 *
 * @author Bilal-Laptop
 */
public class Line extends Shape{
    
    private int x1, x2, y1, y2;

    public Line() {
    }

    public Line(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public int getArea() {
        return 0;
    }
public String getType(){
        return "Line";
    }
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Starts from (").append(x1+","+y1+")").append(" - ").append("ends at (").append(x2+","+y2+")");
        return builder.toString(); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public JSONObject getInfo() {
        JSONObject object = new JSONObject();
        object.put(JSONContract.X, x1);
        object.put(JSONContract.Y, y1);
        object.put(JSONContract.X_END, x2);
        object.put(JSONContract.Y_END, y2);
        object.put(JSONContract.FONT, fontWidth);
        object.put(JSONContract.COLOR, color.getRGB());
        object.put(JSONContract.TYPE, Line.class.getSimpleName());
        return object;
    }

   


    
    
}
