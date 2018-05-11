/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Bilal-Laptop
 */
public class GraphicsInstance {
    private static Graphics2D graphics2D;
    
    public static Graphics2D getInstance(JPanel panel){
        if(graphics2D == null){
            return (Graphics2D) panel.getGraphics();
        }else{
            return graphics2D;
        }
    }
}
