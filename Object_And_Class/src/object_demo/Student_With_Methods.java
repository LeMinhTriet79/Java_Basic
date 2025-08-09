package object_demo;
/**
 *
 * @author Le Minh Triet
 */
public class Student_With_Methods {
  private int id;
  private String name;
  private int yob;

  public Student_With_Methods(){}
  
    public Student_With_Methods(int id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    //Kiểm tra tuổi bằng boolean
    public boolean check_Yob(int yob){
        return yob >= 18 ? true : false;
    }
    //Kiểm tra tuổi bằng xét tuổi rồi trả về chuỗi thông tin Rồi/Chưa
    public String kiem_tra_tuoi(int yob){
        if(yob >= 18) return "Rồi";
        
        return "Chưa";
    }
    
    public void talk(){
        System.out.println("HỌC HÀNH CHĂM CHỈ, CHỊU KHÓ CHỊU KHĂN");
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + '}';
    }
}
