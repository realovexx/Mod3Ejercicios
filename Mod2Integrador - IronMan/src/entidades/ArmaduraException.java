/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class ArmaduraException extends Exception {

    /**
     * Creates a new instance of <code>ArmaduraException</code> without detail
     * message.
     */
    public ArmaduraException() {
    }

    /**
     * Constructs an instance of <code>ArmaduraException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ArmaduraException(String msg) {
        super(msg);
    }
}
