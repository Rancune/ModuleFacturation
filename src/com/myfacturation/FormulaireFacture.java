package com.myfacturation;

import com.itextpdf.text.DocumentException;
import com.myfacturation.client.Client;
import com.myfacturation.facture.Facture;
import com.myfacturation.presta.Presta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FormulaireFacture {

    JPanel panel1;
    private JTextArea descriptionService;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField adress;
    private JCheckBox checkBox1;
    private JButton envoyer;
    private ArrayList<Presta> liste = new ArrayList<Presta>();


    public FormulaireFacture() {


        envoyer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //récupération des infos client
                Client client = new Client();
                client.setFirstName(firstName.getText());
                client.setLastName(lastName.getText());
                client.setAdress(adress.getText());
                client.checkCreation();


                //récupération des infos presta
                Presta prestation = new Presta();
                prestation.setPresta(descriptionService.getText());
               // prestation.setQuantité();
               // prestation.setTarif();
               // prestation.addToliste(prestation);


                prestation.checkCreation();



                //création du pdf avec les infos client et presta
                Facture facture = new Facture();
                try {
                    facture.generationPdf(client);
                } catch (DocumentException ex) {
                    ex.printStackTrace();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

            }



        });




    }

   // private void createUIComponents() {
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

//    private void $$$setupUI$$$() {
//        createUIComponents();
//    }
//}
