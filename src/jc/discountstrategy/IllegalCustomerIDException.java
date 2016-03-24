/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.discountstrategy;

/**
 *
 * @author Juan
 */
public class IllegalCustomerIDException extends IllegalArgumentException {
    private static final String ERR_MSG = "Sorry customer ID is invalid, please try again.";

    public IllegalCustomerIDException() {
        super(ERR_MSG);
    }

    public IllegalCustomerIDException(String s) {
        super(ERR_MSG);
    }

    public IllegalCustomerIDException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public IllegalCustomerIDException(Throwable cause) {
        super(cause);
    }
    
}
