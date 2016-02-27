/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.discountstrategy;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan
 */
public class JOptionOutput implements ReceiptOutputStrategy{
    
    @Override
    public void printReceipt(Receipt receipt) {
        String lineItems = "";
        for (LineItem item: receipt.getLineItems()){
            lineItems = lineItems + "\n" + item.getLineItemData();
        }
        JOptionPane.showMessageDialog(null, receipt.getReceiptHeader() +
                lineItems);
    }
    
}
