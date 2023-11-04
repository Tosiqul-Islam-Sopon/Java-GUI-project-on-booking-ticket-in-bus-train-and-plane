package Bus;
import LogIn.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class User_Dashboard implements ActionListener{
    static User u;
	
	JFrame f;
	
	JLabel intro;
	
	JButton previous,exit,logout,bookTicket;
	
	public User_Dashboard(User a)
	{
		u = a;
		
		f = new JFrame();

		Font f1 = new Font("Serif", Font.BOLD,22);
		
		intro = new JLabel("HAPPY TO SEE YOU "+a.getUserName());
		intro.setForeground(Color.YELLOW);
		intro.setFont(f1);
		intro.setBounds(270,176,370,23);
		
		previous = new JButton("Pervious");  
        previous.setBounds(290,250,110,25); 
        previous.setBackground(Color.WHITE);		
        previous.addActionListener(this);
        
        logout = new JButton("Logout");  
        logout.setBounds(400,280,77,25);
        logout.setBackground(Color.WHITE);		
        logout.addActionListener(this);
		
		bookTicket = new JButton("Book a Bus Ticket");  
        bookTicket.setBounds(420,250,180,25); 
        bookTicket.setBackground(Color.WHITE);		
        bookTicket.addActionListener(this);
		
        exit = new JButton("Exit");  
        exit.setBounds(20, 12, 110, 25); 
        exit.setBackground(Color.WHITE);		
        exit.addActionListener(this);

		f.add(previous);
		f.add(exit);
		f.add(logout);
		f.add(bookTicket);
		f.add(intro);
		
		f.setSize(900,600);
		f.setTitle("Home");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon logo = new ImageIcon("Bus/Resorces/logo.jpg");
		f.setIconImage(logo.getImage());

		ImageIcon background_image = new ImageIcon("Bus/Resorces/Bus.jpg");
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
		if(e.getSource()==previous)
		{
			SecondPage secondPage = new SecondPage();
			f.setVisible(false);
		}
		
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		
		if(e.getSource()==logout)
		{
			FirstPage firstPage = new FirstPage();
			f.setVisible(false);
		}
		if(e.getSource()==bookTicket)
		{	
			new Ticket_Dtails(u);
		    f.setVisible(false);
		}
	}

}
