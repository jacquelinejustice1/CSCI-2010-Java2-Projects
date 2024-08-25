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
public class EmptyTowerException extends Exception{

    /**
     * Creates a new instance of <code>EmptyTowerException</code> without detail
     * message.
     */
    public EmptyTowerException() {
        super("Tower is empty!");
    }

    /**
     * Constructs an instance of <code>EmptyTowerException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyTowerException(String msg) {
        super(msg);
    }
}
