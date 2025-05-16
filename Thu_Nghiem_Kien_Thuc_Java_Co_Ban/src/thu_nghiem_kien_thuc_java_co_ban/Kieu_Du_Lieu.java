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

byte : It is 1 byte(8-bits) integer data type. 
Value range from -128 to 127. 
Default value zero. example: byte b=10;

short : It is 2 bytes(16-bits) integer data type. 
Value range from -32768 to 32767. 
Default value zero. example: short s=11;

int : It is 4 bytes(32-bits) integer data type. 
Value range from -2147483648 to 2147483647. 
Default value zero. example: int i=10;

long : It is 8 bytes(64-bits) integer data type. 
Value range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. 
Default value zero. example: long l=100012;  
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
        
/*
      Floating-Point Number
This group includes float, double

float : It is 4 bytes(32-bits) float data type. 
        Default value 0.0f. example: float ff=10.3f;

double : It is 8 bytes(64-bits) float data type. 
        Default value 0.0d. example: double db=11.123;  
*/
// float type
    	float f = 20.25f;
    	System.out.println("f= "+f);
    	
    	// double type
    	double d = 20.25;
    	System.out.println("d= "+d);
        
/*
  Characters
This group represent char, which represent symbols in a character set, like letters and numbers.

char : It is 2 bytes(16-bits) unsigned unicode character. 
        Range 0 to 65,535. example: char c='a';      
*/        

     char ch = 'S';
        System.out.println(ch);
        
        char ch2 = '&';
        System.out.println(ch2);
        
        char ch3 = '$';
        System.out.println(ch3);
        
        char ch4 = 0;
        System.out.println(ch4 + "Khoảng trắng");
        
        //Lỗi - Range 0 to 65,535
//        char ch5 = -1;
//        System.out.println(ch5);

        char ch6 = 64;
        System.out.println(ch6 + " chữ A còng");
        
        char ch7 = 65535;
        System.out.println(ch7 + " ");
    }
}
