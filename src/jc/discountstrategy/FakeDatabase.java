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
public class FakeDatabase {
    private Customer [] customers = {
        new Customer("100", "Bob James"),
        new Customer("101", "John James"),
        new Customer("102", "Tom James")
    };
    private Product [] products = {
        new Product("10", "Brewer's Hat", 29.95, new PercentOffDiscount(.10)),
        new Product("20", "Women's Blouse", 49.95, new FlatAmtDiscount(5.00)),
        new Product("30", "Men's Black Belt", 19.95, new NoDiscount())
    };
    
    public final Product findProductByID(String prodID){
       // needs validation
        Product product = null;
        
        for(Product p: products){
            if (p.getProductID().equals(prodID)){
                product = p;
                break;
            }
        }
        return product; 
    }
    
    public final Customer findCustomerByID(String custID){
        // needs validation
        Customer customer = null;
        
        for(Customer c: customers){
            if (c.getCustomerID().equals(custID)){
                customer = c;
                break;
            }
        }
        return customer;
    }
}
