package edu.ucsb.cs56.W12.pconrad.lab04;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JComponent;



// the four tools things we'll use to draw

import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves


import java.awt.geom.Rectangle2D; // for rectangles drawing with Doubles

import java.awt.Color; // class for Colors
import java.awt.Shape; // Shape interface
import java.awt.Stroke; // Stroke interface
import java.awt.BasicStroke; // class that implements stroke

/**
   A component that draws a Picture by Phill Conrad
   
   @author Phill Conrad (original drawing)
   @version for CS56, W11, UCSB, 04/29/2009
   
*/


public class PictureComponent02 extends JComponent
{  

    /** The paintComponent method is always required if you want
     * any graphics to appear in your JComponent.    
     * 
     * There is a paintComponent
     * method that is created for you in the JComponent class, but it
     * doesn't do what we want, so we have to "override" that method with
     * our own method.  
     */
    
   public void paintComponent(Graphics g)
   {  

       Graphics2D g2 = (Graphics2D) g;

       // Call a static method for drawing picture 2

       AllMyDrawings.drawPicture2(g2);

   }
        
  
}
