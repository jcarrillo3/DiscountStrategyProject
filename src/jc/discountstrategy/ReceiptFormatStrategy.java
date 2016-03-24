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
public interface ReceiptFormatStrategy {
    public static final String ID_HEADER = "ID";
    public static final String PRODUCT_HEADER = "Product";
    public static final String QTY_HEADER = "Qty";
    public static final String SUBTOTAL_HEADER = "Subtotal";
    public static final String DISCOUNT_HEADER = "Discount";
    public static final String BEFORE_DISCOUNT_LABEL = "Total before Discount: ";
    public static final String AFTER_DISCOUNT_LABEL = "Total after Discount: ";
    public static final String TOT_SAVINGS_LABEL = "Total Savings: ";
    
    
    public abstract String getReceiptFormat(Receipt receipt);
}
