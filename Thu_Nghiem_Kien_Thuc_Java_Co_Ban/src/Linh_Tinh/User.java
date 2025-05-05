/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linh_Tinh;

/**
 *
 * @author Minh Triet
 */
public class User {
    private String ten;
    private int tuoi;
    private String password;

    public User() {
    }

    public User(String ten, int tuoi, String password) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.password = password;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "ten=" + ten + ", tuoi=" + tuoi + ", password=" + password + '}';
    }
    
    
}
