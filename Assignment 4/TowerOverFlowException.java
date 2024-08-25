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
public class TowerOverFlowException extends Exception {

    /**
     * Creates a new instance of <code>TowerOverFlowException</code> without
     * detail message.
     */
    public TowerOverFlowException() {
        super("Tower is Overflowing!");
    }

    /**
     * Constructs an instance of <code>TowerOverFlowException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TowerOverFlowException(String msg) {
        super(msg);
    }
}
