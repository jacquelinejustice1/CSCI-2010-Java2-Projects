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
//extends Fractional and implements the Comparable and Convertible interfaces
public class Rational extends Fractional implements Convertible, Comparable {

    //private instance variables for the numerator and denominator, both integers
    private int numerator;
    private int denominator;

    /*
    A constructor that takes two integers, a numerator and a denominator
    */
    public Rational(int numerator, int denominator) {
        //if the denominator is 0, display error message and exit the program
        if (denominator == 0) {
            System.out.println("Error: Invalid number");
            System.exit(0);
        }
        /*
        if the denominator is less that 0, initializes the numerator and 
        denominator private instance variables to the negation of the 
        numerator and denominator parameters
        */
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        }
        //if the denominator is greater than zero, initialize the private
        //instance variable using the corresponding parameters
        if(denominator > 0){
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    //accessors
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    /*
    a public Number method named add that takes a Number 
    and returns the result of the formula:  a/b+c/d=(ad+bc)/(bd)
    */
    @Override
    public Number add(Number other){
        //casting the parameter to a Rational object
      Rational otherNumber =  (Rational)other;
      int n = this.numerator * otherNumber.denominator + 
              this.denominator * otherNumber.numerator;
      int denom = this.denominator * otherNumber.denominator;
      Rational result = new Rational(n, denom);
        return result;
    }
    /*
    a public Number method called negate that takes no parameters and returns
    the result of the formula: -(a/b)=(-a)/b
    */
    @Override
    public Number negate(){
        int i = -this.numerator;
        int k = this.denominator;
        Rational negateResult = new Rational(i, k);
        return negateResult;
    }
    /*
    a public Number method called mulitply that takes a Number and returns
    the result of the formula: a/b×c/d=(ac)/(bd)
    */
    @Override
    public Number multiply(Number r){
        //casting to a Rational object
    Rational multNumber = (Rational)r;
    int b = this.numerator * multNumber.numerator;
    int c = this.denominator * multNumber.denominator;
    Rational otherResult = new Rational(b,c);
    return otherResult;
    }
    /*
    the same subtract method from the Number class
    */
    @Override
    public Number substract(Number result){
        return this.add(result.negate());
    }
    /*
    a public Fractional method called reciprocal that returns the result
    of the formula: 1/(a/b)=b/a
    */
    @Override
    public  Fractional reciprocal(){
       int j = this.numerator;
       int g = this.denominator;
       //if the numerator is 0, method should display an error message and close
       if(this.numerator == 0){
         System.out.println("Error");
         System.exit(0);
       }
       Rational rationResult = new Rational(g, j);
       return rationResult;
    }
    /*
    the same divide method from the Fractional class
    */
    @Override
    public Fractional divide(Fractional y){
        //casting the Fractional to the Number type
        return (Fractional)this.multiply(y.reciprocal());
    }
    

    /*
    Methods from the Convertible interface
    */
    @Override
    //returns the result of the numerator divided by the denominator as an Int
    public int intValue() {
        return getNumerator() / getDenominator();
    }

    @Override
    //returns the result of the numerator divided by the 
    //denominator as a double
    public double doubleValue() {
        return (double)numerator * 1.0/ denominator ;
    }

    /*
     Implement the compareTo method from Comparable 
    */
    @Override
    public int compareTo(Object o) {
      //casting to a Rational object
      Rational rationalObj = (Rational) o;
      
      int result = this.numerator * rationalObj.denominator 
              - this.denominator * rationalObj.numerator;
      //if the result is greater than zero, returns 1 (positive number)
      if(result > 0){
          return 1;
      }
      //if the result is less than zero, returns -1 (negative number)
      if(result < 0){
        return -1;
    }
      //otherwise, just returns the result
      return result;
    }
    /*
    toString method that displays the numerator and denominator in fraction form
    */
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    
}
