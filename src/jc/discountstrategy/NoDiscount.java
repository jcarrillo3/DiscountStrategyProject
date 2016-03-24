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
public class NoDiscount implements DiscountStrategy {
    private final int NO_DISCOUNT = 0;

    /**
     * Parameters are not validated:
     * @param qty
     * @param unitCost
     * 
     * @return NO_DISCOUNT (0)
     */
    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        // needs validation
        return NO_DISCOUNT; 
    }
    
}
