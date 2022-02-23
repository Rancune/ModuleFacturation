package com.myfacturation;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        FormulaireFacture facture = new FormulaireFacture();

        JFrame frame = new JFrame("Formulaire de facture");
        frame.setContentPane(new FormulaireFacture().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }
}
