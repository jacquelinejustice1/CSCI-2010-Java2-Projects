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
public class FullStackException extends Exception {

    /**
     * Creates a new instance of <code>FullStackException</code> without detail
     * message.
     */
    //modify the default constructor so that it calls the Exception
    //constructer with a defualt message
    public FullStackException() {
        super("Full Stack Exception!");
    }

    /**
     * Constructs an instance of <code>FullStackException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FullStackException(String msg) {
        super(msg);
    }
}
