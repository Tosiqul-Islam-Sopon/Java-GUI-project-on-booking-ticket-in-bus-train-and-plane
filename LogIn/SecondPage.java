package LogIn;

import Plane.TicketBookingPage;
import Bus.User;
import Bus.User_Dashboard;
import Train.Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondPage implements ActionListener {

    JFrame frame = new JFrame("Travel Agency Management System");

    JButton planeButton = new JButton("Plane");
    JButton trainButton = new JButton("Train");
    JButton busButton = new JButton("Bus");

    public SecondPage() {
        frame.setLayout(null);

        JLabel label = new JLabel("How do you want to travel");
        Font font = new Font("Arial", Font.BOLD, 20);
        label.setFont(font);

        planeButton.setBounds(600, 100, 200, 60);
        trainButton.setBounds(600, 200, 200, 60);
        busButton.setBounds(600, 300, 200, 60);

        label.setBounds(300, 10, 300, 30);

        frame.add(label);
        frame.add(planeButton);
        frame.add(trainButton);
        frame.add(busButton);

        frame.setSize(900, 650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        busButton.addActionListener(this);
        planeButton.addActionListener(this);
        trainButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == busButton) {
            String userFileName = "users.txt";

            String username = UserInformation.getUsername(userFileName);
            String password = UserInformation.getPassword(userFileName);

            User u = new User(username, password);
            new User_Dashboard(u);
            frame.setVisible(false);
        }
        if (e.getSource() == planeButton) {
            TicketBookingPage ticketBookingPage = new TicketBookingPage();
            ticketBookingPage.setVisibility();
            frame.setVisible(false);
        }        
        if (e.getSource() == trainButton) {
            UserT user=new UserT();


            HomeT home=new HomeT(user);
            frame.setVisible(false);
        }
    }
}
