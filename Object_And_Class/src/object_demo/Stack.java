/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_demo;

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
            //vị trí tos = 9 tuơng đuơng là vị trí cuối cùng của mảng dành cho phần tử thứ 10
            //nghĩa là khi thêm phần tử cuối vào vị trí cuối - coi như là đầy ngăn xếp và tos có giá trị là 9
            //ở thời điểm này thì tos như là cái biến cờ và cũng là cái biến đại diện cho vị trí trong mảng
            //Nếu thêm phần tử cuối cùng vào thì tos sẽ là 9, thêm phần tử tiếp theo nữa thì lúc này tos lên 10 là tào lao
            System.out.println("Stack is full");
        else
            stck[++tos] = item; // phảu ++ truớc, vì cộng
    }
    
    
}
