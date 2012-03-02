package edu.ucsb.cs56.W12.nlmarks.lab04;
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

	StickFigure sf = new StickFigure(200,200,25);
	g2.setColor(Color.RED);
	g2.draw(sf);

	StickFigure sf2 = new StickFigure(500,100,50);
	g2.setColor(Color.BLUE);
	g2.draw(sf2);
    }   
}
