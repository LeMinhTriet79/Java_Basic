/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thu_nghiem_kien_thuc_java_co_ban;

/**
 *
 * @author Minh Triet
 */
public class Kieu_Du_Lieu {
    public static void main(String[] args) {
        //byte : It is 1 byte(8-bits) integer data type. 
        //Value range from -128 to 127. Default value zero.
        byte a = -128;
        System.out.println("a: "+ a);
        byte b = 127 ;
        System.out.println("b: "+ b);
        //Gãy cổ
//        byte c = -129 ;
//        System.out.println("c: "+ c);
//        byte d = 128 ;
//        System.out.println("d: "+ d);

/*
Integer
This group includes byte, short, int, long

byte : It is 1 byte(8-bits) integer data type. Value range from -128 to 127. Default value zero. example: byte b=10;

short : It is 2 bytes(16-bits) integer data type. Value range from -32768 to 32767. Default value zero. example: short s=11;

int : It is 4 bytes(32-bits) integer data type. Value range from -2147483648 to 2147483647. Default value zero. example: int i=10;

long : It is 8 bytes(64-bits) integer data type. Value range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Default value zero. example: long l=100012;  
*/

    // short type
    	short s = 20;
    	System.out.println("s= "+s);
    	
    	// int type
    	int i = 20;
    	System.out.println("i= "+i);
    	
    	// long type
    	long l = 20;
    	System.out.println("l= "+l);
    }
}
