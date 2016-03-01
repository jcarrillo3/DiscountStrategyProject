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
    
    public final void startNewSale(String custID, StoreStrategy store, DatabaseStrategy db){
        // needs validation
        receipt = new Receipt(custID, store, db);
    }
    public final void endSale(ReceiptOutputStrategy consoleOutput, ReceiptOutputStrategy guiOutput){
        // needs validation
        consoleOutput.printReceipt(receipt);
        guiOutput.printReceipt(receipt);
    }
    public final void addItemToSale(String prodID, int qty){
        // needs validation
        receipt.addItemToReceipt(prodID, qty);
    }

    public final Receipt getReceipt(){
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        // needs validation
        this.receipt = receipt;
    }
    
}
