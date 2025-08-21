/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Le Minh Triet
 */
public class Static_Variable_02 {
    /*
static variable (biến tĩnh)
Tính chất
Dùng chung cho mọi object của lớp.
Khởi tạo khi lớp được initialize lần đầu; sống đến khi lớp bị dỡ (thường là hết chương trình).
Mặc định về phạm vi truy cập (public/private/...) y như biến thường.
    */
   public static int count = 0; //DÙNG CHUNG
   public int normalCount = 0; // CHIA RIÊNG RA, KHÔNG CÓ SÀI CHUNG CHO TỪNG OBJECT
    public Static_Variable_02() {
        count ++;
        normalCount ++;
    }
    
    
    
}
