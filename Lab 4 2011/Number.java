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
public abstract class Number{
    
    /*
    method header for a method called add that
    takes a Number and returns a Number
    */
    public abstract Number add(Number y);
    
    /*
    method header for a method called negate that
    has no arguements and returns a Number
    */
    public abstract Number negate();
    
    /*
    A method called substract that takes a Number and returns the result
    of substracting the parameter from the Number the method is called on
    */
    public Number substract(Number result)
    {
       return this.add(result.negate());  
    }
    
    /*
    a method header called multiply that takes a Number and returns a Number
    */
    public abstract Number multiply(Number n);
    
}
