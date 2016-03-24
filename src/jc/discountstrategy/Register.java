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
public class Register {
    private Receipt receipt;
    private ReceiptOutputStrategy receiptOutput;
    
    /**
     * Parameters are not validated:
     * @param custID
     * @param store
     * @param db 
     */
    public final void startNewSale(String custID, StoreStrategy store, DatabaseStrategy db){
        // needs validation
        receipt = new Receipt(custID, store, db);
    }
    /**
     * Parameters are not validated:
     * @param consoleOutput
     * @param guiOutput 
     */
    public final void endSale(ReceiptOutputStrategy consoleOutput, ReceiptOutputStrategy guiOutput){
        // needs validation
        consoleOutput.printReceipt(receipt);
        guiOutput.printReceipt(receipt);
    }
    
    /**
     * Parameters are not validated:
     * @param prodID
     * @param qty 
     */
    public final void addItemToSale(String prodID, int qty){
        // needs validation
        receipt.addItemToReceipt(prodID, qty);
    }

    public final Receipt getReceipt(){
        return receipt;
    }
    
    /**
     * Parameters are not validated:
     * @param receipt 
     */
    public final void setReceipt(Receipt receipt) {
        // needs validation
        this.receipt = receipt;
    }
    
}
