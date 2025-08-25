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
public class Box {
    double width, height, depth;

    //Constructor không tham số
    public Box() {
    }
    
    //Constructor có một tham số (hình lập phuơng)
    Box(double len){
        width = height = depth = len;
    }
    
    //constructor có 3 tham số

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
   double volume(){
      return width * height * depth;
   }
}
