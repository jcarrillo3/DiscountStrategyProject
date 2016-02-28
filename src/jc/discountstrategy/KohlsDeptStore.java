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
public class KohlsDeptStore implements Store {
    private final String STORE_NAME = "Kohl's Dept. Store";
    private String STORE_ID;
    
    
    @Override
    public final String getStoreName() {
        return STORE_NAME;
    }

    @Override
    public final String getStoreID() {
        return STORE_ID;
    }
    
}
