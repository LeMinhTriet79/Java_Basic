package thu_nghiem_kien_thuc_java_co_ban;

/**
 *
 * @author Minh Triet     Đây là những kiến thức cơ bản được viết theo kiểu Hầm Bà Lằng Xắng Cấu
 */
public class Thu_Nghiem_Kien_Thuc_Java_Co_Ban {
public static void main(String[] args) {
          // Màu đỏ (31), in đậm (1)
         System.out.println("\u001B[1;34m1.Vòng Lặp:\u001B[0m");
         System.out.println("\u001B[1;34m======================================***===========================================\u001B[0m");
         playWithFor();
         
        
    }
    
    //1.=================================================================
    private static void playWithFor(){
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Bỏ qua số 3
            }
            System.out.println("Giá trị i: " + i);
        }
    }
     private static void playWithWhile(){
         int i = 0;
         while( i < 5){
             
         }
     }
}
