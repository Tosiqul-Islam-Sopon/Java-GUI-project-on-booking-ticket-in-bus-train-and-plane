package Train.Classes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class UpdateT implements ActionListener
{
	static User u;
	
	JFrame f;

	JLabel l1,l2,l3,l4,l5,l6;
	
	JButton b1, b2, b3, b4, b5;
	
	JTextField tf1;
	
	JRadioButton r1, r2, r3;
	
	ButtonGroup bg1;
	
	JCheckBox c1, c2, c3, c4;
	
	JComboBox<?> combo;
	
	UpdateT(User a)
	{
		u = a;
		
		f = new JFrame();
		
		l1 = new JLabel();
		l1.setBounds(0,0,700,500);
		
		l2 = new JLabel("Enter your information");
		l2.setBounds(250,0,270,30);
		
		l3 = new JLabel("Favourite: ");
		l3.setBounds(200,100,350,30);
		
		l4 = new JLabel("Age ");
		l4.setBounds(200,240,350,30);
		
		l5 = new JLabel("Subject");
		l5.setBounds(230,50,350,30);
		
		l6 = new JLabel("Favourite company");
		l6.setBounds(320,100,350,30);
		
		tf1 = new JTextField();
		tf1.setBounds(350,246,100,25);
		
		b1 = new JButton("Pervious");  
        b1.setBounds(240,300,77,25);  
        b1.addActionListener(this);
        
        b2 = new JButton("Exit");  
        b2.setBounds(330,330,70,25);  
        b2.addActionListener(this);
        
        b3 = new JButton("Update");  
        b3.setBounds(330,300,137,25);  
        b3.addActionListener(this);
        
        b4 = new JButton("Logout");  
        b4.setBounds(240,330,77,25);  
        b4.addActionListener(this);
        
        b5 = new JButton("Next");  
        b5.setBounds(330,360,70,25);  
        b5.addActionListener(this);

        r1 = new JRadioButton("Gaming");
        r1.setBounds(200,130,100,30);
        
        r2 = new JRadioButton("traveling");
        r2.setBounds(200,160,100,30);
        
        r3 = new JRadioButton("Reading books");
        r3.setBounds(200,190,100,30);
        
        bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		
		String items[] = {"CSE", "EEE", "ARCHI"};
		combo = new JComboBox<>(items);
		combo.setBounds(280,50,90,30);
		
		c1 = new JCheckBox("Google");
		c1.setBounds(320,130,350,30);
		
		c2 = new JCheckBox("Microsoft");
		c2.setBounds(320,160,350,30);
		
		c3 = new JCheckBox("Amazan");
		c3.setBounds(320,190,350,30);
		
		c4 = new JCheckBox("SpaceX");
		c4.setBounds(320,210,350,30);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(tf1);
		f.add(combo);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(l1);
		
		f.setSize(700,500);
		f.setTitle("Update now");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			new Home(u);
			f.setVisible(false);
		}
		
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		
		if(e.getSource()==b3)
		{
			String a = null;
			
			if(r1.isSelected()==true) {a = r1.getText();}
			if(r2.isSelected()==true) {a = r2.getText();}
			if(r3.isSelected()==true) {a = r3.getText();}
			
			u.setGender(a);
			
			String b = tf1.getText();
			u.setContactNum(b);
			
			String c = combo.getSelectedItem().toString();
			u.setMajor(c);
			
			String d = null;
			String f1 = null;
			String g = null;
			String h = null;
			
			if(c1.isSelected()==true) {d = c1.getText();}
			if(c2.isSelected()==true) {f1 = c2.getText();}
			if(c3.isSelected()==true) {g = c3.getText();}
			if(c4.isSelected()==true) {h = c4.getText();}
			
			if(d!=null) {u.degrees.add(d);}
			if(f1!=null) {u.degrees.add(f1);}
			if(g!=null) {u.degrees.add(g);}
			if(h!=null) {u.degrees.add(h);}
			
			JOptionPane.showMessageDialog(null, "Info updated successfully");
			new Final(u);
			f.setVisible(false);
		}

		if(e.getSource()==b4)
		{
			new Login(u);
			f.setVisible(false);
		}

		if(e.getSource()==b5)
		{
			new Final(u);
			f.setVisible(false);
		}
	}
}
