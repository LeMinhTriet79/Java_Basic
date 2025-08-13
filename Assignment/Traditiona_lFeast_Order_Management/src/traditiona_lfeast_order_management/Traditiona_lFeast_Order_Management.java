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
        //String thoiGian =  timeNow();
        System.out.println("Ngày hiện tại: " + timeNow());
    }
    private static String timeNow(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm,dd-MM-yy");
        //Nếu mà ghi định dạng tháng là mm - chữ thuờng thì coi như là ra kết quả sai
        return sdf.format(now);
    }
    
}
