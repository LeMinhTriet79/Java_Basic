package this_keywork;

/**
 *
 * @author Le Minh Triet
 */
public class Book {
     String title;
    double price;

    Book() {
        //this("Unknown", 0.0);  // Gọi constructor khác trong cùng class
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(title + " - " + price + "$");
    }
}
