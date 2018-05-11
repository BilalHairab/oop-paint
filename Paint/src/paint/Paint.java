/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author Bilal-Laptop
 */
public class Paint extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        JPanel main = new MainPanel();
//              main.setLocation(100,100);
//      main.setSize(600,480);
//
//        main.setVisible(true);
              JFrame window = new JFrame("Paint");
//      SimplePaintPanel content = new SimplePaintPanel();
      MainPanel content = new MainPanel();
      window.setContentPane(content);
      window.setSize(1150,600);
      window.setLocation(100,100);
      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.setVisible(true);

    }
    
   /**
    * The init method of the applet simply creates a SimplePaintPanel and
    * uses it as the content pane of the applet.  All the work is done
    * by the SimplePaintPanel.
    */
    @Override
   public void init() {
      setContentPane( new MainPanel() );
   }
   
   
   /**
    * A simple paint panel contains a large white drawing surface where
    * the user can draw curves and a color palette that the user can click
    * to select the color to be used for drawing.  When this class is used
    * as an applet, the content pane of the applet is a SimplePaintPanel.
    * When this class is run as a standalone application, the content pane
    * is a SimplePaintPanel.  All the real work is done in the
    * SimplePaintPanel class.
    */

} // end class SimplePaint
