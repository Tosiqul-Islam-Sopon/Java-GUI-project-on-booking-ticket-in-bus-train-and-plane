package Admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AddTrain {
    private JFrame addTrainFrame;
    private JComboBox<String> trainNameComboBox;
    private JComboBox<String> dateComboBox;
    private JButton addButton;

    private String[] trainNames = {"Upokul Express", "Parabat Express", "Joyentika Express", "Subarna Express" , "Mahanagar Express"};
    private String[] dates = {"10/08/2023", "11/08/2023", "12/08/2023", "13/08/2023", "14/08/2023", "15/08/2023"};

    public AddTrain() {
        addTrainFrame = new JFrame("Add Train");
        addTrainFrame.getContentPane().setBackground(Color.lightGray); 

        JLabel selectTrainLabel = new JLabel("Select Train");
        selectTrainLabel.setFont(new Font("Arial", Font.BOLD, 24));
        selectTrainLabel.setBounds(380, 150, 200, 40);

        trainNameComboBox = new JComboBox<>(trainNames);
        dateComboBox = new JComboBox<>(dates);
        addButton = new JButton("Add");

        trainNameComboBox.setBounds(375, 225, 150, 30);
        dateComboBox.setBounds(375, 225 + 40, 150, 30);
        addButton.setBounds(375, 225 + 80, 80, 30);

        addTrainFrame.add(selectTrainLabel);
        addTrainFrame.add(trainNameComboBox);
        addTrainFrame.add(dateComboBox);
        addTrainFrame.add(addButton);

        addButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String selectedTrain = (String) trainNameComboBox.getSelectedItem();
                String selectedDate = (String) dateComboBox.getSelectedItem();
                saveTrainInfo(selectedTrain, selectedDate);
            }
        });

        addTrainFrame.setLayout(null);
        addTrainFrame.setSize(900, 650);
        addTrainFrame.setVisible(true);
        addTrainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void saveTrainInfo(String trainName, String date) {
        try {
            FileWriter writer = new FileWriter("TrainInfo.txt", true); // Append mode
            writer.write("Train Name: " + trainName + "\tDate: " + date + "\n");
            writer.close();
            JOptionPane.showMessageDialog(addTrainFrame, "Train information added to TrainInfo.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(addTrainFrame, "An error occurred while writing train information.");
        }
    }


}
