package Bus;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ForgotPass implements ActionListener
{
	User u;

	JFrame f;
	
	JLabel l1,l2;
	
	JButton b1, b2, b3;
	
	JTextField tf1;
	
	ForgotPass(User a)
	{
		u=a;

		f = new JFrame();
		
		
		l1 = new JLabel();
		l1.setBounds(0,0,700,500);
		
		l2 = new JLabel(" user name:");
		l2.setBounds(200,160,90,30);
		
		tf1 = new JTextField();
		tf1.setBounds(300,160,180,30);
		
		b1 = new JButton("Password");
		b1.setBounds(240,260,90,25);
		b1.addActionListener(this);
		
		b2 = new JButton("Pervious");  
        b2.setBounds(240,300,90,25);  
        b2.addActionListener(this);
        
        b3 = new JButton("Exit");  
        b3.setBounds(240,330,90,25);  
        b3.addActionListener(this);
		
		f.add(tf1);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		
		f.setSize(700,500);
		f.setResizable(false);
		f.setTitle("Forgot Password");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==b1)
		{
			String a = tf1.getText();
			
			String oldPass = Login.forgetPass(a);
			
			if(oldPass != null)
			{
				JOptionPane.showMessageDialog(null, "Your password "+oldPass);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "invalid user name.");
			}
		}
		
		if (e.getSource()==b2)
		{
			new Login(u);
			f.setVisible(false);
		}
		
		if (e.getSource()==b3)
		{
			System.exit(0);
		}
	}
}