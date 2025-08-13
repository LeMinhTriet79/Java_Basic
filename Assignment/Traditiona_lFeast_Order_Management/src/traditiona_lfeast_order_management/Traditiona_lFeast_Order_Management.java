/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traditiona_lfeast_order_management;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Le Minh Triet
 */
public class Traditiona_lFeast_Order_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String thoiGian =  timeNow();
        System.out.println("Ngày hịên tại: " + timeNow());
    }
    private static String timeNow(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
        return sdf.format(now);
    }
    
}
