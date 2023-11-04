package Bus;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.AbstractDocument;

public class Payment_Dtails implements ActionListener
{	
	static User u;
	
	JFrame f;
	JLabel title,numberLabel,pinLabel;
	JTextField numberText;
	JButton nextBtn,previousBtn;
	JPasswordField pinText;
	
	Payment_Dtails(User a)
	{
	    u = a;

		Font font1 = new Font("Serif", Font.BOLD,22);
		
		f = new JFrame();
		
		title = new JLabel();
        title.setText("Complete Your Payment ");
        title.setBounds(360, 20, 300, 50);
		title.setFont(font1);
		title.setForeground(Color.RED);
        f.add(title);

        numberLabel = new JLabel("Enter Your Bkash Number");
        numberLabel.setBounds(220, 180, 150, 50);
		numberLabel.setForeground(Color.BLACK);
        f.add(numberLabel);

		numberText = new JTextField();
        numberText.setBounds(380, 190, 180, 30);
		numberText.setHorizontalAlignment(JTextField.CENTER);
		((AbstractDocument) numberText.getDocument()).setDocumentFilter(new NumberFilter());
        f.add(numberText);
		
		pinLabel = new JLabel("Your Bkash Pin");
        pinLabel.setBounds(220, 220, 120, 50);
		pinLabel.setForeground(Color.BLACK);
        f.add(pinLabel);

		pinText = new JPasswordField();
        pinText.setBounds(380, 230, 180, 30);
        pinText.setHorizontalAlignment(JPasswordField.CENTER);
		((AbstractDocument) pinText.getDocument()).setDocumentFilter(new NumberFilter());
        pinText.setEchoChar('*');
        f.add(pinText);

		nextBtn = new JButton("Next");  
        nextBtn.setBounds(500,340,77,25);
		nextBtn.setBackground(Color.BLUE);	
		nextBtn.setForeground(Color.WHITE);		
        nextBtn.addActionListener(this);
		f.add(nextBtn);
		
		previousBtn = new JButton("Previous");  
        previousBtn.setBounds(350,340,110,25);
		previousBtn.setBackground(Color.BLUE);	
		previousBtn.setForeground(Color.WHITE);		
        previousBtn.addActionListener(this);
		f.add(previousBtn);
				
		f.setSize(900,600);
		f.setTitle("Payment Dtails");
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
			new User_Dtails(u);
		}
		
		if(e.getSource()==nextBtn)
		{
			String num,pin;
			num = numberText.getText();
			pin = pinText.getText();
			if (validationCheck(num, pin)==false){
				JOptionPane.showMessageDialog(null, "Please provide all information");
			}
			else{
				f.setVisible(false);
				new Final(u);
			}
		}
	}

	public boolean validationCheck(String num, String pin){
		if (num.isEmpty() || pin.isEmpty()){
			return false;
		}
		return true;
	}
}