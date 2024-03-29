package edu.ucsb.cs56.W12.pconrad.lab04;
import javax.swing.JFrame;

/** A viewer class to see a picture I drew with 
 *  just three simple Java graphics objects, namely
 *  Rectangle, Line2D.Double, Ellipse2D.Double
 *  
 * @author P. Conrad 
 * @version for UCSB CS56, W11, 02/09/2011
 */

public class PictureViewer02
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      // Set the size to whatever size you like (width, height)
      // For projects you turn in, lets not get any bigger than 640,480
      
      frame.setSize(640,480); // @@@ MODIFY THIS LINE IF YOU LIKE
      
      // Set your own title
      frame.setTitle("Phill's lab08 Drawing"); // @@@ MODIFY THIS LINE
      
      // Always do this so that the red X (or red circle) works
      // to close the window. 
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Instantiate your drawing as a "component"
      
      PictureComponent02 component = new PictureComponent02();
      
      // Always add your component to the frame 
      // and then make the window visible
      
      frame.add(component);
      frame.setVisible(true);
   }
}