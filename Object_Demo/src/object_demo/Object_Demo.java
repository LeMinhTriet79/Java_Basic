package object_demo;
/**
 *
 * @author Le Minh Triet
 */
public class Object_Demo {
    public static void main(String[] args) {
        Student a = new Student(1, "Nguyễn Văn Hoài" , 16);
        System.out.println(a);
        
        //===================================//
         //CLASS KHỞI TẠO ĐỐI TUỢNG NÀY KHÔNG CÓ SỬ DỤNG TÍNH ĐÓNG GÓI
        Student_02 b = new Student_02(1, "Phạm Võ Khải Anh", 21);
        
        Student_02 c = new Student_02();
        
        Student_02 d = new Student_02();
        d.
        
        System.out.println(b);
        System.out.println(c); //TRỐNG RỖNG, KHI SÀI PHUƠNG THỨC RỖNG THÌ PHẢT GET SET
        
    }    
}
