/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2010.justiceprogram4;

/**
 *
 * @author jjust
 */
public class IllegalPushException extends Exception{

    /**
     * Creates a new instance of <code>IllegalPushException</code> without
     * detail message.
     */
    public IllegalPushException() {
        super("Illegal Push!");
    }

    /**
     * Constructs an instance of <code>IllegalPushException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalPushException(String msg) {
        super(msg);
    }
}
