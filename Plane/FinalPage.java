package Plane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class FinalPage extends CustomSizedBasePage {
    public FinalPage() {
        super("Final Page");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Thank you for booking!"));

        JLabel instructionLabel = new JLabel("<html><center>Instructions for Your Plane Journey:<br>"
                + "1. Arrive at the airport at least 2 hours before your departure time.<br>"
                + "2. Present your ID and ticket at the check-in counter.<br>"
                + "3. Proceed to the security checkpoint after check-in.<br>"
                + "4. Follow the boarding announcements for your flight.<br>"
                + "5. Enjoy your journey and have a safe flight!</center></html>");
        addComponent(instructionLabel, 50, 50, 800, 150);

        frame.setVisible(false);
    }

    public void showFinalPage() {
        frame.setVisible(true);
    }

}
