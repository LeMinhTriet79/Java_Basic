/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexnumber;

/**
 *
 * @author Minh Triet
 */
public class Main {
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber temp = new ComplexNumber(0, 0); //cho nó mặc định là 0 0
        
        temp.setReal(c1.getReal() + c2.getReal());
        temp.setImg(c1.getImg()+ c2.getImg());
        return temp;
    }
    public static void main(String[] args) {
       ComplexNumber c1 = new ComplexNumber(5.2, 4.4);//nhập vào phần thực và phần ảo của số phức thứ nhất
        ComplexNumber c2 = new ComplexNumber(2.0, 7.3);//nhập vào phần thực và phần ảo của số phức thứ hai
        ComplexNumber temp = sum(c1, c2);
        System.out.println("Kết quả là: "+ temp.getReal()+" + "+ temp.getImg() +"i");//hiển thị kết qua ra màn hình
    }   
    
}
