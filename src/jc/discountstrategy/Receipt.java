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
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;

    public Receipt(String custID, DatabaseStrategy db) {
        setDb(db);
        setCustomer(db.findCustomerByID(custID));
        lineItems = new LineItem[0];
    }

    public final void addItemToReceipt(String prodID, int qty){
        LineItem item = new LineItem(prodID, qty, db);
        
        addItemToArray(lineItems, item);

    }
    private final void addItemToArray(LineItem[] origArray, LineItem item){
        LineItem[] tempArray = new LineItem[origArray.length+1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length-1] = item;
        origArray = tempArray;
        lineItems = origArray;
    }
    public String getDateTime(){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return df.format(date);
    }
    
    public final String getReceiptHeader() {
        String header = "Kohls Dept. Store  \n"
                + getDateTime() + "\n"
                + "Customer: "+getCustomer().getCustomerName() +"\n\n"
                + "ID     Product         Qty    Sub     Discount \n"
                + "--------------------------------------------------"
                ;
        return header;
    }
    public double getReceiptTotal(){
        double total = 0;
        for (LineItem item: lineItems){
            total += item.getSubtotal() - item.getDiscountAmt();
        }
        return total;
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

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    
    
}
