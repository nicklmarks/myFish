//package edu.ucsb.cs56.W12.nlmarks.lab04;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;
/**
 * A class with a static method for drawing StickFigures
 * 
 * @author Nicholas Marks and Marco Sedano
 * @version for CS56 lab04, Winter 2012
 */


public class AllMyOwnDrawings
{
    /** Draw a picture with a few StickFigures
     */

    public static void drawPicture1(Graphics2D g2) {
		Fish f1 = new StickFigure(200,200,25);
		g2.setColor(Color.RED);
		g2.draw(f1);
		
		Fish f2 = new OriginalFish(300, 100, 50);
		g2.setColor(Color.BLUE);
		g2.draw(f2);
		
		Fish f3 = new SpongeBob(100, 100, 50);
		g2.setColor(Color.ORANGE);
		g2.draw(f3);
		
		Fish f4 = new RockFish(400, 100, 25);
		g2.setColor(Color.BLACK);
		g2.draw(f4);
		
		Fish f5 = new SpongeBob(300, 200, 100);
		g2.setColor(Color.ORANGE);
		g2.draw(f5);
		

/*
	StickFigure sf = new StickFigure(200,200,25);
	g2.setColor(Color.RED);
	g2.draw(sf);

	StickFigure sf2 = new StickFigure(500,100,50);
	g2.setColor(Color.BLUE);
	g2.draw(sf2);
*/
	}
}
