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
public class FlatAmtDiscount implements DiscountStrategy {
    private double discountRate;

    public FlatAmtDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }
    
    /**
     * Parameters are not validated:
     * @param qty
     * @param unitCost
     * @return 
     */
    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        // needs validation
        return discountRate; 
    }

    public final double getDiscountRate() {
        return discountRate;
    }
    
    /**
     * Parameters are not validated:
     * @param discountRate 
     */
    public final void setDiscountRate(double discountRate) {
        // needs validation
        this.discountRate = discountRate;
    }
    
}
