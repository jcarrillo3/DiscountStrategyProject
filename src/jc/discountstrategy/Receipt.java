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
public class Receipt {
    private StoreStrategy store;
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;
    private DateTime date;
    public final String CUSTOMER_LABEL = "Customer: ";
    public final String ID_HEADER = "ID";
    public final String PRODUCT_HEADER = "Product";
    public final String QTY_HEADER = "Qty";
    public final String SUBTOTAL_HEADER = "Subtotal";
    public final String DISCOUNT_HEADER = "Discount";
    
    public Receipt(String custID, StoreStrategy store, DatabaseStrategy db) {
        setDb(db);
        setCustomer(db.findCustomerByID(custID));
        lineItems = new LineItem[0];
        this.store = store;
        date = new DateTime();
    }
    
    /**
     * Parameters are not validated:
     * @param prodID
     * @param qty 
     */
    public final void addItemToReceipt(String prodID, int qty) throws IllegalArgumentException{
        if (prodID == null || prodID.isEmpty() || qty < 1){
            throw new IllegalArgumentException("ProductID and/or Quantity must be valid values.");
        }
        LineItem item = new LineItem(prodID, qty, db);
        
        addItemToArray(lineItems, item);
    }
    
    /**
     * Parameters are not validated:
     * @param origArray
     * @param item 
     */
    private final void addItemToArray(LineItem[] origArray, LineItem item){
        // needs validation
        LineItem[] tempArray = new LineItem[origArray.length+1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length-1] = item;
        origArray = tempArray;
        lineItems = origArray;
    }
    
    public final String getReceiptHeader() {
        String header = getStore().getStoreName() +"\n"
                + date.getDateTime() + "\n"
                + CUSTOMER_LABEL + getCustomer().getCustomerName() +"\n\n"
                + ID_HEADER +"\t"+ PRODUCT_HEADER +"\t"+  QTY_HEADER +"\t"+ SUBTOTAL_HEADER +"\t"+ DISCOUNT_HEADER +"\n"
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
    
    /**
     * Parameters are not validated:
     * @param customer 
     */
    public final void setCustomer(Customer customer) {
        // needs validation
        this.customer = customer;
    }
    
    public final DatabaseStrategy getDb() {
        return db;
    }
    
    /**
     * Parameters are not validated:
     * @param db 
     */
    public final void setDb(DatabaseStrategy db) {
        // needs validation
        this.db = db;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }
    
    /**
     * Parameters are not validated:
     * @param lineItems 
     */
    public final void setLineItems(LineItem[] lineItems) {
        // needs validation
        this.lineItems = lineItems;
    }
    
    public final StoreStrategy getStore() {
        return store;
    }
    
    /**
     * Parameters are not validated:
     * @param store 
     */
    public final void setStore(StoreStrategy store) {
        // needs validation
        this.store = store;
    }
    
}
