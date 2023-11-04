package Train.Classes;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class User_DtailsT implements ActionListener
{	
	static UserT u;
	
	JFrame f;
	
	JLabel label1,label4,label5,label6,label7,label8;
	JTextField tf1,tf2,tf3,tf4;
	JTextField pf;
	
	JButton b4,b5;
	JLabel l1;
	
	User_DtailsT(UserT a)
	{
	    u = a;
		
		f = new JFrame();
		l1 = new JLabel();
		l1.setBounds(0,0,700,500);
		
		b4 = new JButton("Next");  
        b4.setBounds(500,400,77,25);
        b4.setBackground(Color.WHITE);		
        b4.addActionListener(this);
		
		b5 = new JButton("Previous");  
        b5.setBounds(350,400,110,25);
        b5.setBackground(Color.WHITE);		
        b5.addActionListener(this);
		
		label1 = new JLabel();
        label1.setText("Complete Your Information");
        label1.setBounds(370, 20, 200, 50);
		label1.setForeground(Color.WHITE);
        f.add(label1);

        label4 = new JLabel("Your full name");
        label4.setBounds(230, 180, 120, 50);
		label4.setForeground(Color.WHITE);
        f.add(label4);
		
		label5 = new JLabel("your phone number");
        label5.setBounds(230, 220, 120, 50);
		label5.setForeground(Color.WHITE);
        f.add(label5);
		
		label6 = new JLabel("GENDER");
        label6.setBounds(230, 310, 120, 50);
		label6.setForeground(Color.WHITE);
        f.add(label6);
		
		label7 = new JLabel("AGE");
        label7.setBounds(420, 310, 500, 50);
		label7.setForeground(Color.WHITE);
        f.add(label7);
		
		label8 = new JLabel("Email");
        label8.setBounds(230, 260, 120, 50);
		label8.setForeground(Color.WHITE);
        f.add(label8);
		
		tf1 = new JTextField();
        tf1.setBounds(370, 190, 235, 30);
        f.add(tf1);
		
		tf2 = new JTextField();
        tf2.setBounds(370, 230, 235, 30);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        f.add(tf2);
		
		tf3 = new JTextField();
        tf3.setBounds(320, 320, 90, 30);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        f.add(tf3);
		
		pf = new JTextField();
        pf.setBounds(525, 320, 80, 30);
        pf.setHorizontalAlignment(JTextField.CENTER);
        f.add(pf);


        tf4 = new JTextField();
        tf4.setBounds(370, 270, 235, 30);
        tf4.setHorizontalAlignment(JTextField.CENTER);
        f.add(tf4);  

		
		f.add(b5);
		f.add(b4);
		f.add(l1);
				
		f.setSize(900,600);
		f.setTitle("User_Dtails");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon background_image = new ImageIcon("picture/pexels-daniel-absi-952670.jpg");

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
		if(e.getSource()==b5)
		{f.setVisible(false);
			new Ticket_DtailsT(u);
			
		}
		if(e.getSource()==b4)
		{f.setVisible(false);
			new Payment_DtailsT(u);
			
		}
	}
}