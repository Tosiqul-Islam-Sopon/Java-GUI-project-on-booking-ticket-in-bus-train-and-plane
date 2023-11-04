package Train.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Final1T implements ActionListener {
	static UserT u;
	JFrame f;
	JButton b5, b6;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;

	Final1T(UserT a) {
		u = a;

		f = new JFrame();
		f.setLayout(null); // Use null layout for precise component positioning

		l1 = new JLabel();
		l1.setBounds(0, 0, 900, 600); // Set bounds to cover the whole frame

		JLabel thankYouLabel = new JLabel("Thank You!");
		thankYouLabel.setFont(new Font("Arial", Font.BOLD, 30));
		thankYouLabel.setForeground(Color.WHITE);
		thankYouLabel.setHorizontalAlignment(JLabel.CENTER);
		thankYouLabel.setBounds(0, 200, 900, 40); // Adjust the label position



		b5 = new JButton("Previous");
		b5.setBounds(350, 400, 110, 25);
		b5.setBackground(Color.WHITE);
		b5.addActionListener(this);

		b6 = new JButton("Exit");
		b6.setBounds(500, 400, 77, 25);
		b6.setBackground(Color.WHITE);
		b6.addActionListener(this);

		f.add(thankYouLabel);

		f.add(b5);
		f.add(b6);
		f.add(l1);

		f.setSize(900, 600);
		f.setTitle("Final page");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon background_image = new ImageIcon("picture/final.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		l1.add(background); // Add the background to the label

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b5) {
			f.setVisible(false);
			new Payment_DtailsT(u);
		} else if (e.getSource() == b6) {
			System.exit(0);
		} 
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Final1T(new UserT()); // Create an instance of User or pass an existing one
		});
	}
}






//package Classes;
//
//import java.awt.event.*;
//import java.awt.*;
//import javax.swing.*;
//
//public class Final1 implements ActionListener
//{
//	static User u;
//
//	JFrame f;
//
//	JButton b5,b6, b1, b2, b3;
//	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
//
//	Final1(User a)
//	{
//	    u = a;
//
//		f = new JFrame();
//		l1 = new JLabel();
//		l1.setBounds(0,0,700,500);
//
//
//		l2 = new JLabel("Information");
//		l2.setBounds(300,100,270,30);
//
//		l3 = new JLabel("Favourite: "+u.getGender());
//		l3.setBounds(300,130,350,30);
//
//		l4 = new JLabel("Age "+u.getContactNum());
//		l4.setBounds(300,160,350,30);
//
//		l5 = new JLabel("Subject: "+u.getMajor());
//		l5.setBounds(300,190,350,30);
//
//		l6 = new JLabel("Favourite company:  "+u.degrees.toString().replace("[","").replace("]", ""));
//		l6.setBounds(300,210,350,30);
//
//		l7 = new JLabel("Id "+u.getName());
//		l7.setBounds(300,240,350,30);
//
//		l8 = new JLabel("Username "+u.getUserName());
//		l8.setBounds(300,270,350,30);
//
//		b1 = new JButton("Pervious");
//		b1.setBounds(240,300,77,25);
//		b1.addActionListener(this);
//
//		b2 = new JButton("Exit");
//		b2.setBounds(330,330,70,25);
//		b2.addActionListener(this);
//
//		b3 = new JButton("Logout");
//		b3.setBounds(330,300,137,25);
//		b3.addActionListener(this);
//
//
//		b5 = new JButton("Previous");
//        b5.setBounds(350,400,110,25);
//b5.setBackground(Color.WHITE);
//        b5.addActionListener(this);
//
//		b6 = new JButton("Exit");
//        b6.setBounds(500,400,77,25);
//b6.setBackground(Color.WHITE);
//        b6.addActionListener(this);
//
//		f.add(b5);
//		f.add(b6);
//		f.add(l1);
//
//		f.setSize(900,600);
//		f.setTitle("Final page");
//		f.setResizable(false);
//		f.setLocationRelativeTo(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ImageIcon background_image = new ImageIcon("picture/final.jpg");
//
//		Image img = background_image.getImage();
//		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
//		background_image = new ImageIcon(temp_img);
//		JLabel background = new JLabel("", background_image, JLabel.CENTER);
//		background.setBounds(0, 0, 900, 600);
//		f.add(background);
//		f.setVisible(true);
//	}
//	public void actionPerformed(ActionEvent e)
//	{
//		if(e.getSource()==b5)
//		{f.setVisible(false);
//			new Payment_Dtails(u);
//
//		}
//
//		if(e.getSource()==b6)
//		{System.exit(0);
//
//		}
//	}
//}