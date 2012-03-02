//draws an Eel.
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;
import edu.ucsb.cs56.W12.pconrad.lab04.GeneralPathWrapper;
import edu.ucsb.cs56.W12.pconrad.lab04.Circle;

/**
 A vector drawing of a Fish 
 
 @author lkhuu, original vector drawing of the fish
 @author Nicholas Marks, edited as a subclass of fish in order to have different shaped fish
 @version for CS56, Winter 11, UCSB, MyFish
 
 */
public class Eel extends Fish
{
    /**
	 @param x x coord of center of head
	 @param y y coord of center of head 
	 @param radius radius of the head and used to scale the body 
     */
	public Eel( double x, double y, double width) {
		drawFish(x, y, width, width/5);
	}
	
    public void drawFish(double x, double y, double width, double height)
    {
	//Draw eel logic.
	}
}