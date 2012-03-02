//draws a RockFish
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
 A vector drawing of a RockFish 
 
 @author Nicholas Marks, edited as a subclass of fish in order to have different shaped fish
 @version for CS56, Winter 11, UCSB, MyFish
 
 */
public class RockFish extends Fish
{
    /**
	 @param x x coord of center of head
	 @param y y coord of center of head 
	 @param radius radius of the head and used to scale the body 
     */
	public RockFish( double x, double y, double width) {
		drawFish(x, y, width, width/5);
	}
	
    public void drawFish(double x, double y, double width, double height)
    {
		//draw the tail off of the (x,y) coord
		double currentX = x;
		double currentY = y;
		double nextX = x + width/4.0;
		double nextY = y + width/4.0;

		Line2D.Double tail1 = new Line2D.Double(currentX, currentY, nextX, nextY);
		currentX = nextX;	currentY = nextY;  // change both coords
		nextY = y - width/4.0;
		Line2D.Double tail2 = new Line2D.Double(currentX, currentY, nextX, nextY);
		currentX = nextX;	currentY = nextY;  // change both coords
		nextX = x;			nextY = y;
		Line2D.Double tail3 = new Line2D.Double(currentX, currentY, nextX, nextY);
		
		//Draw the circle of the body at (x- width/2, y)
		double radius = width / 2.0;
		Circle body = new Circle( x - width / 2.0, y, radius);

		//append the fish together
		GeneralPath RF = this.get();
		
		RF.append(body, false);
		RF.append(tail1, false);
		RF.append(tail2, false);
		RF.append(tail3, false);
	}
}