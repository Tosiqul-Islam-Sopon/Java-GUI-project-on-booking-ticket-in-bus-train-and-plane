package LogIn;

import Admin.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstPage implements ActionListener {
    JFrame frame = new JFrame("Travel Agency Management System");
    JButton logIn = new JButton("Log In");
    JButton createAccount = new JButton("Create Account");
    JButton adminButton = new JButton("Admin"); 

    JTextField userName = new JTextField("User Name", 15);
    JPasswordField passWord = new JPasswordField(15);

    public FirstPage() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel wlc = new JLabel("Welcome to our Travel Agency Management System!");
        Font font = new Font("Arial", Font.BOLD, 25);
        wlc.setFont(font);

        JLabel description1 = new JLabel("Are you ready to embark on an extraordinary journey?");
        JLabel description2 = new JLabel("Our Travel Agency Management System offers a world of ");
        JLabel description3 = new JLabel("possibilities, enabling you to explore the globe like ");
        JLabel description4 = new JLabel("never before. Whether you dream of soaring through the ");
        JLabel description5 = new JLabel("skies on a plane, embracing the scenic routes of trains, ");
        JLabel description6 = new JLabel("or immersing yourself in the charm of bus travel, our");
        JLabel description7 = new JLabel("platform caters to all your wanderlust desires.");

        panel.setBackground(Color.gray);
        panel.add(userName);
        panel.add(passWord);
        panel.add(logIn);
        panel.add(createAccount);
        panel.add(adminButton);

        frame.setLayout(null);
        frame.add(wlc);
        frame.add(description1);
        frame.add(description2);
        frame.add(description3);
        frame.add(description4);
        frame.add(description5);
        frame.add(description6);
        frame.add(description7);
        frame.add(panel);


        wlc.setBounds(30, 20, 800, 30);
        description1.setBounds(30, 55, 850, 15);
        description2.setBounds(30, 72, 850, 15);
        description3.setBounds(30, 89, 850, 15);
        description4.setBounds(30, 106, 850, 15);
        description5.setBounds(30, 123, 850, 15);
        description6.setBounds(30, 140, 850, 15);
        description7.setBounds(30, 157, 850, 15);
        panel.setBounds(400, 200, 300, 150);

        logIn.setBounds(30, 330, 300, 100);
        createAccount.setBounds(300, 330, 150, 30);


        adminButton.setBounds(750, 20, 120, 30);

        

        frame.setSize(900, 650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logIn.addActionListener(this);
        createAccount.addActionListener(this);
        adminButton.addActionListener(this);
    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logIn) {
            String enteredName = userName.getText();
            String enteredPassword = new String(passWord.getPassword());

            // Check the entered username and password 
            int loginStatus = UserInformation.checkUser(enteredName, enteredPassword, "users.txt");


            if (loginStatus == 1) {
                // Successful 
                
                SecondPage secondPage = new SecondPage();
                frame.setVisible(false);  // Hide the current frame
            } else if (loginStatus == 2) {
                // Incorrect password
                JOptionPane.showMessageDialog(frame, "Incorrect password. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // User not found
                JOptionPane.showMessageDialog(frame, "User not found. Please create an account or check your credentials.", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        if (e.getSource() == createAccount) {
            
            CreateAccount createAccount = new CreateAccount();
            frame.setVisible(false);  
        }


        if (e.getSource() == adminButton) {

            frame.setVisible(false);
            AdminLogIn adminLogIn = new AdminLogIn();
            }


    } 
}
