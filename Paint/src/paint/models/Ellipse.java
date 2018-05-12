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
 * @author m1
 */
public class Ellipse extends Shape {

    private int x, y;
    private int wid;
    private int heig;

    public Ellipse() {

    }

    public Ellipse(int x, int y, int width, int height) {
        //point = new Point(x,y);
        this.x = x;
        this.y = y;
        this.wid = width;
        this.heig = height;
    }

    /*public Point getpoint(){
        return point;
    }*/
    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

    public int getwidth() {
        return wid;
    }

    public void setwidth(int width) {
        this.wid = width;
    }

    public int getheight() {
        return heig;
    }

    public void setheight(int height) {
        this.heig = height;
    }

    @Override
    public JSONObject getInfo() {
        JSONObject object = new JSONObject();
        object.put(JSONContract.X, x);
        object.put(JSONContract.Y, y);
        object.put(JSONContract.WIDTH, wid);
        object.put(JSONContract.HEIGHT, heig);
        object.put(JSONContract.FONT, fontWidth);
        object.put(JSONContract.COLOR, color.getRGB());
        object.put(JSONContract.TYPE, Ellipse.class.getSimpleName());
        return object;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("width is ").append(wid).append(" and height is ").append(heig);
        return builder.toString();

    }
}
