package Bus;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.AbstractDocument;

public class User_Dtails implements ActionListener
{	
	static User u;
	
	JFrame f;
	
	JLabel header,nameLabel,numberLabel,ageLabel,emailLabel,genderLabel;
	JTextField nameText,numberText,ageText,emailText;
	JComboBox genderBox;
	
	JButton nextBtn,previousBtn;
	
	User_Dtails(User a)
	{
	    u = a;
		Font font = new Font("Serif", Font.BOLD,22);
		
		f = new JFrame();
		
		header = new JLabel();
        header.setText("Complete Your Information");
        header.setBounds(350, 20, 300, 50);
		header.setFont(font);
		header.setForeground(Color.RED);
        f.add(header);

        nameLabel = new JLabel("Your Full Name");
        nameLabel.setBounds(230, 180, 120, 50);
		nameLabel.setForeground(Color.BLACK);
        f.add(nameLabel);

		nameText = new JTextField();
        nameText.setBounds(370, 190, 235, 30);
		nameText.setHorizontalAlignment(JTextField.CENTER);
		((AbstractDocument) nameText.getDocument()).setDocumentFilter(new NoNumbersFilter());
        f.add(nameText);
		
		numberLabel = new JLabel("Your Phone Number");
        numberLabel.setBounds(230, 220, 120, 50);
		numberLabel.setForeground(Color.BLACK);
        f.add(numberLabel);

		numberText = new JTextField();
        numberText.setBounds(370, 230, 235, 30);
        numberText.setHorizontalAlignment(JTextField.CENTER);
		((AbstractDocument) numberText.getDocument()).setDocumentFilter(new NumberFilter());
        f.add(numberText);

		emailLabel = new JLabel("Email");
        emailLabel.setBounds(230, 250, 120, 50);
		emailLabel.setForeground(Color.BLACK);
        f.add(emailLabel);

		emailText = new JTextField();
        emailText.setBounds(370, 270, 235, 30);
        emailText.setHorizontalAlignment(JTextField.CENTER);
        f.add(emailText); 
		
		String[] str = {"Male", "Female", "Spado"};
		genderBox = new JComboBox(str);
		genderBox.setBounds(300, 320, 120, 30);
		genderBox.setBackground(Color.WHITE);
		f.add(genderBox);

		genderLabel = new JLabel("Gender");
		genderLabel.setBounds(230, 310, 120, 50);
		genderLabel.setForeground(Color.BLACK);
		f.add(genderLabel);
		
		ageLabel = new JLabel("AGE");
        ageLabel.setBounds(480, 310, 120, 50);
		ageLabel.setForeground(Color.BLACK);
        f.add(ageLabel);

		ageText = new JTextField();
        ageText.setBounds(525, 320, 80, 30);
        ageText.setHorizontalAlignment(JTextField.CENTER);
		((AbstractDocument) ageText.getDocument()).setDocumentFilter(new NumberFilter());
        f.add(ageText);

		nextBtn = new JButton("Next");  
        nextBtn.setBounds(500,400,77,25);
        nextBtn.setBackground(Color.BLUE);	
		nextBtn.setForeground(Color.WHITE);	
        nextBtn.addActionListener(this);
		f.add(nextBtn);
		
		previousBtn = new JButton("Previous");  
        previousBtn.setBounds(350,400,110,25);
        previousBtn.setBackground(Color.BLUE);		
		previousBtn.setForeground(Color.WHITE);
        previousBtn.addActionListener(this);
		f.add(previousBtn);
				
		f.setSize(900,600);
		f.setTitle("User Dtails");
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
		{f.setVisible(false);
			new Ticket_Dtails(u);
			
		}
		if(e.getSource()==nextBtn)
		{

			String name,number,email,age;
			name = nameText.getText();
			number = numberText.getText();
			email = emailText.getText();
			age = ageText.getText();
			if (validationCheck(name, number, email, age)==false){
				JOptionPane.showMessageDialog(null, "Please provide all information");
			}
			else if (isValidEmail(email) == false){
				JOptionPane.showMessageDialog(null, "Invalid email. Please Provide an Valid Email");
			}
			else{
				f.setVisible(false);
				new Payment_Dtails(u);
			}
			
		}
	}

	public boolean validationCheck(String name,String num, String email, String age){
		if (name.isEmpty() || num.isEmpty() || email.isEmpty() || age.isEmpty()){
			return false;
		}
		return true;
	}

	public boolean isValidEmail(String email) {
        // Regular expression for basic email validation
        String regex = "^[A-Za-z0-9+_.-]+@.*\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}