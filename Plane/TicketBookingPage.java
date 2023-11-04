package Plane;
import javax.swing.*;
import java.awt.event.*;

public class TicketBookingPage extends CustomSizedBasePage implements ActionListener {
    private JComboBox<String> fromComboBox;
    private JComboBox<String> toComboBox;
    private JComboBox<String> dateComboBox;
    private JComboBox<String> classComboBox;
    private JButton nextButton;

    public TicketBookingPage() {
        super("Ticket Booking");

        fromComboBox = new JComboBox<>(new String[]{"Dhaka", "Sylhet", "Chittagong", "Rajshahi"});
        toComboBox = new JComboBox<>(new String[]{"Nepal", "Thailand", "Japan", "Bhutan", "China", "India"});
        dateComboBox = new JComboBox<>(new String[]{"9 September", "10 September", "11 September"});
        classComboBox = new JComboBox<>(new String[]{"Economy", "Business", "First Class"});
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);

        addComponent(new JLabel("From:"), 50, 50, 100, 30);
        addComponent(fromComboBox, 160, 50, 200, 30);
        addComponent(new JLabel("To:"), 50, 100, 100, 30);
        addComponent(toComboBox, 160, 100, 200, 30);
        addComponent(new JLabel("Date:"), 50, 150, 100, 30);
        addComponent(dateComboBox, 160, 150, 200, 30);
        addComponent(new JLabel("Class:"), 50, 200, 100, 30);
        addComponent(classComboBox, 160, 200, 200, 30);
        addComponent(nextButton, 180, 250, 80, 30);

        frame.setVisible(false);
    }

    public String getSelectedFrom() {
        return (String) fromComboBox.getSelectedItem();
    }

    public String getSelectedTo() {
        return (String) toComboBox.getSelectedItem();
    }

    public String getSelectedDate() {
        return (String) dateComboBox.getSelectedItem();
    }

    public String getSelectedClass() {
        return (String) classComboBox.getSelectedItem();
    }

    public void addActionListenerToNextButton(ActionListener listener) {
        nextButton.addActionListener(listener);
    }

    public void setVisibility() {
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            frame.setVisible(false);
            PassengerInfoPage passengerInfoPage = new PassengerInfoPage();
            passengerInfoPage.show();
        }
    }
}
