/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/JApplet.java to edit this template
 */
package password;
import java.awt.Container; 
import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JLabel; 
import javax.swing.JPasswordField; 
public class Password  { 
    String correctpassword = "DesignGlobal"; 
    JPasswordField jpasswordfield = new JPasswordField(10); 
public void init() { 
        Container contentPane = getContentPane(); 
        contentPane.setLayout(new FlowLayout()); 
        contentPane.add(new JLabel("Design Global password: ")); 
        contentPane.add(jpasswordfield); 
        jpasswordfield.setEchoChar('*'); 
        jpasswordfield.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                String input = new String(jpasswordfield.getPassword()); 
                if (correctpassword.equals(input)) { 
                    showStatus("Correct"); 
} else { 
                    showStatus("Incorrect"); 
                } 
            } 

}); 
    } 
} 