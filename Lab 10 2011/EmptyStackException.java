/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2011.justicelab10;

/**
 *
 * @author jjust
 */
public class EmptyStackException extends Exception{
    
    /**
     * Creates a new instance of <code>EmptyStackException</code> without detail
     * message.
     */
    public EmptyStackException() {
        super("Stack is Empty!");
    }

    /**
     * Constructs an instance of <code>EmptyStackException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyStackException(String msg) {
        super(msg);
    }
}
