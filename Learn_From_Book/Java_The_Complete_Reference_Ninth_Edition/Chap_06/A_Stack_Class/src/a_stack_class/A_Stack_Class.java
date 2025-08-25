/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_stack_class;

/**
 *
 * @author Le Minh Triet
 */
public class A_Stack_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MỖI STACK CÓ VÙNG NHỚ RIÊNG
        /*
        push tăng tos rồi gán phần tử.
        pop lấy phần tử tại tos rồi giảm tos.
        */
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        
        for(int i = 0; i < 10; i++){
            s1.push(i);
        }
        
        for(int i = 10; i < 20; i++){
            s2.push(i);
        }
        
        System.out.println("Stack s1: ");
        for(int i = 0; i < 10; i ++){
            System.out.println(s1.pop());
        }
        
        System.out.println("Stack s2: ");
        for(int i = 10; i < 20; i ++){
            System.out.println(s2.pop());
        }
        //System.out.println(s2.stck[1]);
        
    }
    
}
