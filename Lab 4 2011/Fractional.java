/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci2011.justicelab4;

/**
 *
 * @author Jacqueline Justice
 */
public abstract class Fractional extends Number{

    /*
    a method header for a method called reciprocal that has no parameters
    and returns a Fractional
    */
    public abstract Fractional reciprocal();
    
    /*
    method called divide that takes a Fractional and returns the result
    of dividing the parameter from the Fractional the method is called 
    on
    */
    public Fractional divide(Fractional y){
        //casting the Fractional to the Number type
        return (Fractional)this.multiply(y.reciprocal());
    }
    
    
    
}
