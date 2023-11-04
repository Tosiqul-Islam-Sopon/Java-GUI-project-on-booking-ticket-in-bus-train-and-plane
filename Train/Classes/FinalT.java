package Train.Classes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FinalT implements ActionListener
{
	static UserT u;
	
	JFrame f;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	
	JButton b1,b2,b3;
	
	FinalT(User a)
	{
		u = a;
		
		f = new JFrame();
		
		l1 = new JLabel();
		l1.setBounds(0,0,700,500);
		
		l2 = new JLabel("Information");
		l2.setBounds(300,100,270,30);
		
		l3 = new JLabel("Favourite: "+u.getGender());
		l3.setBounds(300,130,350,30);
		
		l4 = new JLabel("Age "+u.getContactNum());
		l4.setBounds(300,160,350,30);
		
		l5 = new JLabel("Subject: "+u.getMajor());
		l5.setBounds(300,190,350,30);
		
		l6 = new JLabel("Favourite company:  "+u.degrees.toString().replace("[","").replace("]", ""));
		l6.setBounds(300,210,350,30);
		
		l7 = new JLabel("Id "+u.getName());
		l7.setBounds(300,240,350,30);
		
		l8 = new JLabel("Username "+u.getUserName());
		l8.setBounds(300,270,350,30);
		
		b1 = new JButton("Pervious");  
        b1.setBounds(240,300,77,25);  
        b1.addActionListener(this);
        
        b2 = new JButton("Exit");  
        b2.setBounds(330,330,70,25);  
        b2.addActionListener(this);
        
        b3 = new JButton("Logout");  
        b3.setBounds(330,300,137,25);  
        b3.addActionListener(this);
		
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
		f.add(l1);
		
		f.setSize(700,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Final page");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			new Update(u);
			f.setVisible(false);
		}
		
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		
		if(e.getSource()==b3)
		{
			new Login(u);
			f.setVisible(false);
		}
	}
}
