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
public class ConsoleOutput implements ReceiptOutputStrategy {
    
    /**
     * Parameters are not validated
     * @param receipt 
     */
    @Override
    public final void printReceipt(Receipt receipt) {
        // needs validation
        System.out.println(receipt.getReceiptHeader());
        for (LineItem item: receipt.getLineItems()){
            System.out.println(item.getLineItemData());
        }
        System.out.println(receipt.getReceiptTotals());
    }
    
}
