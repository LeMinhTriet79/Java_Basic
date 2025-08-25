/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg15_a_stack_class;

/**
 *
 * @author Le Minh Triet
 */
public class Stack {
    //Lớp Stack cho tối đa 10 phần tử
    int stck[] = new int[10];
    int tos;

    public Stack() {
        tos = - 1 ; //Lý do cho nó bằng trừ 1 là dùng nó như số thứ tự vị trí mảng
        //để thêm phần tử về sau , ví dụ vị trí 0 , 1 , 2 ,   ...
      //Nó sẽ đuợc khởi tạo mặt định trong cái QUẶN RỖNG/TRỐNG
    }
    
    //THÊM - PUSH
    void push(int item) {
        if(tos == 9) //nghĩa là mình cho nó cái mảng này có 10 phần tử là tối đa
            //vị trí tos = 9 nghĩa là vị trí cuối cùng của mảng
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
    
    
}
