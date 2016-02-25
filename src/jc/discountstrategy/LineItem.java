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
    private double subtotal;

    public LineItem(Product product, int qty, double unitPrice) {
        this.product = product;
        this.qty = qty;
        setSubtotal(unitPrice);
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getSubtotal() {
        subtotal = qty * product.getUnitCost();
        return subtotal;
    }

    public void setSubtotal(double unitPrice) {
        this.subtotal = qty * unitPrice;
    }
    
    
}
