package com.myfacturation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormulaireFacture {
    private JPanel panel1;
    private JTextArea descriptionService;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField textField3;
    private JCheckBox checkBox1;
    private JButton button1;

    public FormulaireFacture() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here




/*        //For the radio buttons 1 and 2, option Custom Create is set to true.
        //You write custom constructors for these components
        //in the method createUIComponents()
        private JRadioButton radioButton1;
        private JRadioButton radioButton2;
//For the radio button 3 the default constructor is generated automatically
        //in the method $$$setupUI$$$(). The component properties
        //specified in the GUI Designer
        //are generated as calls to the set* methods in $$$setupUI$$$().

        private JRadioButton radioButton3;

        private void createUIComponents() {
            radioButton1 = new JRadioButton("Custom text 1");
            radioButton2 = new JRadioButton("Custom text 2");
        }

        private void $$$setupUI$$$() {
            createUIComponents();

            radioButton3 = new JRadioButton();
            radioButton3.setText("RadioButton");

        }*/




    }
}
