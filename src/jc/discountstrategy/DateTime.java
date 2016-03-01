/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.discountstrategy;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Juan
 */
public class DateTime {

    public String getDateTime() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return df.format(date);
    }
    
}
