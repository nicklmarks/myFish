//draws SpongeBob
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
 A vector drawing of SpongeBob 
 
 @author Nicholas Marks
 @version for CS56, Winter 11, UCSB, MyFish
 
 */
public class SpongeBob extends Fish
{
    /**
	 @param x x coord of center of head
	 @param y y coord of center of head 
	 @param radius radius of the head and used to scale the body 
     */
	public SpongeBob( double x, double y, double width) {
		drawFish(x, y, width, width * 3.0);
	}
	
    public void drawFish(double x, double y, double width, double height)
    {
		double armHeight = y + (4.0/5.0) * width;
		double rightArmLength = x + (3.0/2.0) * width;
		
		
		Rectangle body		= new Rectangle( (int)x,(int) y			 ,(int) width,(int) (height / 3.0) );
		Rectangle lowerBody = new Rectangle( (int)x,(int) (y + width),(int) width,(int) (width  / 2.0) );
		Line2D.Double leftArm = new Line2D.Double(x - width/2.0, armHeight, x, armHeight);
		Line2D.Double rightArm = new Line2D.Double(x + width, armHeight, rightArmLength, armHeight);
		
		
		GeneralPath SB = this.get();
		
		SB.append(lowerBody, false);
		SB.append(body, false);
		SB.append(leftArm, false);
		SB.append(rightArm, false);
		//SB.append(leftLeg, false);
		//SB.append(rightLeg, false);
    }
	
}