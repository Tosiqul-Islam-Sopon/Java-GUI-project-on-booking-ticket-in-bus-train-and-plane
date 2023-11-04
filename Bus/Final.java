package Bus;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Final implements ActionListener
{	
	static User u;
	
	JFrame f;
	
	JButton previousBtn,exit;
	JLabel title;
	
	Final(User a)
	{
	    u = a;
		Font font = new Font("Serif", Font.BOLD,22);
		
		f = new JFrame();

		title = new JLabel();
		title.setText("Your Ticket is Booked Successfully. Happy Jerney!!!");
		title.setBounds(150, 170, 600, 30);
		title.setFont(font);
		title.setForeground(Color.BLACK);
		title.setHorizontalAlignment(JLabel.CENTER);
		f.add(title);
		
		previousBtn = new JButton("Previous");  
        previousBtn.setBounds(350,400,110,25);
		previousBtn.setBackground(Color.BLUE);
		previousBtn.setForeground(Color.WHITE);		
        previousBtn.addActionListener(this);
		f.add(previousBtn);
		
		exit = new JButton("Exit");  
        exit.setBounds(500,400,77,25);
		exit.setBackground(Color.BLUE);
		exit.setForeground(Color.WHITE);		
        exit.addActionListener(this);
		f.add(exit);
				
		f.setSize(900,600);
		f.setTitle("Final page");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon background_image = new ImageIcon("Bus/Resorces/Bus.jpg");

		ImageIcon logo = new ImageIcon("Bus/Resorces/logo.jpg");
		f.setIconImage(logo.getImage());
		
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
		if(e.getSource()==previousBtn)
		{
			f.setVisible(false);
			new Payment_Dtails(u);
		}
		
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
	}
}