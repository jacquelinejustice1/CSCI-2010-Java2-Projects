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
public class Polygon {
    
    private int sides; 

    public Polygon(int sides){
        this.sides = sides;
        if(sides < 3){
            System.out.println("Error: invalid number of sides");
            System.exit(0);
        }
    }
    public int getSides(){
        return sides;
    }
    public String toString(){
        return "Number of sides: " + sides;
    }
    
    
    
}
