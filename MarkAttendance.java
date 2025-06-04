package attendancemgt;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.RED;
import static java.awt.Color.black;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;

public class MarkAttendance {

    JFrame frame;
    private Color Black;

    public MarkAttendance() {
        // Creating instance of JFrame with a name
        frame = new JFrame("Home Screen");

        // Create a panel for the home screen
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1170, 180);
        // panel.setBackground(Color.pink);  

        frame.add(panel);

        ImageIcon icon = new ImageIcon("/Users/ashutoshdubey/Downloads/image.jpg");

        panel.add(new JLabel(icon));

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
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
               
                new HomeScreen();
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
        dropdown1.setBounds(100, 180, 200, 40);
        dropdown1.setBackground(Color.red);
        dropdown2.setBounds(320, 180, 200, 40);
        dropdown2.setBackground(Color.red);
        dropdown3.setBounds(850, 180, 150, 40);
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

        Border labelBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        //imageLabel.setBorder(labelBorder);
        JLabel AM;
        AM = new JLabel("         Mark Attendance");
        AM.setBounds(600, 224, 200, 30);
        AM.setBorder(labelBorder);
        AM.setBackground(Color.RED);
        AM.setOpaque(true);
        frame.add(AM);

        //Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        JLabel homes;

        homes = new JLabel("Sr.No.");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(10, 258, 50, 40);
        frame.add(homes);

        homes = new JLabel("Class");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(60, 258, 60, 40);
        frame.add(homes);

        homes = new JLabel("Section");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(120, 258, 100, 40);
        frame.add(homes);

        homes = new JLabel("Subject code");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(220, 258, 120, 40);
        frame.add(homes);

        homes = new JLabel("Subject Title");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(340, 258, 170, 40);
        frame.add(homes);

        homes = new JLabel("Semester");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(510, 258, 70, 40);
        frame.add(homes);

        homes = new JLabel("Subject Type");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(580, 258, 100, 40);
        frame.add(homes);

        homes = new JLabel("ContactHoursPerWeek");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(680, 258, 170, 40);
        frame.add(homes);

        homes = new JLabel("TeacherType(subject/adjustment)");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(850, 258, 150, 40);
        frame.add(homes);

        homes = new JLabel("");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(1000, 258, 150, 40);
        frame.add(homes);

        homes = new JLabel("");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(1150, 258, 100, 40);
        frame.add(homes);

        homes = new JLabel("");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(1250, 258, 150, 40);
        frame.add(homes);


        //JLabel homes;  
        homes.setBackground(yellow);
        homes = new JLabel("1");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(10, 298, 50, 60);
        frame.add(homes);

        homes = new JLabel("BCA");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(60, 298, 60, 60);
        frame.add(homes);

        homes = new JLabel("A");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(120, 298, 100, 60);
        frame.add(homes);

        homes = new JLabel("UGCA(1932)");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(220, 298, 120, 60);
        frame.add(homes);

        homes = new JLabel("Programming in Java");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(340, 298, 170, 60);
        frame.add(homes);

        homes = new JLabel("5");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(510, 298, 70, 60);
        frame.add(homes);

         homes = new JLabel("T");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(580, 298, 100, 60);
        frame.add(homes);

        
         homes = new JLabel("4");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(680, 298, 170, 60);
        frame.add(homes);
        
         homes = new JLabel("SubjectTeacher");
        homes.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        homes.setBounds(850, 298, 150, 60);
        frame.add(homes);
        
        
        
        
        
        
        
        JButton butto = new JButton("MarkDailyAttendance");
        butto.setBackground(Color.red);
        butto.setForeground(red);
        butto.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        butto.setBounds(1000, 298, 150, 60);
        frame.add(butto);
        butto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

      
        JButton buttons = new JButton("Details");
        buttons.setBackground(Color.red);
        buttons.setForeground(red);
        buttons.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        buttons.setBounds(1150, 298, 100, 60);
        frame.add(buttons);
        buttons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

       
        JButton buttonn = new JButton("CourseDelivery");
        buttonn.setBackground(Color.red);
        buttonn.setForeground(red);
        buttonn.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        buttonn.setBounds(1250, 298, 150, 60);
        frame.add(buttonn);
        buttonn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Button clicked!");
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
        new AssignmentModule();
    }
}
