/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiem_tra_nam_nhuan;

import java.util.Scanner;

/**
 *
 * @author Minh Triet
 */
public class Kiem_Tra_Nam_Nhuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập năm: ");
        int year = sc.nextInt();
        sc.close(); // rò rỉ tài nguyên
        boolean check = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            check = true;
        }
        if(check){
            System.out.println("Năm nhuận");
        }else{
            System.out.println("Không phải năm nhuận");
        }
    }

}
