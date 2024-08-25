/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2011.justicelab3;

/**
 *
 * @author Jacqueline Justice
 */
public class RegularPolygon extends Polygon {

    private double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        super(sides);
       
       this.sideLength = sideLength;
    }
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {

        this.sideLength = sideLength;
            if(sideLength <= 0){
            System.out.println("Error: Invalid length for sides");
            System.exit(0);
        }
    }

    public double getPerimeter() {
        return getSides() * getSideLength();
    }

    public String toString() {
        return super.toString() + "\nSide length: " +
                getSideLength() + "\nPerimeter: " + getPerimeter();

    }
}
