package edu.ucsb.cs56.W12.nlmarks.lab04;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import edu.ucsb.cs56.W12.pconrad.lab04.GeneralPathWrapper;
import edu.ucsb.cs56.W12.pconrad.lab04.Circle;

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;


/**
   A vector drawing of a Stick Figure that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Nicholas Marks and Marco Sedano 
   @version for CS56, Winter 11, UCSB, Lab04
   
*/
public class StickFigure extends GeneralPathWrapper implements Shape
{
    /**
       @param x x coord of center of head
       @param y y coord of center of head 
       @param radius radius of the head and used to scale the body 
     */
    public StickFigure(double x, double y, double radius)
    {
    
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        
	Circle head = new Circle( x, y, radius);
	
	Line2D.Double body = new Line2D.Double(x, y+radius, x, y+4*radius);
	Line2D.Double arms = new Line2D.Double(x-radius, y+2*radius, x+radius, y+2*radius);
	Line2D.Double leftLeg = new Line2D.Double(x, y+4*radius, x-radius, y+5*radius);
	Line2D.Double rightLeg = new Line2D.Double(x, y+4*radius, x+radius, y+5*radius);

	GeneralPath stickFigure = this.get();

	stickFigure.append(head, false);
	stickFigure.append(body, false);
	stickFigure.append(arms, false);
	stickFigure.append(leftLeg, false);
	stickFigure.append(rightLeg, false);
    }

}
