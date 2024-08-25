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
public class UnsupportedOperationException extends Exception{

    /**
     * Creates a new instance of <code>UnsupportedOperationException</code>
     * without detail message.
     */
    public UnsupportedOperationException() {
        super("Unsupported Operation!");
    }

    /**
     * Constructs an instance of <code>UnsupportedOperationException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public UnsupportedOperationException(String msg) {
        super(msg);
    }
}
