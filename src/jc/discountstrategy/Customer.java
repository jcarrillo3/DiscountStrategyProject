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
public class Customer {
    private String customerID;
    private String customerName;

    public Customer(String customerID, String customerName) {
        setCustomerID(customerID);
        setCustomerName(customerName);
    }

    public final String getCustomerID() {
        return customerID;
    }
    
    /**
     * Parameters are not validated:
     * @param customerID 
     */
    public final void setCustomerID(String customerID) {
        // needs validation
        this.customerID = customerID;
    }

    public final String getCustomerName() {
        return customerName;
    }
    
    /**
     * Parameters are not validated:
     * @param customerName 
     */
    public final void setCustomerName(String customerName) {
        // needs validation
        this.customerName = customerName;
    }
    
    
}
