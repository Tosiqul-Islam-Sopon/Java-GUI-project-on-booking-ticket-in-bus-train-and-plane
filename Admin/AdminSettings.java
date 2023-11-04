package Admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminSettings implements ActionListener{
    private JFrame adminFrame;
    private JButton addTrainButton;

    public AdminSettings() {
        adminFrame = new JFrame("Admin Settings");
        addTrainButton = new JButton("Add Train");

        adminFrame.setLayout(new FlowLayout());
        adminFrame.add(addTrainButton);

        adminFrame.setSize(900, 650); 
        adminFrame.setVisible(true);
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addTrainButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addTrainButton){
            AddTrain addTrain=new AddTrain();
        }
    }

 
}
