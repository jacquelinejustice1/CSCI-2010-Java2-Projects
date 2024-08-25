/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2011.justicelab10;

import java.util.ArrayList;

/**
 *
 * @author Jacqueline Justice
 */
public class ArrayListNumberStack implements NumberStack {

    /*
    a private isntance variable of type ArrayList<Double> to store the numbers
    */
    private ArrayList<Double> arrStack;

    /*
    a default constructor that initializes the private instance
    variable
    */
    public ArrayListNumberStack(){
        arrStack = new ArrayList<Double>();
        
    }
    /*
    Overrided public void method called push that takes a double for the 
    item and uses the object to add the item at the end of the ArrayList
    */
    @Override
    public void push(double item){
        
        //adding the item of type double at the end of the ArrayList
         arrStack.add(item);
         
    }
    /*
    Overrided public void method called pop that has no parameters
    and throws an EmptyStackException 
    */
    @Override
    public double pop() throws EmptyStackException{
        //if the ArrayList is empty, throws the EmptyStackException
        if(isEmpty()){
            throw new EmptyStackException("Stack is Empty!");
            //Otherwise remove an item from the end of the ArrayList
        } else {
            double temp = arrStack.get(size()-1);
            arrStack.remove(size()-1);
            return temp;
        }
    }
    /*
    implementing the isEmpty(), size(), and clear() methods from the 
    NumberStack interface using the ArrayList methods of the 
    same name
    */
    @Override
    public boolean isEmpty(){
       return arrStack.isEmpty();
    }
    @Override
    public int size(){
      return arrStack.size();
    }
    @Override
    public void clear(){
        arrStack.clear();
        
    }
    
}
