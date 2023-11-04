package Train.Classes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class LastpageT implements ActionListener
{	
	static User u;
	
	JFrame f;
	
	JButton b5;
	JLabel l1;
	
	LastpageT(User a)
	{
	    u = a;
		
		f = new JFrame();
		l1 = new JLabel();
		l1.setBounds(0,0,700,500);
		
		b5 = new JButton("Previous");  
        b5.setBounds(290,340,77,25);  
        b5.addActionListener(this);
		
		f.add(b5);
		f.add(l1);
				
		f.setSize(700,500);
		f.setTitle("Player");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b5)
		{f.setVisible(false);
			//new Payment(u);
			
		}
	}
}