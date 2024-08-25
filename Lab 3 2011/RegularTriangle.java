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
public class RegularTriangle extends RegularPolygon{
    private double height;
 
    public RegularTriangle(double sideLength){
        super(3, sideLength);
        this.setSideLength(sideLength);
       
        
    }
    public void setSideLength(double sideLength){
        super.setSideLength(sideLength);
        height = ((Math.sqrt(3) * getSideLength()/2));
        
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
         this.height = height;
        if(height <= 0){
            System.out.println("Error: Invalid height");
            System.exit(0);
        }
        super.setSideLength(2 * height/Math.sqrt(3));
    }
    public double getArea(){
        return .5 * getSideLength() * getHeight();
        
    }
    public String toString(){
        return super.toString() +
        "\nHeight : " + getHeight() + "\nArea: " + getArea();
        
        
    }
    
}

