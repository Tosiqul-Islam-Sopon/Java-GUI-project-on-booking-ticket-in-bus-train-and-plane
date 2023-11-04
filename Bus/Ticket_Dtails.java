package Bus;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Ticket_Dtails implements ActionListener
{	
	static User u;
	
	JFrame f;
	JLabel fromLabel,toLabel,dateLabel,busTypeLabel,passengerNoLabel,seatLabel,title;
	JComboBox fromBox,toBox,seatBox,busTypeBox,dateBox;
	JButton next,previous,exit;
	JLabel startLabel;
	
	Ticket_Dtails(User a)
	{
	    u = a;

		Font font = new Font("Serif", Font.BOLD,22);

		f = new JFrame();

		title = new JLabel();
        title.setText("Complete Your Ticket Information");
        title.setBounds(300, 20, 400, 50);
		title.setFont(font);
		title.setForeground(Color.RED);
        f.add(title);
		
		String[] str1 = { "Dhaka", "Syllet", "Chittagong","Rajshahi","Jashore" };
		fromBox = new JComboBox(str1);
		fromBox.setBounds(350, 120, 190, 30);
		fromBox.setBackground(Color.WHITE);
		f.add(fromBox);

		fromLabel = new JLabel("From");
		fromLabel.setBounds(220, 120, 190, 30);
		fromLabel.setForeground(Color.BLACK);
		f.add(fromLabel);
		
		String[] str2 = { "Dhaka", "Syllet", "Chittagong","Rajshahi","Jashore" };
		toBox = new JComboBox(str2);
		toBox.setBounds(350, 170, 190, 30);
		toBox.setBackground(Color.WHITE);
		f.add(toBox);

		toLabel = new JLabel("To");
		toLabel.setBounds(220, 170, 190, 30);
		toLabel.setForeground(Color.BLACK);
		f.add(toLabel);

		String[] str7 = {"9 September", "10 September", "11 September", "12 September", "13 September", "14 September", "15 September", "16 September", "17 September", "18 September"};
		dateBox = new JComboBox(str7);
		dateBox.setBounds(350, 220, 190, 30);
		dateBox.setBackground(Color.WHITE);
		f.add(dateBox);

		dateLabel = new JLabel("Date");
		dateLabel.setBounds(220, 220, 190, 30);
		dateLabel.setForeground(Color.BLACK);
		f.add(dateLabel);

		String[] str4 = { "AC", "NON AC" };
		busTypeBox = new JComboBox(str4);
		busTypeBox.setBounds(350, 270, 190, 30);
		busTypeBox.setBackground(Color.WHITE);
		f.add(busTypeBox);

		busTypeLabel = new JLabel("Bus Type");
		busTypeLabel.setBounds(220, 270, 190, 30);
		busTypeLabel.setForeground(Color.BLACK);
		f.add(busTypeLabel);
		
		String[] str3 = { "A1", "A2","A3", "A4","B1", "exit","B3", "next","C1", "C2","C3", "C4","D1", "D2","D3", "D4","E1", "E2","E3", "E4","F1", "F2","F3", "F4" };
		seatBox = new JComboBox(str3);
		seatBox.setBounds(350, 320, 190, 30);
		seatBox.setBackground(Color.WHITE);
		f.add(seatBox);

		seatLabel = new JLabel(" Seat number ");
		seatLabel.setBounds(220, 320, 190, 30);
		seatLabel.setForeground(Color.BLACK);
		f.add(seatLabel);

		previous = new JButton("PREVIOUS");  
        previous.setBounds(340,400,110,25);
        previous.setBackground(Color.BLUE);	
		previous.setForeground(Color.WHITE);	
        previous.addActionListener(this);
		f.add(previous);
		
		next = new JButton("NEXT");  
        next.setBounds(465,400,77,25); 
        next.setBackground(Color.BLUE);
		next.setForeground(Color.WHITE);		
        next.addActionListener(this);
		f.add(next);
		
		exit = new JButton("EXIT");  
        exit.setBounds(20, 12, 110, 25); 
        exit.setBackground(Color.WHITE);		
        exit.addActionListener(this);
		f.add(exit);

				
		f.setSize(900,600);
		f.setTitle("Ticket Dtails");
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
		if(e.getSource()==previous)
		{
			f.setVisible(false);
			new User_Dashboard(u);
		}
		
		else if(e.getSource()==next)
		{
			String from, to;
			from = fromBox.getSelectedItem().toString();
			to = toBox.getSelectedItem().toString();
			if (validationCheck(from, to)==false){
				JOptionPane.showMessageDialog(null, "Please select jerney start city and end city properly");
			}
			else{
				f.setVisible(false);
				new User_Dtails(u);	
			}
		}

		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
	}

	public boolean validationCheck(String from, String to){
		if (from.equals(to)){
			return false;
		}
		return true;
	}
}