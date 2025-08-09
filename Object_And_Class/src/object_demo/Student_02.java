 package object_demo;
/**
 *
 * @author Le Minh Triet
 */
 //CLASS KHỞI TẠO ĐỐI TUỢNG NÀY KHÔNG CÓ SỬ DỤNG TÍNH ĐÓNG GÓI
public class Student_02 {
   int id;
   String name;
   int yob;

  public Student_02(){}
  
    public Student_02(int id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + '}';
    }
  
    
 
}
