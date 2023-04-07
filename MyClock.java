/**
 *  Tom Chiapete
 *  Course: CSCI 241 - Computer Science I
 *  Section: 001
 *  Assignment Number: Two
 *
 *  Project/Class Description
 *  This project demonstrates the use of the ACM library.
 *  The assignment is to draw a clock.  I decided to draw a watch.
 *  To draw a watch, you need lines, ovals, and rectangles, which 
 *  can be constructed using GOval, GLine, and GRect.
 *  
 *  My clock extends GraphicsProgram.
 *
 *  Known Bugs:  None
 */


import acm.graphics.*;
import acm.program.*;

public class MyClock extends GraphicsProgram
{
    /**
     * Constructor for objects of class MyClock
     */
    public MyClock()
    {

    }  
    
    /** 
     * main() method
     * This is like the "starting point".
     */
    public static void main (String [] args)
    {
        MyClock tickTock = new MyClock(); // Declares and creates the object.
        tickTock.start(); // Displays the clock window.
        
        // Create an outter circle for the clock piece.
        // Set the fill color to blue.
        GOval outterCircle = new GOval(145,145,60,60);
        outterCircle.setFillColor(BLUE);
        outterCircle.setFilled(true);
        tickTock.add(outterCircle);
        
        // Create an inner circle that holds the hour/minute hands.
        // Set fill color to yellow.
        GOval innerCircle = new GOval(150,150,50,50);
        innerCircle.setFillColor(YELLOW);
        innerCircle.setFilled(true);
        tickTock.add(innerCircle);
        
        // Create that little piece that you set your watch with.
        GRect watchSetter = new GRect(205,170,5,10);
        tickTock.add(watchSetter);
        
        // Set the hour hand by drawing a line from the center
        // to 1 o'clock
        GLine hourHand = new GLine(175,175,180,165);
        tickTock.add(hourHand);
        
        // Set the minute hand by drawing a line from the center 
        // to 12 o'clock.
        GLine minuteHand = new GLine(175,175,175,155);
        tickTock.add(minuteHand);
        
        // DRAW TOP BAND.
        // Draw a straight line on the top left side to draw a band.
        GLine topLeftBand1 = new GLine(150,160,150,80);
        tickTock.add(topLeftBand1);
        
        // Draw a straight line on the top right side to draw a band.
        GLine topRightBand1 = new GLine(200,160,200,80);
        tickTock.add(topRightBand1);
        
        // Draw a line on the top left side that slants a bit.
        GLine topLeftBand2 = new GLine(150,80,155,35);
        tickTock.add(topLeftBand2);
        
        // Drwa a line on the top right side that slants a bit.
        GLine topRightBand2 = new GLine(200,80,195,35);
        tickTock.add(topRightBand2);
        
        // Connect the two slants on top.
        GLine topOfBand = new GLine(155,35,195,35);
        tickTock.add(topOfBand);
        
        // DRAW BOTTOM BAND
        // Draw a straight line on the bottom left side to draw a band.
        GLine bottomLeftBand1 = new GLine(150,190,150,270);
        tickTock.add(bottomLeftBand1);
        
        // Draw a straight line on the bottom right side to draw a band.
        GLine bottomRightBand1 = new GLine(200,190,200,270);
        tickTock.add(bottomRightBand1);
        
        // Draw a line on the bottom left side that slants a bit.
        GLine bottomLeftBand2 = new GLine(150,270,155,315);
        tickTock.add(bottomLeftBand2);
        
        // Draw a line on the bottom right side that slants a bit.
        GLine bottomRightBand2 = new GLine(200,270,195,315);
        tickTock.add(bottomRightBand2);
        
        // Connect the two slants on bottom.
        GLine bottomOfBand = new GLine(155,315,195,315);
        tickTock.add(bottomOfBand);
        
        // Draw a rectangle at the bottom of the bottom band.
        GRect metalRect = new GRect(155,315,40,30);
        tickTock.add(metalRect);
        
        // Draw a little metal piece you stick in the holes.
        // Put it in the center of the rectangle.
        GLine metalPiece = new GLine(175,315,175,335);
        tickTock.add(metalPiece);
        
        // Draw a little hole on the upper part of the top band.
        GOval hole1 = new GOval(173,75,3,3);
        tickTock.add(hole1);
        
        // Draw a little hole in the middle part of the top band.
        GOval hole2 = new GOval(173,105,3,3);
        tickTock.add(hole2);
        
        // Draw a little hole on the bottom part of the top band.
        GOval hole3 = new GOval(173,135,3,3);
        tickTock.add(hole3);
        
        // completed.
    }
    
}
