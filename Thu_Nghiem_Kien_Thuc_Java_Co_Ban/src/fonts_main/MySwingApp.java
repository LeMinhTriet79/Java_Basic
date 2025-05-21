/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fonts_main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Minh Triet
 */
public class MySwingApp extends JFrame {

    public MySwingApp() {
        setTitle("Ứng dụng NetBeans với Font Tùy chỉnh");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình

        // Tải font tùy chỉnh
        // Thay "MyCustomFont.ttf" bằng tên file font thực tế của bạn
        Font myCustomFont = FontLoader.loadCustomFont("BlockCraftMedium-PVLzd.otf", 20f); 

        // Tạo panel chính để chứa các thành phần
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10)); // Thêm khoảng cách giữa các component
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Thêm padding

        JLabel label = new JLabel("Font chữ tùy chỉnh đã được áp dụng!");
        if (myCustomFont != null) {
            label.setFont(myCustomFont);
        } else {
            label.setFont(new Font("Arial", Font.BOLD, 18)); // Font dự phòng
            label.setForeground(Color.RED);
            label.setText("Lỗi: Không tải được font tùy chỉnh. Dùng font dự phòng.");
        }
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("Nhấn tôi!");
        if (myCustomFont != null) {
            button.setFont(myCustomFont.deriveFont(Font.BOLD, 16f)); // Có thể điều chỉnh kích thước hoặc style
        }

        JTextArea textArea = new JTextArea(
            "Đây là một đoạn văn bản dài hơn để kiểm tra font chữ. " +
            "Đảm bảo font hiển thị đúng trên nhiều dòng và ký tự khác nhau."
        );
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        if (myCustomFont != null) {
            textArea.setFont(myCustomFont.deriveFont(14f));
        }
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 150)); // Đặt kích thước mong muốn

        // Thêm các thành phần vào panel chính
        mainPanel.add(label, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(button, BorderLayout.SOUTH);

        // Thêm panel chính vào JFrame
        add(mainPanel);
    }

    public static void main(String[] args) {
        // Đảm bảo Swing GUI được tạo trên Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            new MySwingApp().setVisible(true);
        });
    }
}