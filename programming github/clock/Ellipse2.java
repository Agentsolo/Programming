/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author George Athanasatos
 */
public class Ellipse2 {
    //data members
    private double majorAxis;
    private double minorAxis;
    
   /**
    * Default constructor
    */
    public Ellipse2() {
        Random rand = new Random();

        this.majorAxis = (double) (rand.nextInt(5 + 1)) + 5;
        this.minorAxis = (double) (rand.nextInt(5 + 1)) + 5;
    }
    /**
     * Constructor with all data members
     * @param majorAxis the major-axis
     * @param minorAxis the minor-axis
     */
    public Ellipse2(double majorAxis, double minorAxis) {
       this.majorAxis = majorAxis;
       this.minorAxis = minorAxis;
    }
    /**
     * Copy constructor
     * @param ellipse copy of the Ellipse
     */
    public Ellipse2(Ellipse2 ellipse) {
       this.majorAxis = ellipse.majorAxis;
       this.minorAxis = ellipse.minorAxis;
    }
    /**
    * To calculate the area of Ellipse
    * @return the calculated area
    */
    public double calcArea() {
      double majorAndMinor = majorAxis * minorAxis;
      // more organized for me to do it like this, even though I could've returned it directly
      return Math.PI * majorAndMinor; 
    }
    /**
     * To calculate the perimeter of an Ellipse
     * @return the calculated perimeter
     */
    public double calcPerimeter() {
      double piSquared = Math.PI + Math.PI;
      double majorX2 = majorAxis * majorAxis;
      double minorX2 = minorAxis * minorAxis;
      // more organized for me to do it like this, even though I could've returned it directly
      return Math.sqrt((majorX2 + minorX2) / 2) * piSquared; 
    } 
    /**
     * To check if it is a circle or not
     * @return the message accordingly
     */
    public boolean isCircle() {
        if (majorAxis == minorAxis) {
            System.out.println("This ellipse is a circle\n");
        }
        else {
            if (majorAxis != minorAxis) {
                System.out.println("This ellipse is not a circle\n");
            }
        }
        return false;
    }
    /**
    * To check if the axis is valid
    * @return if its valid or not
    */
    public boolean isAxisValid() {
         return majorAxis <= 0 || minorAxis <= 0;
    }
    /**
    * To generate a string
    * @return the generated string
    */
    @Override
    public String toString() {
       String str = "";

       str += String.format("%-15s: %.2f\n", "Major-Axis", majorAxis);
       str += String.format("%-15s: %.2f\n", "Minor-Axis", minorAxis);
       str += String.format("%-15s: %.2f\n", "Area", calcArea());
       str += String.format("%-15s: %.2f\n\n", "Perimeter", calcPerimeter());
        return str;
    }
    /**
     * To compare the two ellipse's
     * @param ellipse another ellipse
     * @return if the two ellipse's are the same
     */
    public boolean equals(Ellipse2 ellipse) {
        return this.majorAxis == ellipse.majorAxis 
                && this.minorAxis == ellipse.minorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
        if (!isAxisValid()) {
        } 
        else {
            System.out.println("The new Major axis value must be a positive value\n");
        }
    }
    public double getMinorAxis() {
        return minorAxis;
    }
    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
        if (!isAxisValid()) {
        } 
        else {
            System.out.println("The new Minor axis value must be a positive value\n");
        }
    }
}
