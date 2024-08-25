/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2011.justicelab5;

/**
 *
 * @author Jacqueline Justice
 */
public class NumberStack {

    //private instance variables for an array or doubles and an int 
    //representing how many numbers are in the stack
    double[] doubleArr;
    private int numInStack;

    //constructor that takes an int representing the capacity of the array,
    //uses it to initialize the array, and sets the number of numbers to 0
    public NumberStack(int capacity) {
        this.doubleArr = new double[capacity];
        this.numInStack = 0;

    }

    //accessor
    public int getNumInStack() {
        return this.numInStack;
    }

    /*
    a toString method that returns "empty stack" if there are no numbers
    in the stack, and all of the numbers in the stack
    seperated by spaces otherwise
     */
    @Override
    public String toString() {
        String str = " ";
        if (getNumInStack() == 0) {
            return "empty stack!";
        }
        for (int i = 0; i < getNumInStack(); i++) {
            str = str + doubleArr[i] + " ";
        }
        return str;
    }

    /*
    a boolean method called isEmpty that returns true if the stack is full
    and false otherwise
     */
    public boolean isEmpty() {
        return getNumInStack() == 0;
    }

    /*
    a boolean method called isFull that returns true if the stack is empty
    and false otherwise
     */
    public boolean isFull() {
        return getNumInStack() == doubleArr.length;
    }

    /*
    a void method called push that takes a double as a parameter 
     */
    public void push(double num) throws FullStackException {

        //if the stack is full, throws an exception with a message
        if (isFull()) {
            throw new FullStackException("Item can't be "
                    + "added to a full stack");
        } else {
            //otherwise, stores the number in the next open spot and increments
            doubleArr[numInStack] = num;
            numInStack++;
        }
    }

    //a method called pop that has no parameters
    public double pop() throws EmptyStackException {
        //if the stack is empty, throws an exception with a message

        if (isEmpty()){
            throw new EmptyStackException("Item can't be removed "
                    + "from an empty stack");
        } else {
            //otherwise, decrements the number of items and use it as an 
            //index to return the last number pushed into the stack
            numInStack--;
            return doubleArr[numInStack];
        }
        //returns the last number pushed into the stack
    }
}
