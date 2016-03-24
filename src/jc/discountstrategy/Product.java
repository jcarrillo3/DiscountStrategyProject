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
public class Product {
    private String productID;
    private String productName;
    private double unitCost;
    private DiscountStrategy discount;

    public Product(String productID, String productName, double unitCost, DiscountStrategy discount) {
        setProductID(productID);
        setProductName(productName);
        setUnitCost(unitCost);
        setDiscount(discount);
    }

    public final String getProductID() {
        return productID;
    }
    
    /**
     * Parameters are not validated:
     * @param productID 
     */
    public final void setProductID(String productID) {
        // needs validation
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }
    
    /**
     * Parameters are not validated:
     * @param productName 
     */
    public final void setProductName(String productName) {
        // needs validation
        this.productName = productName;
    }

    public final double getUnitCost() {
        return unitCost;
    }
    
    /**
     * Parameters are not validated:
     * @param unitCost 
     */
    public final void setUnitCost(double unitCost) {
        // needs validation
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }
    
    /**
     * Parameters are not validated:
     * @param discount 
     */
    public final void setDiscount(DiscountStrategy discount) {
        // needs validation
        this.discount = discount;
    }
    
}
