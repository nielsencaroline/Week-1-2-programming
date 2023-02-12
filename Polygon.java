import java.text.DecimalFormat;
/**
 * @file Polygon.java
 * @date 2/11/2023
 * @author Caroline Nielsen
 *
 * * @description Uses the number of sides, side lengths, and shape type to create a polygon or determine if it is invalid
 */

//Extra credit: Write a method called calculateArea that will find the area of any n-sided polygon to 3 decimal places
public class Polygon {

    DecimalFormat df = new DecimalFormat("#.###");

    private int numberSides;
    private double theSideLength;
    private String theShapeType;
    private double perimeter = numberSides * theSideLength;
    private boolean polygonChecker;

    private double area;

    /**
     * @description default constructor that creates a triangle
     */
    public Polygon() {
        numberSides = 3;
        theSideLength = 1.0;
        theShapeType = "triangle";
        polygonChecker = true;
    }

    /**
     * @description constructor that uses the number of sides, side length, and the shape type
     * @param numSides
     * @param sideLength
     * @param shapeType
     */
    public Polygon(int numSides, double sideLength, String shapeType) {
        if (numSides <= 2 || sideLength < 0) {
            polygonChecker = false;
            numberSides = 3;
            theSideLength = 1.0;
            theShapeType = "triangle";
        } else {
            polygonChecker = true;
            numberSides = numSides;
            theSideLength = sideLength;
            theShapeType = shapeType;
        }
    }

    /**
     * @return the number of sides
     */

    public double getNumSides() {
        return numberSides;
    }

    /**
     * @return the side length
     */

    public double getSideLength() {
        return theSideLength;
    }

    /**
     * @return the perimeter of the shape
     */
    public double getPerimeter(){
        return perimeter;
    }

    /**
     * @return the shape type
     */

    public String getShapeType() {
        return theShapeType;
    }

    /**
     * @param newSideLength desired length
     * @return the new side length
     * @description Allows the user to change the side length of the polygon.
     */

    public void setSideLength(double newSideLength){
        if(newSideLength >= 0) {
            theSideLength = newSideLength;
        }
    }

    /**
     * @description Modifies the number of sides of the rectangle
     * @param newNumSides
     */
    public void setNumSides(int newNumSides){
        if(newNumSides > 0) {
            numberSides = newNumSides;
            }
    }

    /**
     * @description Allows the user to change the name of the polygon.
     * @param newName desired name
     */
    public void setShapeName(String newName) {
        if (newName != ("none")) {
            theShapeType = newName;
        }
    }

    /**
     * @description calculates the perimeter of the polygon
     * @return the perimeter
     */
    public double calculatePerimeter() {
        return perimeter = (Math.round(numberSides * theSideLength * 1000))/1000.0;
    }
    /**
     * @description Calculates area of rectangle
     */

    public double calculateArea() {
        area = (numberSides * (theSideLength * theSideLength)) / (4.0 * Math.tan((Math.PI / numberSides)));
        return area = Math.round(area*1000)/1000.0;
    }

    /**
     * @return the area
     */
    public double getArea() {
        area = (numberSides * (theSideLength * theSideLength)) / (4.0 * Math.tan((Math.PI / numberSides)));
        return area = Math.round(area*1000)/1000.0;
    }
    /**
     * @description if the polygon is not valid, it will print the default settings.
     * If it is valid, it will print out the sides, sideLength, type, perimeter, and, area.
     */
    public String toString() {

        if(!polygonChecker){
            return "Not a valid polygon. Your polygon was given a default of " + numberSides + " sides, was named triangle, and each side has a length of " + theSideLength + " units.\n";
        }
            else{
            calculateArea();
            calculatePerimeter();
                return "Your shape is a " + theShapeType + " and it has " + df.format(numberSides) + " sides. It has a side length of " + df.format(theSideLength) + ". It has a perimeter of " + df.format(perimeter) + " units.";
            }
        }
}
