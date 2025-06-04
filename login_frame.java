/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendancemgt;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author ashutoshdubey
 */
public class login_frame {

    JFrame frame;
    public login_frame() throws IOException {
        frame=new JFrame("LOGIN");
        JPanel panel=new JPanel();  
        panel.setBounds(0,0,840,220);    
        frame.add(panel);
        ImageIcon icon = new ImageIcon("/Users/ashutoshdubey/Downloads/image.jpg");        
             panel.add(new JLabel(icon));         
    JLabel lbl_username, lbl_password;  
    lbl_username=new JLabel("Username");  
    lbl_username.setBounds(300,300, 100,30);  
      frame.add(lbl_username);
        TextField txt_username, txt_password;    
    txt_username = new TextField("");    
    txt_username.setBounds(300, 330, 250, 30);    
    frame.add(txt_username);
      lbl_password=new JLabel("Password");  
    lbl_password.setBounds(300,380, 100,30);  
      frame.add(lbl_password);             
   JFrame f=new JFrame("Password Field Example");    
     JPasswordField value = new JPasswordField();          
    value.setBounds(300, 410, 250, 35);    
    frame.add(value);         
         
    
     Button b = new Button("Sign In");    
    b.setBounds(470,450,80,30);
    b.setBackground(Color.red);
  
  
    frame.add(b);    
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HomeScreen();
            }
        });
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        
    }
    
}
