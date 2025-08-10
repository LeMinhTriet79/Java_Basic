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
public class Calculator {
    int value;

    public Calculator add(int n) {
        this.value += n;
        return this;
    }

    public Calculator multiply(int n) {
        this.value *= n;
        return this;
    }
    
    void display(){
        System.out.println("Result: " + value);
    }
    
}
