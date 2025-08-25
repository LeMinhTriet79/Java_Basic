/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg1_overloading_methods;

/**
 *
 * @author Le Minh Triet
 */
public class Overload_Demo {
    //NẠP CHỒNG PHUƠNG THỨC
    //nạp chồng phương thức, nghĩa là có nhiều phương thức cùng tên trong một lớp,
    //nhưng chúng phải có danh sách tham số khác nhau.
    //Danh sách tham số khác nhau có thể là:

//Số lượng tham số khác nhau.

//Kiểu dữ liệu của tham số khác nhau.

//Thứ tự các kiểu dữ liệu của tham số khác nhau
    void test(){
        System.out.println("No parameters");
    }
    
    void test(int a){
        System.out.println("a: " + a);
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
//    public int test(int b){ //KHÔNG CHO PHÉP vì lúc này đã phiơng thức int đã tồn tại
//        System.out.println("AHIHI");
//        return b;
//    }
    // kiểu trả về của phương thức (ví dụ: void, int, double):
    //không phải là yếu tố để phân biệt các phương thức khi nạp chồng
}
