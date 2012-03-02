//Code used from lkhuu's fish inspired this project, this particular fish is the one that he designed. This code has been changed so that it is a subclass of my own abstract fish class.

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
public class OriginalFish extends Fish
{
    /**
	 @param x x coord of center of head
	 @param y y coord of center of head 
	 @param radius radius of the head and used to scale the body 
     */
	public OriginalFish( double x, double y, double width) {
		drawFish(x, y, width, width/5);
	}
	
    public void drawFish(double x, double y, double width, double height)
    {
		this.xPos = x;
		this.yPos = y;
		this.width = width;
		this.height = height;
		GeneralPath wholeFish = this.get();
		double currentX = x-(width/2);
		double currentY = y;
		double nextX = 0;
		double nextY = 0;
		
		for(double j=0;j<100;j+=1.0){
			nextX = currentX + (((3.0/4.0)*width)/100.0);
			nextY = currentY + ((height/2.0)*(Math.sin(Math.PI*((j+1.0)/100.0))-Math.sin(Math.PI*((j-1.0)/100.0))));
			wholeFish.append(new Line2D.Double(currentX,currentY,nextX,nextY),false);
			currentX = nextX;
			currentY = nextY;
		}
		
		nextX = currentX + (1.0/4.0)*width;
		nextY = y + (height/2.0);
		wholeFish.append(new Line2D.Double(currentX,currentY,nextX,nextY),false);
		currentX = nextX;
		currentY = nextY;
		
		nextY = y - (height/2.0);
		wholeFish.append(new Line2D.Double(currentX,currentY,nextX,nextY),false);
		currentX = nextX;
		currentY = nextY;
		
		nextX = currentX - (1.0/4.0)*width;
		nextY = y;
		wholeFish.append(new Line2D.Double(currentX,currentY,nextX,nextY),false);
		currentX = nextX;
		currentY = nextY;
		
        for(double j=0;j<100;j+=1.0){
            nextX = currentX - (((3.0/4.0)*width)/100.0);
            nextY = currentY - ((height/2.0)*(Math.sin(Math.PI*((j+1.0)/100.0))-Math.sin(Math.PI*((j-1.0)/100.0))));
            wholeFish.append(new Line2D.Double(currentX,currentY,nextX,nextY),false);
            currentX = nextX;
            currentY = nextY;
        }		
	}
}
