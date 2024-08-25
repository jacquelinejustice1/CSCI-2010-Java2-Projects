/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package justiceprogram6;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Jacqueline Justice
 */
public class CalculateHandler implements EventHandler{
    //four instance variables for the morgtate inputs
    private double p;
    private double r;
    private int t;
    private int n;
    private double monthlyPayments;
            
    //overrided handle method
    @Override
    public void handle(Event e){
        
        //calculating the monthly payments
        monthlyPayments = calculateMonthlyPayments(p, r, t, n);
        
    }
    /*
    public constructor that initializes two doubles and two integers
    for the variables
    */
    public CalculateHandler(double p, double r, int t, int n){
        this.p = p;
        this.r = r;
        this.t = t;
        this.n = n;
        
    }
    /*
    accessor method for the monthly payments
    */
    public double getMonthlyPayments(){
        return monthlyPayments;
    }
    /*
    public static double method called calculatedMonthlyPayments
    that takes 2 doubles and 2 integers and returns the monthly payment
    value
    */
     public static double calculateMonthlyPayments(double p, double r, int t, int n){
        
     return (p*(r/n)*Math.pow((1+(r/n)),(n*t)))/ (Math.pow((1+(r/n)),(n*t))-1);
        
    }      
    


}
