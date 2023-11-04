package LogIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateAccount implements ActionListener {
    private JFrame frame;

    private JButton createAccountButton = new JButton("Create Account");
    private JButton logInButton = new JButton("Log In");

    JLabel firstNameLabel = new JLabel("First Name:");
    JTextField firstNameField = new JTextField(20);

    JLabel lastNameLabel = new JLabel("Last Name:");
    JTextField lastNameField = new JTextField(20);

    JLabel birthDateLabel = new JLabel("Birth Date:");
    JTextField birthDateField = new JTextField(20);

    JLabel mobileNumberLabel = new JLabel("Mobile Number:");
    JTextField mobileNumberField = new JTextField(20);

    JLabel emailLabel = new JLabel("Email:");
    JTextField emailField = new JTextField(20);

    JLabel nidLabel = new JLabel("NID Number:");
    JTextField nidField = new JTextField(20);

    JLabel passwordLabel = new JLabel("Password:");
    JPasswordField passwordField = new JPasswordField(20);

    JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
    JPasswordField confirmPasswordField = new JPasswordField(20);

    public CreateAccount() {

        frame = new JFrame("Create Account");
        frame.setSize(900, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Set bounds for each component
        firstNameLabel.setBounds(500, 90, 100, 30);
        firstNameField.setBounds(630, 90, 200, 30);

        lastNameLabel.setBounds(500, 125, 100, 30);
        lastNameField.setBounds(630, 125, 200, 30);

        birthDateLabel.setBounds(500, 160, 100, 30);
        birthDateField.setBounds(630, 160, 200, 30);

        mobileNumberLabel.setBounds(500, 195, 100, 30);
        mobileNumberField.setBounds(630, 195, 200, 30);

        emailLabel.setBounds(500, 230, 100, 30);
        emailField.setBounds(630, 230, 200, 30);

        nidLabel.setBounds(500, 265, 100, 30);
        nidField.setBounds(630, 265, 200, 30);

        passwordLabel.setBounds(500, 300, 100, 30);
        passwordField.setBounds(630, 300, 200, 30);

        confirmPasswordLabel.setBounds(500, 330, 130, 30);
        confirmPasswordField.setBounds(630, 330, 200, 30);

        createAccountButton.setBounds(498, 370, 150, 40);
        logInButton.setBounds(650, 370, 150, 40);

        // Add components to the frame
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(birthDateLabel);
        frame.add(birthDateField);
        frame.add(mobileNumberLabel);
        frame.add(mobileNumberField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(nidLabel);
        frame.add(nidField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(createAccountButton);
        frame.add(logInButton);

        frame.setVisible(true);

        logInButton.addActionListener(this);
        createAccountButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == logInButton) {
            FirstPage firstPage = new FirstPage();
            frame.setVisible(false);
        }
        if (e.getSource() == createAccountButton) {

            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String birthDate = birthDateField.getText();
            String mobileNumber = mobileNumberField.getText();
            String email = emailField.getText();
            String nidNumber = nidField.getText();
            String password = new String(passwordField.getPassword());

            if (isValidEmail(email)) {
                String userFileName = "users.txt";
                boolean registrationSuccessful = UserInformation.registerUser(firstName, lastName, birthDate,
                        mobileNumber,
                        email, nidNumber, password, userFileName);

                if (registrationSuccessful) {
                    JOptionPane.showMessageDialog(null, "Registration successful.");
                    FirstPage firstPage = new FirstPage();
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. User already exists.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid email. Please Provide a Valid Email");
            }

        }
    }

    public static boolean isValidEmail(String email) {
        // Regular expression for basic email validation
        String regex = "^[A-Za-z0-9+_.-]+@.*\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
