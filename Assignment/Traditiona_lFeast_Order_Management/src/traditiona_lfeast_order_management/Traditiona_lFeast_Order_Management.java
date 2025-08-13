/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traditiona_lfeast_order_management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Minh Triet
 */
public class Traditiona_lFeast_Order_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //String thoiGian =  timeNow();
  
        String fileName = "Ghi_File.txt";
        String noiDung = "Ngày hiện tại: " + timeNow();
         
    }
    private static String timeNow(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm,dd-MM-yy");
        //Nếu mà ghi định dạng tháng là mm - chữ thuờng thì coi như là ra kết quả sai
        return sdf.format(now);
    }
    
    //Ghi file
    private static void writeToFile(String fileName, String content){
        try(BufferedWriter viet = new BufferedWriter(new FileWriter(fileName, true))){
            viet.write(content);
            viet
        } catch (IOException ex) {
            Logger.getLogger(Traditiona_lFeast_Order_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
