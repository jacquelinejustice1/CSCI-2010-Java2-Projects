
package csci2011.justicelab4;
import java.util.Arrays;
/**
 *CSCI 2011 Lab Assignment 4 
 *
 * @author Jacqueline Justice
 */
public class JusticeLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //Rational object representing 3/4
      Rational r1 = new Rational(3,4);
      System.out.println("numerator = 3 and denominator = 4");
      System.out.println("toString returns: " + r1.toString());
     
      //Rational object representing 4/-5
      Rational r2 = new Rational(4,-5);
      System.out.println("numerator = 4 and denominator = -5");
      System.out.println("toString returns: " + r2.toString());
      
      //Rational object representing -5/6
      Rational r3 = new Rational(-5,6);
      System.out.println("numerator = -5 and denominator = 6");
      System.out.println("toString returns: " + r3.toString());
      
      //Rational object representing -3/-4
      Rational r4 = new Rational(-3, -4);
      System.out.println("numerator = -3 and denominator = -4");
      System.out.println("toString returns: " + r4.toString() + "\n");
      
      /*
      if-else statements comparing the Rational objects r1 to r2
      */
      if(r1.compareTo(r2) >0){
          System.out.println(r1.toString() + " is greater than " 
                  + r2.toString()+ "\n");
      } else if(r1.compareTo(r2) == 0){
          System.out.println(r1.toString() + " is equal to " 
                  + r2.toString()+ "\n");
      } else {
          System.out.println(r1.toString() + " is less than "
                  + r2.toString()+ "\n");        
      }
      
      /*
      if-else statements comparing the Rational objects r2 to r1
      */
      if(r2.compareTo(r1) >0){
          System.out.println(r2.toString() + " is greater than "
                  + r1.toString()+ "\n");
      } else if(r2.compareTo(r1) == 0){
          System.out.println(r2.toString() + " is equal to "
                  + r1.toString()+ "\n");
      } else {
          System.out.println(r2.toString() 
                  + " is less than " + r1.toString()+ "\n");        
      }
      
      /*
      if-else statements comparing the Rational objects r1 to r4
      */
      if(r1.compareTo(r4) > 0){
          System.out.println(r1.toString() + " is greater than " 
                  + r4.toString()+ "\n");
      } else if(r1.compareTo(r4) == 0){
          System.out.println(r1.toString() + " is equal to "
                  + r4.toString()+ "\n");
      } else {
          System.out.println(r1.toString() + " is less than " 
                  + r4.toString()+ "\n");        
      }
      
      /*
      Displaying the negation, reciprocal, int value and double value of 
      the Rational object r1
      */
      System.out.println("Negation of " + r1.toString()
              + " is " + r1.negate());
      System.out.println("Reciprocal of " + r1.toString()
              + " is " + r1.reciprocal());
      System.out.println("Integer value of " + r1.toString() 
              + " is " + r1.intValue());
      System.out.println("Double value of " + r1.toString() 
              + " is " + r1.doubleValue() + " \n");
      
      
      /*
      Displaying the add method, subtract method, multiply method and 
      divide method on the Rational objects r1 and r2
      */
      System.out.println(r1.toString() + " + " + 
              r2.toString() + " = " + r1.add(r2).toString());
      System.out.println(r1.toString() + " - " + r2.toString()
              + " = " + r1.substract(r2).toString());
      System.out.println(r1.toString() 
              + " * " + r2.toString() + " = " + r1.multiply(r2).toString());
      System.out.println(r1.toString() + " / " 
              + r2.toString() + " = " + r1.divide(r2).toString()+ "\n");
      
      /*
      sorting an array of Rational objects
      - Creating a Rational array of the objects 
      - importing the Array class to sort through the Rational array
      - displaying the sorted array
      */
      System.out.println("Testing sorting an array of Rational objects");
      Rational[] arrayRat = {r1, r2, r3};
      Arrays.sort(arrayRat);
      for(int i = 0; i < arrayRat.length; i++){
          System.out.print(arrayRat[i] + " ");
          
      }
      
      
    } 

}
