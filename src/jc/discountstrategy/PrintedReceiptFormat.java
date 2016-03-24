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
public class PrintedReceiptFormat implements ReceiptFormatStrategy {
    public final String CUSTOMER_LABEL = "Customer: ";
    public final String THANKYOU_MESSAGE = "Thank you for shopping with ";
    
    @Override
    public String getReceiptFormat(Receipt receipt) {
        return "";
    }
    
}
