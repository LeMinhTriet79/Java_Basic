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
public class Box {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }
    void tinh(double t){
        System.out.println("Test: " + this.width * this.height * this.depth * t);
    }

    @Override
    public String toString() {
        return "Box{" + "width=" + width + ", height=" + height + ", depth=" + depth + '}';
    }
    
   
}
