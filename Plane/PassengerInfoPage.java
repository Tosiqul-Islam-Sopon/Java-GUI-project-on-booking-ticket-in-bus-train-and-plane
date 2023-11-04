package Plane;
import javax.swing.*;
import java.awt.event.*;

public class PassengerInfoPage extends CustomSizedBasePage implements ActionListener {
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField emailField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton nextButton;

    public PassengerInfoPage() {
        super("Passenger Information");

        nameField = new JTextField(20);
        phoneField = new JTextField(20);
        emailField = new JTextField(20);
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);

        addComponent(new JLabel("Name:"), 50, 50, 100, 30);
        addComponent(nameField, 160, 50, 200, 30);
        addComponent(new JLabel("Phone:"), 50, 100, 100, 30);
        addComponent(phoneField, 160, 100, 200, 30);
        addComponent(new JLabel("Email:"), 50, 150, 100, 30);
        addComponent(emailField, 160, 150, 200, 30);
        addComponent(new JLabel("Gender:"), 50, 200, 100, 30);
        addComponent(maleRadioButton, 160, 200, 100, 30);
        addComponent(femaleRadioButton, 260, 200, 100, 30);
        addComponent(nextButton, 180, 250, 80, 30);

        frame.setVisible(false);
    }

    public String getName() {
        return nameField.getText();
    }

    public String getPhone() {
        return phoneField.getText();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public boolean isMaleSelected() {
        return maleRadioButton.isSelected();
    }

    public boolean isFemaleSelected() {
        return femaleRadioButton.isSelected();
    }

    public void addActionListenerToNextButton(ActionListener listener) {
        nextButton.addActionListener(listener);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            
            // Validate phone number format
            if (!isValidPhoneNumber(phone)) {
                JOptionPane.showMessageDialog(frame, "Invalid phone number format. Please enter a valid phone number.");
                return;
            }
            
            // Validate email format
            if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(frame, "Invalid email format. Please enter a valid email address.");
                return;
            }

            PaymentPage paymentPage = new PaymentPage();
            paymentPage.showPaymentPage();
            frame.setVisible(false);
        }
    }
    private boolean isValidPhoneNumber(String phoneNumber) {
        // Check if the phone number is exactly 11 digits and consists only of digits
        return phoneNumber.length() == 11 && phoneNumber.chars().allMatch(Character::isDigit);
    }

    private boolean isValidEmail(String email) {
        // Very basic email format check (contains "@" and ".")
        return email.contains("@") && email.contains(".");
    }
}
