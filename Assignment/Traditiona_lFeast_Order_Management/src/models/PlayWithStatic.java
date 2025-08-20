/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Le Minh Triet
 */
public class PlayWithStatic {
    String name;

    public PlayWithStatic(String name) {
        this.name = name;
    }

    public PlayWithStatic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    //KHÔNG CÓ STATIC
    public void daoLy(String name){
        System.out.println( name + "Cố gắng học hành, một ngày chỉ ngủ 8 tiếng thôi"
                + "\n đừng có ngủ trưa mà tốn thời gian code");
    }
    
    //CÓ STATIC
    public static void chuiThe(){
        System.out.println("MẸ KIẾP THỜI GIAN MÀY NẰM NGỦ NÓ"
                + "\n CÒN NHIỀU HƠN THỜI GIAN MÀY ÔN HỌC"
                + "\n ÔNG BÀ GIÀ XƯA CÓ CÂU 'THAM ĂN THÌ NGU HAM NGỦ THÌ LÚ' "
                + "\n HỌC HÀNH MÀ ĐÉO CHỊU KHÓ THÌ VĨNH VIỄN ĐÉO CÓ NGÀY THÀNH CÔNG");
    }
}
