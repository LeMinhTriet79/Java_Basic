package static_keyword;

import example.PlayWithStatic;

/**
 *
 * @author Le Minh Triet
 */
public class Main {
public static void main(String[] args) {
         // CHƠI LẦN ĐẦU ĐÉO CÓ STATIC
        System.out.println("CHƠI LẦN THỨ NHỨT/NHẤT KHÔNG DÙNG STATIC: ");
        String ten = "Văn Hoài: ";
        PlayWithStatic choi_lan_thu_nhat = new PlayWithStatic(ten);
        choi_lan_thu_nhat.daoLy(ten);
        // TAO THÍCH MUỐN SÀI THÌ NEW NEW NEW THÍCH THÌ NEW , KHÔNG THÍCH CŨNG NEW
        //NEW TỚI NỔI TRÀN BỘ NHỚ, HƯ MÁY ĐẬP MUA MÁY MỚI
        //KHÔNG NEW THÌ CHÚNG KHÔNG CHO SÀI CHO CHƠI
        String ten1 = "Khải Anh: ";
        PlayWithStatic choi_1 = new PlayWithStatic(ten1);
        choi_1.daoLy(ten1);
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
    
}
