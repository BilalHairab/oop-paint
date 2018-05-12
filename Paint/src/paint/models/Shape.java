/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.models;

import java.awt.Color;
import org.json.simple.JSONObject;

/**
 *
 * @author Bilal-Laptop
 */
public abstract class Shape {
    protected Color color;
    protected int fontWidth;
    
    public Shape(){
        
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getFontWidth() {
        return fontWidth;
    }

    public void setFontWidth(int fontWidth) {
        this.fontWidth = fontWidth;
    }
    
    public JSONObject getInfo(){
        return new JSONObject();
    }
}
