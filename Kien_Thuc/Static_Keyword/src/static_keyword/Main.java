package static_keyword;

import example.PlayWithStatic;
import example.Static_Variable;
import example.Static_Variable_02;

/**
 *
 * @author Le Minh Triet
 */
public class Main {
    /*
static nghĩa là thuộc về lớp (class), không gắn với từng đối tượng (object).
Thành viên static (biến/hàm/khối/lớp lồng) tồn tại một bản duy nhất cho mỗi class loader trong suốt vòng đời lớp.
Gọi/đụng đến qua tên lớp thay vì qua đối tượng.
    */
    
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
        System.out.println();
        
        
        /*************************************************************/
        //ĐẾM SỐ INSTANCE - SỐ ĐỐI TUỢNG ĐUỢC TẠO RA
        Static_Variable s1 = new Static_Variable();
        new Static_Variable();
        new Static_Variable();
        //Mọi object đều dùng chung một cái biến count static
        System.out.println(Static_Variable.count); //gọi thẳng cái lớp xổ ra con số 3 - do new 3 lần
        
        //Truờng hợp không sử dụng Static
        Static_Variable_02 a = new Static_Variable_02();
        Static_Variable_02 b = new Static_Variable_02();
        System.out.println(Static_Variable_02.count); //gọi thẳng qua lớp/ CLASS
        //đảm bảo là con số 1
        System.out.println(a.normalCount); //1
        System.out.println(b.normalCount); //1
        
    }
    
}
