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
        System.out.println(a1.getName().toLowerCase());
        
        //===================================//
         //CLASS KHỞI TẠO ĐỐI TUỢNG NÀY KHÔNG CÓ SỬ DỤNG TÍNH ĐÓNG GÓI
        Student_02 b = new Student_02(1, "Phạm Võ Khải Anh", 21);
        
        Student_02 c = new Student_02();
        
        Student_02 d = new Student_02();
        d.id = 2;
        d.name = "Nguyễn Tuấn Thanh";
        d.yob = 21;
        
        System.out.println(b);
        System.out.println(c); //TRỐNG RỖNG, KHI SÀI PHUƠNG THỨC RỖNG THÌ PHẢT GET SET
        System.out.println(d);
    }    
}
