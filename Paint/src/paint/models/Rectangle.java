/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.models;
//import java.awt.Point;
/**
 *
 * @author m1
 */
public class Rectangle extends Shape {
    //private Point point;
    private int x,y;
    private int wid;
    private int heig;
    public Rectangle(){
        
    }
    public Rectangle(int x,int y,int width, int height) {
        //point = new Point(x,y);
        this.x=x;
        this.y=y;
        this.wid = width;
        this.heig = height;
    }
    /*public Point getpoint(){
        return point;
    }*/
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
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
        this.heig= height;
    }

    public int getArea() {
        return wid * heig;
    }

    public int getCircumference() {
        return 2*wid+2*heig;
    }
 
    
    
    
    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("upper left center (").append(x+","+y+")");
        return builder.toString(); 
    }
}
