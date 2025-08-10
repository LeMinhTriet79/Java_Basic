package this_keywork;
/**
 *
 * @author Le Minh Triet
 */
public class This_Keywork {

    public static void main(String[] args) {
        Demo_Method obj = new Demo_Method();
        obj.method_02();
        
        //===========================================//
        
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", 15.5);
        
        b1.display();
        b2.display();
        
        //===================================================//
        
        This_Test t = new This_Test();
        
        t.call();
        
        //=======================================================//
        
        Calculator c = new Calculator();
        c.add(5).multiply(3).display();
    }
    
}
