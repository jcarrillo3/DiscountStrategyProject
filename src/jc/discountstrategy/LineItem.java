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
    
    public final String getLineItemData(){
        String data = product.getProductID() + "    " + product.getProductName()
                + "\t " + qty + "\t" + this.getSubtotal() + "\t  "
                + product.getDiscount().getDiscountAmt(qty, product.getUnitCost());
        return data;
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

    public final double getSubtotal() {
        return product.getUnitCost() * qty;
    }
    
    public final double getDiscountAmt() {
        return product.getDiscount().getDiscountAmt(qty, product.getUnitCost()) * qty;
    }

    
    
}
