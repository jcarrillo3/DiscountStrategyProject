/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.discountstrategy;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Juan
 */
public class Receipt {
    private StoreStrategy store;
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;

    public Receipt(String custID, StoreStrategy store, DatabaseStrategy db) {
        setDb(db);
        setCustomer(db.findCustomerByID(custID));
        lineItems = new LineItem[0];
        this.store = store;
    }

    public final void addItemToReceipt(String prodID, int qty){
        // needs validation
        LineItem item = new LineItem(prodID, qty, db);
        
        addItemToArray(lineItems, item);
    }
    
    private final void addItemToArray(LineItem[] origArray, LineItem item){
        // needs validation
        LineItem[] tempArray = new LineItem[origArray.length+1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length-1] = item;
        origArray = tempArray;
        lineItems = origArray;
    }
    
    public final String getDateTime(){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return df.format(date);
    }
    
    public final String getReceiptHeader() {
        String header = getStore().getStoreName() +"\n"
                + getDateTime() + "\n"
                + "Customer: "+getCustomer().getCustomerName() +"\n\n"
                + "ID     Product         Qty    SubTotal     Discount \n"
                + "--------------------------------------------------"
                ;
        return header;
    }
    public final String getReceiptTotals(){
        String totals = "\n\nTotal Before Dicount: " + getTotalBeforeDiscount() 
                + "\n" + "Total After Dicount: " + getTotalAfterDiscount() 
                + "\n" + "Total Saved: " + getTotalSaved();
        return totals;    
    }
    private final double getTotalBeforeDiscount(){
        double amount = 0;
        for (LineItem item: lineItems){
            amount += item.getSubtotal();
        }
        return amount;
    }
    private final double getTotalAfterDiscount(){
        double amount = 0;
        for (LineItem item: lineItems){
            amount += item.getSubtotal() - item.getDiscountAmt();
        }
        return amount;
    }
    private final double getTotalSaved(){
        double amount = 0;
        for (LineItem item: lineItems){
            amount += item.getDiscountAmt();
        }
        return amount;
    }
    
    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        // needs validation
        this.customer = customer;
    }
    
    public final DatabaseStrategy getDb() {
        return db;
    }

    public final void setDb(DatabaseStrategy db) {
        // needs validation
        this.db = db;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        // needs validation
        this.lineItems = lineItems;
    }
    
    public final StoreStrategy getStore() {
        return store;
    }

    public final void setStore(StoreStrategy store) {
        // needs validation
        this.store = store;
    }
    
}
