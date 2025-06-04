
package attendancemgt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author ashutoshdubey
 */
public class Change_Password{

    JFrame frame;
    public Change_Password() throws IOException {
        
        // creating instance of JFrame with name "first way"
        frame=new JFrame("Change Password");
      
        
        
         
        JPanel panel=new JPanel();  
        panel.setBounds(0,0,850,200);    
        //panel.setBackground(Color.pink);  
        
        //ImageIcon icon = new ImageIcon("/Users/ashutoshdubey/Downloads/image.png");
        
        frame.add(panel);
        
        ImageIcon icon = new ImageIcon("/Users/ashutoshdubey/Downloads/image.jpg");
        
        
       
     
      panel.add(new JLabel(icon));
      
      
      
    JLabel lbl_oldpassword, lbl_newpassword;  
                
    lbl_oldpassword=new JLabel("Old Password");  
    lbl_oldpassword.setBounds(300,300, 100,30);  
      frame.add(lbl_oldpassword);
    
    
    TextField txt_oldpassword, txt_newpassword;    
    txt_oldpassword = new TextField("");    
    txt_oldpassword.setBounds(300, 340, 250, 30);    
    frame.add(txt_oldpassword);

      lbl_newpassword=new JLabel("New Password");  
    lbl_newpassword.setBounds(300,390, 100,30);  
      frame.add(lbl_newpassword);           
                
                
        
    txt_oldpassword = new TextField("");    
    txt_oldpassword.setBounds(300, 420, 250, 30);  
    frame.add(txt_oldpassword);         
         
    
    
      lbl_newpassword=new JLabel("Confirm New Password");  
    lbl_newpassword.setBounds(300,460, 150,30);  
      frame.add(lbl_newpassword);           
                
                
        
    txt_oldpassword = new TextField("");    
    txt_oldpassword.setBounds(300, 490, 250, 30);  
    frame.add(txt_oldpassword);        
    
     Button b = new Button("OK");    
    b.setBounds(450,530,100,30);
    b.setBackground(Color.red);
    b.setForeground(Color.red);
  
    frame.add(b);    
      
       
     // Add ActionListener to the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                try {
                    new login_frame();
                    
                    //b.setBackground(Color.RED);
                } catch (IOException ex) {
                    Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         
        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // adds button in JFrame
     
 
        // sets 500 width and 600 height
        frame.setSize(850, 800);
         
        // uses no layout managers
        frame.setLayout(null);
         
        // makes the frame visible
        frame.setVisible(true);
        frame.setResizable(true);
        
    }

    private static class J1Panel {

        public J1Panel() {
        }
    }
    
}