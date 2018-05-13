/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.util.Comparator;
import paint.models.Shape;

/**
 *
 * @author m1
 */
public class compareshapes implements Comparator <Shape> {
     @Override
     public int compare(Shape sh1,Shape sh2){
         
         return sh2.getArea()-sh1.getArea();
     }
    
    
}
