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
    private DatabaseStrategy db;
    private Customer customer;
    private Product product;
    private LineItem li;
    private LineItem[] lineItems = new LineItem[3];

    public Receipt(String custID, DatabaseStrategy db) {
        setDb(db);
        setCustomer(db.findCustomerByID(custID));
    }
    public Receipt(String prodID, int qty, DatabaseStrategy db) {
        setDb(db);
        li.setProduct(db.findProductByID(prodID));
        li.setQty(qty);
        addNewLineItem();
    }
    public final void addNewLineItem(){
        for (LineItem l: lineItems){
            if(l == null){
                l = new LineItem(li.getProduct(), li.getQty(), product.getUnitCost());
            }
        }
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        // needs validation
        this.customer = customer;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
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
