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
import models.PlayWithStatic;

/**
 *
 * @author Le Minh Triet
 */
public class Traditiona_lFeast_Order_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //String thoiGian =  timeNow();
  
        String fileName = "Ghi_File.txt";
        String noiDung = "Ngày hiện tại: " + timeNow();
       // System.out.println(noiDung);
        
          //writeToFile(fileName, noiDung);
          //readFromFile(fileName);
        
        // CHƠI LẦN ĐẦU ĐÉO CÓ STATIC
        System.out.println("CHƠI LẦN THỨ NHỨT/NHẤT KHÔNG DÙNG STATIC: ");
        String ten = "Văn Hoài: ";
        PlayWithStatic choi_lan_thu_nhat = new PlayWithStatic(ten);
        choi_lan_thu_nhat.daoLy(ten);
        System.out.println(choi_lan_thu_nhat.count());
        // TAO THÍCH MUỐN SÀI THÌ NEW NEW NEW THÍCH THÌ NEW , KHÔNG THÍCH CŨNG NEW
        //NEW TỚI NỔI TRÀN BỘ NHỚ, HƯ MÁY ĐẬP MUA MÁY MỚI
        //KHÔNG NEW THÌ CHÚNG KHÔNG CHO SÀI CHO CHƠI
        String ten1 = "Khải Anh: ";
        PlayWithStatic choi_1 = new PlayWithStatic(ten1);
        choi_1.daoLy(ten1);
        System.out.println(choi_1.count());
        // cứ thế mà tạo thêm nhiều đối tuợng chơi 2, chơi 3, chơi 4, chơi 5...
        //CHO HAO TỔN RAM CHƠI
        //=============================================//
       
        //CHƠI CÓ STATIC 
        //TAO ĐÉO CẦN NEW ĐỐI TUỢNG GÌ HẾT, HỔNG TẠO GÌ HẾT
        //QUẤT THẲNG
        System.out.println(); //xuống dòng nó như cái dấu ENTER, cho dễ nhìn
        System.out.println("CHƠI LẦN THỨ NHÌ: CÓ DÙNG STATIC");
        PlayWithStatic.chuiThe();
        
        
        
    }
    private static String timeNow(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss, dd-MM-yy");
        //Nếu mà ghi định dạng tháng là mm - chữ thuờng thì coi như là ra kết quả sai
        return sdf.format(now);
    }
    
    //Ghi file
    private static void writeToFile(String fileName, String noiDung){
        try(BufferedWriter viet = new BufferedWriter(new FileWriter(fileName, true))){
            viet.write(noiDung);
            viet.newLine();
            System.out.println("Ghi file thành công!!!");
        } catch (IOException ex) {
            Logger.getLogger(Traditiona_lFeast_Order_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void readFromFile(String fileName){
        try(BufferedReader doc = new BufferedReader(new FileReader(fileName))){
            String line;
            System.out.println("Nội dung file: ");
            while ((line = doc.readLine()) != null) {                
                System.out.println(line);
            }
        
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(Traditiona_lFeast_Order_Management.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Traditiona_lFeast_Order_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
