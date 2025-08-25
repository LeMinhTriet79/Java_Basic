/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Le Minh Triet
 */
public class Final {
    public static void main(String[] args) {
        System.out.println(A.VERSION);
        B t1 = new B();
        System.out.println(t1.v);
    }
    static class A{
        public static final int VERSION = 3;
    }
    static class B { 
        int v = A.VERSION; // 1 được "inline" vào B khi biên dịch 

        public B() {
        }
        
    }
}
