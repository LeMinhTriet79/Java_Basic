package this_keywork;

/**
 *
 * @author Le Minh Triet
 */
public class This_Test {
    
    void display(This_Test obj){
        System.out.println("Phuơng thức này đã đuợc gọi với đối tuợng: " + obj);
    }
    
    void call(){
        display(this);
    }

    @Override
    public String toString() {
        return "This_Test{" + '}';
    }
    
    
}
