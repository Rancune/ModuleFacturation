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
    private JButton envoyer;
    private JLabel prénomLabel;
    private JTextField textField1;
    private JLabel Quantité;
    private JTextField textField2;
    private ArrayList<Presta> listepresta = new ArrayList<Presta>();


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
                    facture.generationPdf(client, listepresta);
                } catch (DocumentException ex) {
                    ex.printStackTrace();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

            }


        });


        // private void createUIComponents() {
        // TODO: place custom component creation code here


//    private void $$$setupUI$$$() {
//        createUIComponents();
//    }
    }
}
