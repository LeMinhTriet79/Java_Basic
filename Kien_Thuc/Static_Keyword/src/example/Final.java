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
        System.out.println();
    }
    class A{
        public static final int VERSION = 1;
    }
    class B { int v = A.VERSION; // 1 được "inline" vào B khi biên dịch } 
}
