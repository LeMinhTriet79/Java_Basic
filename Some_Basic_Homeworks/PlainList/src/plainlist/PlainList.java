/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plainlist;

/**
 *
 * @author Minh Triet
 */
import javax.swing.JList; 
import javax.swing.JPanel; 
import javax.swing.JFrame; 
import javax.swing.DefaultListModel; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 
public class PlainList { 
    public static void main(String args[]) { 
        JFrame frame = new JFrame("Design Global"); 
        frame.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { 
                System.exit(0); 
            } 
        }); 
        // Use a list model that allows for updates 
        DefaultListModel model = new DefaultListModel(); 
        JList statusList = new JList(model); 
        statusList.setSize(120, 60); 
        // Create some dummy list items 
        model.addElement("Thoi Trang"); 
        model.addElement("Do hoa"); 
        model.addElement("الله"); 
        // Display the list  
        JPanel panel = new JPanel(); 
        panel.add(statusList); 
        frame.getContentPane().add("Center", panel); 
        frame.pack(); 
        frame.setVisible(true); 
    } 
} 