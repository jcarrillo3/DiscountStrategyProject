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
public class LineItem {
    private Product product;
    private int qty;

    public LineItem(String prodID, int qty, DatabaseStrategy db) {
        setProduct(db.findProductByID(prodID));
        this.qty = qty;
    }
    
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        // needs validation
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        // needs validation
        this.qty = qty;
    }

//    public double getSubtotal() {
//        subtotal = qty * product.getUnitCost();
//        return subtotal;
//    }
//
//    public void setSubtotal(double unitPrice) {
//        this.subtotal = qty * unitPrice;
//    }
    
    
}
