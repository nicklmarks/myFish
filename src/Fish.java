//abstract class to represent a fish.

//package edu.ucsb.cs56.S12.nlmarks.issue0000383;

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
 An abstract class to represent all fish subclasses. Holds values and has methods that refer to variables: xCoord, yCoord, width, height.
 
 @author Nicholas Marks
 @version for CS56, Winter 12, UCSB
 
 */
abstract public class Fish extends GeneralPathWrapper implements Shape
{
    /**
	 Constructor
	 
	 @param x x coord of the middle of the Fish
	 @param y y coord of the middle of the Fish
	 @param width of the Fish
	 @param height of the Fish
	 */
	
    double xPos;
    double yPos;
    double width;
    double height;
	
    /**
	 draws the specified fish
	 **/
    abstract void drawFish(double x, double y, double width, double height);
	
    /**
	 gets the xLocation of the fish
	 **/
    public double getXPos(){
		return xPos;
    }
	
    /**
	 gets the yLocation of the fish
	 **/
    public double getYPos(){
        return yPos;
    }
	
    /**
	 gets the Width of the fish
	 **/
    public double getWidth(){
        return width;
    }
	
    /**
	 gets the height of the fish
	 **/
    public double getHeight(){
        return height;
    }
}
