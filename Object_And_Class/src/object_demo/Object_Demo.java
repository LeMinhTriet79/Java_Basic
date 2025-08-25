package object_demo;
/**
 *
 * @author Le Minh Triet
 */
public class Object_Demo {
    public static void main(String[] args) {
        Student a = new Student(1, "Nguyễn Văn Hoài" , 16);
        Student a1 = new Student();
        a1.setId(2);
        a1.setName("Nguyễn Hoàng Huy");
        a1.setYob(21);
        System.out.println(a);
        System.out.println("Lấy ra họ tên viết thuờng của a1: "  + a1.getName().toLowerCase());
        
        //===================================//
         //CLASS KHỞI TẠO ĐỐI TUỢNG NÀY KHÔNG CÓ SỬ DỤNG TÍNH ĐÓNG GÓI
        Student_02 b = new Student_02(1, "Phạm Võ Khải Anh", 21);
        
        Student_02 c = new Student_02();
        
        Student_02 d = new Student_02();
        d.id = 2;
        d.name = "Nguyễn Tuấn Thanh";
        d.yob = 21;
        
        System.out.println(b);
        System.out.println(c); //TRỐNG RỖNG, KHI SÀI PHUƠNG THỨC RỖNG THÌ PHẢI GET SET/GÁN GIÁ TRỊ
        System.out.println(d);
        //=================================//
        //Class chứa phuơng thức
        Student_With_Methods t0 = new Student_With_Methods(3, "Võ Thị Diễm Em", 17);
        System.out.println(t0);
        //hàm trả về boolean
        System.out.println("Đối tuợng " + t0.getName() +" đã đủ 18 tuổi chưa?"
                + " Câu trả lời là: " + t0.check_Yob(t0.getYob()));
       //hàm trả về chuỗi
        System.out.println("Đối tuợng này đã đủ 18 tuổi chưa?"
                + " Câu trả lời là: " + t0.kiem_tra_tuoi(t0.getYob()));
        
      Student_With_Methods t1 = new Student_With_Methods(11, "Nguyễn Văn Hoài", 19);   
        System.out.println(t1);
      System.out.println("Đối tuợng " + t1.getName() +" đã đủ 18 tuổi chưa?"
                + " Câu trả lời là: " + t1.kiem_tra_tuoi(t1.getYob()));
      t1.talk();
      System.out.println("======================");
      t0.display();
      t1.display();
      System.out.println("====================================");
        
      //Gán biến tham chiếu
      Box b1 = new Box();
      b1.width = 10;
      Box b2 = b1;
      System.out.println( "Chieu rong la: "  + b2.width);
      b2.width = 18;
      System.out.println("Chiều rộng của b1 sau khi b2 thay đổi là: " + b1.width);
      // LÝ DO LÀ CẢ b1 VÀ b2 ĐỀU CÙNG TRỎ ĐẾN 1 OBJECT DUY NHỨT/NHẤT
      //NẾU THAY ĐỔI b2.width thì b1.width cũng thay đổi, vì chúng tham chiếu cùng object
      
      //CHƠI THỬ PHUƠNG THỨC TRONG CLASS
      Box play_B = new Box();
      play_B.width = 10;
      play_B.height = 20;
      play_B.depth = 15;
      
        System.out.println("VOLUME = " + play_B.volume());
      
    }    
    
    
}
