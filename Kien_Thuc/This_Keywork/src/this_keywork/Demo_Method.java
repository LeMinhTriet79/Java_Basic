/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package this_keywork;

/**
 *
 * @author Le Minh Triet
 */
public class Demo_Method {
    
    public void method_01(){
        System.out.println("Phuơng Thức 1 đã gọi lên");
    }
    
     public void method_02(){
        System.out.println("Phuơng Thức 2 gọi phuơng thức 1");
         method_01();
    }

 
}
