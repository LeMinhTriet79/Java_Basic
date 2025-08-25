/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg2_overloading_constructors;

/**
 *
 * @author Le Minh Triet
 */
public class Main {
 public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10);
        Box b3 = new Box(10, 20, 30);
        
        System.out.println("Volume b1 = " + b1.volume());
        System.out.println("Volume b2 = " + b2.volume());
        System.out.println("Volume b3 = " + b3.volume());
    }
    
}
