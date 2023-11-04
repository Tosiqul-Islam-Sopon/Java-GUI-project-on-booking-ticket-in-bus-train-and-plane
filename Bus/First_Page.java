package Bus;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class First_Page implements ActionListener {

	static User u = new User("sopon","1234");

    JLabel label1, label2,label3, label5;
    ImageIcon i1;
	JButton  loginButton,signUpButton, adminLogiButton,exitButton;
	JPanel p;
	JFrame f;

    public First_Page(){
        Font f1 = new Font("Serif", Font.BOLD,20);
		
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Firstpage");
		f.setSize(900, 600);
		f.setLocationRelativeTo(null);
		f.setResizable(true);

        i1 = new ImageIcon("Bus.jpg");
		f.setIconImage(i1.getImage());

        signUpButton = new JButton("SIGN UP");
		signUpButton.setFocusable(false);
		signUpButton.setBounds(50, 360, 110, 25);
		signUpButton.setBackground(Color.WHITE);
		signUpButton.addActionListener(this);

		loginButton = new JButton("LOG IN");
		loginButton.setFocusable(false);
		loginButton.setBounds(180, 360, 110, 25);
		loginButton.setBackground(Color.WHITE);
		loginButton.addActionListener(this);

		adminLogiButton = new JButton("Admin Login");
		adminLogiButton.setFocusable(false);
		adminLogiButton.setBackground(Color.WHITE);
		adminLogiButton.setBounds(700, 12, 110, 25);
		adminLogiButton.addActionListener(this);
		
		exitButton = new JButton("exit");
		exitButton.setFocusable(false);
		exitButton.setBackground(Color.WHITE);
		exitButton.setBounds(20, 12, 110, 25);
		exitButton.addActionListener(this);

        p = new JPanel(); 

        label2 = new JLabel();
		label2.setText("WANT TO BOOK A BUS?");
		label2.setBounds(50, 170, 300, 30);
		label2.setForeground(Color.WHITE);
		label2.setFont(f1);
		p.add(label2);
		
		label3 = new JLabel();
		label3.setText("Login to book a bus");
		label3.setBounds(90, 270, 300, 30);
		label3.setForeground(Color.WHITE);
		label3.setFont(f1);
		p.add(label3);


		label5 = new JLabel();
		label5.setText("");
		label5.setBounds(430, 325, 500, 50);

		p.setLayout(null);
		p.setBackground(new Color(0,0,0,60));
		p.setBounds(300, 80, 350, 400);

		f.add(p);
		p.add(loginButton);
		p.add(signUpButton);
		f.add(adminLogiButton);
		f.add(exitButton);
		// p.add(label2);
		p.add(label3);
		p.add(label5);


		ImageIcon background_image = new ImageIcon("Resorces/Bus.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		f.add(background);

		f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton){
			new Login(u);
			f.setVisible(false);
		}
		else if (e.getSource() == signUpButton){
			new Register(u);
			f.setVisible(false);
		}
		else if (e.getSource() == adminLogiButton){
			new Admin_Login();
			f.setVisible(false);
		}
		else if (e.getSource() == exitButton){
			System.exit(0);
		}
    }
    
}
