package attendancemgt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;

public class HomeScreen {
    JFrame frame;
    private Color Black;

    public HomeScreen() {
        // Creating instance of JFrame with a name
        frame = new JFrame("Home Screen");

        // Create a panel for the home screen
       JPanel panel=new JPanel();  
        panel.setBounds(0,0,850,180);    
       // panel.setBackground(Color.pink);  
        
        
        frame.add(panel);
        
        
        
        ImageIcon icon = new ImageIcon("/Users/ashutoshdubey/Downloads/image.jpg");
       
     
      panel.add(new JLabel(icon));
      
      Border border = BorderFactory.createLineBorder(Color.BLACK, 0);
        JLabel home;  
                
       JButton buttonss = new JButton("Home");
        //buttonss.setBackground(Color.red);
        buttonss.setForeground(Black);
        //buttonss.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        buttonss.setBounds(10, 180, 90, 40);
        frame.add(buttonss);
        buttonss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    new login_frame();
                } catch (IOException ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
     
     // Create three dropdown menus
        JComboBox<String> dropdown1 = new JComboBox<>();
        JComboBox<String> dropdown2 = new JComboBox<>();
        JComboBox<String> dropdown3 = new JComboBox<>();
        // Add items to the dropdown menus
        dropdown1.addItem("Assessments");
        dropdown1.addItem("Sessionals Marks");
        dropdown1.addItem("Assignments Marks");

        dropdown2.addItem("Mark Attendance(Lecture)");
        dropdown2.addItem("Mark Attendance(Practical/Tutorial)");
        dropdown2.addItem("Updated Daily Attendance");

        dropdown3.addItem("Username");
        dropdown3.addItem("Change Password");
        dropdown3.addItem("©Logout");
       

        // Set positions and sizes for the dropdown menus
        dropdown1.setBounds(110, 180, 150, 40);
          dropdown1.setBackground(Color.red);
        dropdown2.setBounds(270, 180, 150, 40);
          dropdown2.setBackground(Color.red);
        dropdown3.setBounds(700, 180, 150, 40);
          dropdown3.setBackground(Color.red);
        // Add the dropdown menus to the frame
        frame.add(dropdown1);
        frame.add(dropdown2);
        frame.add(dropdown3);
// Add ActionListener for dropdown1 (Assessments, Sessionals Marks, Assignments Marks)
        dropdown1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) dropdown1.getSelectedItem();
                if ("Assignments Marks".equals(selectedItem)) {
                    new AssignmentModule();
                } else if ("Sessionals Marks".equals(selectedItem)) {
                    new SessionalsModule();
                } else if ("Assessments".equals(selectedItem)) {
                    // Handle Assignments Marks action here
                }
            }
        });

        // Add ActionListener for dropdown2 (Mark Attendance)
        dropdown2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) dropdown2.getSelectedItem();
                if ("Mark Attendance(Practical/Tutorial)".equals(selectedItem)) {
                      new MarkAttendance();
                } else if ("Updated Daily Attendance".equals(selectedItem)) {
                      
                } else if ("Mark Attendance(Lecture)".equals(selectedItem)) {
                    // Handle Updated Daily Attendance action here
                }
            }
        });

        // Add ActionListener for dropdown3 (Username, Change Password, ©Logout)
        dropdown3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) dropdown3.getSelectedItem();
                if ("Ashutosh".equals(selectedItem)) {
                    // Handle Username action here
                } else if ("Change Password".equals(selectedItem)) {
                    try {
                        new Change_Password();
                    } catch (IOException ex) {
                        Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if ("©Logout".equals(selectedItem)) {
                                 frame.dispose(); 
                }
            }

            private void exit(int i) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        // Setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size, layout, and visibility
        frame.setSize(850, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
    }

    public static void main(String[] args) {
        new HomeScreen();
    }
}
