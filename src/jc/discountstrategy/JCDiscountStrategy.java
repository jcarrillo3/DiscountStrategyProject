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
public class JCDiscountStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // KLUDGE: do configuration here
        DatabaseStrategy db = new FakeDatabase();
        
        
        // Start talking to objects
        Register register = new Register();
        register.startNewSale("100", db);
        
        // test code
//        Customer customer = register.getReceipt().getCustomer();
//        System.out.println("Customer "+ customer.getCustomerName()
//                            + " found and added to receipt");
        
        register.addItemToSale("10", 2);
        register.addItemToSale("20", 1);
        register.addItemToSale("30", 2);
        
        //test code
//        LineItem[] items = register.getReceipt().getLineItems();
//        for(LineItem item: items){
//            System.out.println(item.getProduct().getProductName());
//        }
        ReceiptOutputStrategy output = new ConsoleOutput();
        ReceiptOutputStrategy output2 = new JOptionOutput();
        register.endSale(output);
        register.endSale(output2);
    }
    
}
