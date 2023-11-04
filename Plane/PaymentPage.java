package Plane;
import javax.swing.*;
import java.awt.event.*;

public class PaymentPage extends CustomSizedBasePage implements ActionListener {
    private JTextField cardNumberField;
    private JTextField cardHolderField;
    private JTextField cvvField;
    private JButton payButton;

    public PaymentPage() {
        super("Payment");

        cardNumberField = new JTextField(20);
        cardHolderField = new JTextField(20);
        cvvField = new JTextField(5);
        payButton = new JButton("Pay");
        payButton.addActionListener(this);

        addComponent(new JLabel("Card Number:"), 50, 50, 100, 30);
        addComponent(cardNumberField, 160, 50, 200, 30);
        addComponent(new JLabel("Card Holder:"), 50, 100, 100, 30);
        addComponent(cardHolderField, 160, 100, 200, 30);
        addComponent(new JLabel("CVV:"), 50, 150, 100, 30);
        addComponent(cvvField, 160, 150, 50, 30);
        addComponent(payButton, 180, 200, 80, 30);

        frame.setVisible(false);
    }

    public String getCardNumber() {
        return cardNumberField.getText();
    }

    public String getCardHolder() {
        return cardHolderField.getText();
    }

    public String getCVV() {
        return cvvField.getText();
    }

    public void addActionListenerToPayButton(ActionListener listener) {
        payButton.addActionListener(listener);
    }

    public void showPaymentPage() {
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payButton) {
            // Perform payment processing here
            frame.setVisible(false);

            FinalPage finalPage = new FinalPage();
            finalPage.showFinalPage();
        }
    }
}
