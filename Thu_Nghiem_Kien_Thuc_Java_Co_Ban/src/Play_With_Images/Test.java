/*
Lê Minh Triết
*/
package Play_With_Images;

// Import các lớp của Swing để tạo giao diện người dùng
import javax.swing.*; 
// Import các lớp của AWT cho việc vẽ đồ họa và xử lý kích thước
import java.awt.*; 
// Import BufferedImage để lưu trữ hình ảnh
import java.awt.image.BufferedImage; 
// Import lớp File để làm việc với tệp tin hệ thống
import java.io.File; 
// Import ImageIO để đọc và ghi tệp hình ảnh
import javax.imageio.ImageIO; 

// Lớp Test kế thừa JPanel, dùng để vẽ ảnh lên giao diện
public class Test extends JPanel {
    // Biến lưu trữ đối tượng BufferedImage chứa hình ảnh đã load
    private BufferedImage img;

    // Constructor của lớp Test
    public Test() {
        try {
            // Đọc file hình ảnh "Allah_02.jpg" từ hệ thống. Hãy đảm bảo file này tồn tại tại đường dẫn chỉ định.
            img = ImageIO.read(new File("Allah_02.jpg"));
        } catch (Exception e) { 
            // Nếu có lỗi xảy ra (ví dụ: file không tồn tại hay định dạng không hợp lệ), in thông báo lỗi ra console
            System.out.println("Không thể đọc ảnh: " + e.getMessage());
        }
    }

    // Overwrite phương thức getPreferredSize để trả về kích thước của panel bằng với kích thước ảnh
    @Override
    public Dimension getPreferredSize() {
        // Nếu đã load ảnh thành công, trả về kích thước của ảnh
        if (img != null) {
            return new Dimension(img.getWidth(), img.getHeight());
        } else {
            // Nếu chưa load được ảnh, gọi getPreferredSize() của lớp cha
            return super.getPreferredSize();
        }
    }

    // Phương thức paintComponent được gọi mỗi lần panel cần vẽ lại
    @Override
    protected void paintComponent(Graphics g) {
        // Gọi phương thức của lớp cha để vẽ các thành phần cơ bản của JPanel
        super.paintComponent(g);
        // Nếu ảnh đã được load (không phải null), vẽ ảnh tại vị trí (0,0)
        if (img != null) {
            g.drawImage(img, 0, 0, this);
        }
    }

    // Phương thức main: điểm bắt đầu của chương trình
    public static void main(String[] args) {
        // Tạo một JFrame để đóng gói các thành phần giao diện
        JFrame frame = new JFrame();
        // Cài đặt hành vi đóng cửa sổ: khi đóng cửa sổ thì thoát chương trình
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tạo đối tượng panel của lớp Test chứa ảnh
        Test panel = new Test();
        // Thêm panel vào JFrame
        frame.add(panel);
        // Sử dụng phương thức pack() để tự động điều chỉnh kích thước JFrame sao cho vừa khít với kích thước của panel (với kích thước là kích thước ảnh)
        frame.pack();
        // Căn giữa cửa sổ JFrame lên chính giữa màn hình
        frame.setLocationRelativeTo(null);
        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
    
    
    //==================================================================
    //Cách cũ
    /*
        //// Import các lớp của Swing để tạo giao diện người dùng
//import javax.swing.*; 
//// Import các lớp của AWT phục vụ cho việc vẽ đồ họa
//import java.awt.*; 
//// Import BufferedImage để xử lý hình ảnh đã load
//import java.awt.image.BufferedImage; 
//// Import lớp File để làm việc với tệp trong hệ thống file
//import java.io.File; 
//// Import ImageIO để đọc và ghi tệp hình ảnh
//import javax.imageio.ImageIO; 
//
//// Định nghĩa lớp Test kế thừa JPanel, cho phép tùy chỉnh cách vẽ giao diện
//public class Test extends JPanel {
//    // Biến lưu trữ hình ảnh được load từ file
//    private BufferedImage img;
//
//    // Constructor của lớp Test
//    public Test() {
//        try {
//            // Đọc file hình ảnh "Allah_02.jpg" nằm trong cùng thư mục với chương trình
//            img = ImageIO.read(new File("Allah_02.jpg"));
//        } catch (Exception e) { // Nếu có lỗi xảy ra khi đọc file (file không tồn tại, định dạng sai,...)
//            // In ra thông báo lỗi giúp bạn biết nguyên nhân
//            System.out.println("Không thể đọc ảnh: " + e.getMessage());
//        }
//    }
//
//    // Phương thức paintComponent được gọi khi cần vẽ lại (với mỗi lần repaint)
//    @Override
//    protected void paintComponent(Graphics g) {
//        // Gọi lại phương thức paintComponent của lớp cha để đảm bảo panel được vẽ chuẩn
//        super.paintComponent(g);
//        // Kiểm tra nếu hình ảnh đã được load thành công (không null)
//        if (img != null) {
//            // Vẽ hình ảnh lên panel tại vị trí (0,0); đối số 'this' được sử dụng làm ImageObserver
//            g.drawImage(img, 0, 0, this);
//        }
//    }
//
//    // Phương thức main: điểm bắt đầu của chương trình
//    public static void main(String[] args) {
//        // Tạo cửa sổ JFrame để chứa các thành phần giao diện
//        JFrame frame = new JFrame();
//        // Tạo một đối tượng panel từ lớp Test, nơi chứa mã vẽ hình ảnh
//        Test panel = new Test();
//        // Thêm panel vào cửa sổ
//        frame.add(panel);
//        // Đặt kích thước của cửa sổ: chiều rộng 800 pixel, chiều cao 600 pixel
//        frame.setSize(800, 600);
//        // Xác định hành động khi người dùng đóng cửa sổ (thoát chương trình)
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        // Hiển thị cửa sổ lên màn hình
//        frame.setVisible(true);
//    }
    */
}

