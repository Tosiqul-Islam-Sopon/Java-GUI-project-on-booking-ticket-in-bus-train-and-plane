package Train.Classes;



import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class HomeT implements ActionListener
{
	static UserT u;

	JFrame f;

	JLabel l1, l2, l3;

	JButton b1, b2, b4, b5;

	public HomeT(UserT a)
	{
		u = a;

		f = new JFrame();
		Font f1 = new Font("Serif", Font.BOLD, 22);

		l1 = new JLabel();
		l1.setBounds(0, 0, 700, 500);

//		l2 = new JLabel("HAPPY TO SEE YOU  ==>  " + a.getUserName());
//		l2.setForeground(Color.WHITE);
//		l2.setFont(f1);
//		l2.setBounds(270, 176, 370, 23);
//
//		JPanel backgroundPanel = new JPanel();
//		backgroundPanel.setBackground(Color.DARK_GRAY);
//		backgroundPanel.setLayout(null);
		l2 = new JLabel("HAPPY TO SEE YOU");
		l2.setForeground(Color.WHITE); // Change the text color to black or another suitable color
		l2.setFont(f1);
		l2.setBounds(0, 0, 370, 23); // Adjust the bounds as needed

		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setBackground(Color.DARK_GRAY);
		backgroundPanel.setLayout(null);
		backgroundPanel.setBounds(270, 176, 370, 23); // Adjust the bounds to match the label

// Add the updated l2 label to the backgroundPanel
		backgroundPanel.add(l2);


		// Set the bounds of the backgroundPanel
		backgroundPanel.setBounds(260, 166, 390, 43);
		backgroundPanel.add(l2); // Add the label to the backgroundPanel

		l3 = new JLabel("");
		l3.setBounds(420, 300, 350, 30);

		b1 = new JButton("Previous");
		b1.setBounds(290, 250, 110, 25);
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);

		b2 = new JButton("Exit");
		b2.setBounds(20, 12, 110, 25);
		b2.setBackground(Color.WHITE);
		b2.addActionListener(this);

		b4 = new JButton("Logout");
		b4.setBounds(360, 280, 77, 25);
		b4.setBackground(Color.WHITE);
		b4.addActionListener(this);

		b5 = new JButton("Book a Train");
		b5.setBounds(420, 250, 110, 25);
		b5.setBackground(Color.WHITE);
		b5.addActionListener(this);

		f.add(b1);
		f.add(b2);
		f.add(b4);
		f.add(b5);
		f.add(l3);
		f.add(l1);
		f.add(backgroundPanel); // Add the backgroundPanel to the frame

		f.setSize(900, 600);
		f.setTitle("Home");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon background_image = new ImageIcon("Train/picture/home.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		f.add(background);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			//new Login(u);
			f.setVisible(false);
		}

		if(e.getSource()==b2)
		{
			System.exit(0);
		}

		if(e.getSource()==b4)
		{
			//new Login(u);
			f.setVisible(false);
		}
		if(e.getSource()==b5)
		{
			new Ticket_DtailsT(u);
			f.setVisible(false);
		}
	}
}







//package Classes;
//
//import java.awt.event.*;
//import java.awt.*;
//import javax.swing.*;
//
//public class Home implements ActionListener
//{
//	static User u;
//
//	JFrame f;
//
//	JLabel l1,l2,l3;
//
//	JButton b1,b2,b4,b5;
//
//	Home(User a)
//	{
//		u = a;
//
//		f = new JFrame();
//		Font f1 = new Font("Serif", Font.BOLD,22);
//
//		l1 = new JLabel();
//		l1.setBounds(0,0,700,500);
//
//		l2 = new JLabel("HAPPY TO SEE  YOU  ==>  "+a.getUserName());
//		l2.setForeground(Color.WHITE);
//		l2.setBackground(Color.DARK_GRAY);
//		l2.setFont(f1);
//		l2.setBounds(270,176,370,23);
//
//		l3 = new JLabel("");
//		l3.setBounds(420,300,350,30);
//
//		b1 = new JButton("Pervious");
//        b1.setBounds(290,250,110,25);
//        b1.setBackground(Color.WHITE);
//        b1.addActionListener(this);
//
//        b2 = new JButton("Exit");
//        b2.setBounds(20, 12, 110, 25);
//        b2.setBackground(Color.WHITE);
//        b2.addActionListener(this);
//
//        //b3 = new JButton("Next");
//        //b3.setBounds(380,250,137,25);
//       // b3.addActionListener(this);
//
//        b4 = new JButton("Logout");
//        b4.setBounds(360,280,77,25);
//        b4.setBackground(Color.WHITE);
//        b4.addActionListener(this);
//
//		b5 = new JButton("Book a Train");
//        b5.setBounds(420,250,110,25);
//        b5.setBackground(Color.WHITE);
//        b5.addActionListener(this);
//
//		f.add(b1);
//		f.add(b2);
//		//f.add(b3);
//		f.add(b4);
//		f.add(b5);
//		f.add(l2);
//		f.add(l3);
//		f.add(l1);
//
//		f.setSize(900,600);
//		f.setTitle("Home");
//		f.setResizable(false);
//		f.setLocationRelativeTo(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ImageIcon background_image = new ImageIcon("picture/home.jpg");
//
//		Image img = background_image.getImage();
//		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
//		background_image = new ImageIcon(temp_img);
//		JLabel background = new JLabel("", background_image, JLabel.CENTER);
//		background.setBounds(0, 0, 900, 600);
//			f.add(background);
//		f.setVisible(true);
//	}
//
//	public void actionPerformed(ActionEvent e)
//	{
//		if(e.getSource()==b1)
//		{
//			new Login(u);
//			f.setVisible(false);
//		}
//
//		if(e.getSource()==b2)
//		{
//			System.exit(0);
//		}
//
//		/*if(e.getSource()==b3)
//		{
//			new Update(u);
//			f.setVisible(false);
//		}*/
//
//		if(e.getSource()==b4)
//		{
//			new Login(u);
//			f.setVisible(false);
//		}
//		if(e.getSource()==b5)
//		{
//			new Ticket_Dtails(u);
//		f.setVisible(false);
//		}
//	}
//}
