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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Overload_Demo ob = new Overload_Demo();
        double result;
        
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
    
}
