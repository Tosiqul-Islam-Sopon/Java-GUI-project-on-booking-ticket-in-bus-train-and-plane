package Train.Classes;

import javax.swing.*;

import Train.Classes.HomeT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Ticket_DtailsT implements ActionListener {
    static UserT u;

    JFrame f;
    JLabel l1, l2, l3, l4, l5, l7, l8, l12;
    JComboBox<String> Jbox1, Jbox2, Jbox3, Jbox4, Jbox5;
    JButton b4, b5, b2;
    JTextField g1;
    JSpinner dateSpinner; 

    public Ticket_DtailsT(UserT a) {
        u = a;

        f = new JFrame();
        l12 = new JLabel();
        l12.setBounds(0, 0, 700, 500);

        b5 = new JButton("PREVIOUS");
        b5.setBounds(290, 490, 110, 25);
        b5.setBackground(Color.WHITE);
        b5.addActionListener(this);

        b2 = new JButton("EXIT");
        b2.setBounds(20, 12, 110, 25);
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);

        b4 = new JButton("NEXT");
        b4.setBounds(430, 490, 77, 25);
        b4.setBackground(Color.WHITE);
        b4.addActionListener(this);

        String[] str1 = {"Dhaka", "Syllet", "Chittagong", "Rajshahi", "Khulna", "Mymensing", "Tangail"};
        Jbox1 = new JComboBox<>(str1);
        Jbox1.setBounds(350, 120, 190, 30);
        Jbox1.setBackground(Color.WHITE);
        f.add(Jbox1);

        String[] str2 = {"Syllet", "Chittagong", "Rajshahi", "Khulna", "Mymensing", "Tangail"};
        Jbox2 = new JComboBox<>(str2);
        Jbox2.setBounds(350, 170, 190, 30);
        Jbox2.setBackground(Color.WHITE);
        f.add(Jbox2);

        String[] str3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        Jbox3 = new JComboBox<>(str3);
        Jbox3.setBounds(350, 420, 110, 30);
        Jbox3.setBackground(Color.WHITE);
        f.add(Jbox3);

        String[] str4 = {"First class", "Economy class", "Business class"};
        Jbox4 = new JComboBox<>(str4);
        Jbox4.setBounds(350, 270, 190, 30);
        Jbox4.setBackground(Color.WHITE);
        f.add(Jbox4);

        String[] str5 = {"A", "B", "C", "D", "E", "F", "G"};
        Jbox5 = new JComboBox<>(str5);
        Jbox5.setBounds(350, 370, 190, 30);
        Jbox5.setBackground(Color.WHITE);
        f.add(Jbox5);

        g1 = new JTextField();
        g1.setBounds(350, 320, 190, 30);
        f.add(g1);


        SpinnerDateModel dateModel = new SpinnerDateModel();
        dateSpinner = new JSpinner(dateModel);
        dateSpinner.setBounds(350, 220, 150, 30);
        f.add(dateSpinner);

        l1 = new JLabel("From");
        l1.setBounds(220, 120, 190, 30);
        l1.setForeground(Color.WHITE);
        // ... (rest of your label setup code)

        // ... (rest of your label setup code)

        f.setSize(900, 600);
        f.setTitle("Ticket_Dtails");
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon background_image = new ImageIcon("picture/pexels-adrien-olichon-2387819.jpg");

        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        background.setBounds(0, 0, 900, 600);
        f.add(background);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b5) {
            f.setVisible(false);
            new HomeT(u);
        } else if (e.getSource() == b4) {
            f.setVisible(false);
            new User_DtailsT(u);
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }
}
