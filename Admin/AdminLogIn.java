package Admin;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogIn implements ActionListener{
    JFrame adminFrame = new JFrame("Admin");
    public JButton adminLogInButton = new JButton("Log In");

    JTextField adminUserName = new JTextField("", 15);
    JPasswordField adminPassword = new JPasswordField(15);

    public AdminLogIn() {
        JPanel adminPanel = new JPanel();
        adminPanel.setLayout(null); // Using null layout for precise component placement

        JLabel userNameLabel = new JLabel("User Name");
        JLabel passWordLabel = new JLabel("Password");

        userNameLabel.setBounds(30, 20, 100, 30);
        adminUserName.setBounds(140, 20, 150, 30);
        passWordLabel.setBounds(30, 60, 100, 30);
        adminPassword.setBounds(140, 60, 150, 30);

        adminPanel.setBackground(Color.gray);
        adminPanel.add(userNameLabel);
        adminPanel.add(adminUserName);
        adminPanel.add(passWordLabel);
        adminPanel.add(adminPassword);

        adminFrame.setLayout(null);

        adminFrame.getContentPane().setBackground(new Color(220, 220, 220)); 

        adminFrame.add(adminPanel);
        adminFrame.add(adminLogInButton);

        adminPanel.setBounds(270, 200, 300, 150);
        adminLogInButton.setBounds(270, 360, 300, 40);

        adminFrame.setSize(900, 650);
        adminFrame.setVisible(true);
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        adminLogInButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        AdminSettings adminUser;

        if(e.getSource() == adminLogInButton){

            String enteredText = adminUserName.getText();
            String enteredPassword = new String(adminPassword.getPassword());
            AdminLoginInfo adminUser1 = new AdminLoginInfo("Team","Delta");


            if (adminUser1.getAdminUserName().equals(enteredText) && adminUser1.getAdminPassword().equals(enteredPassword)) {
            AdminSettings adminSettings = new AdminSettings();
            
            JOptionPane.showMessageDialog(adminFrame, "Login successful!");
            adminFrame.setVisible(false);
            } 
            else {
            JOptionPane.showMessageDialog(adminFrame, "Incorrect password. Please try again.");
            }



            

        }


    }




}
