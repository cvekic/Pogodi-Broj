package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Mladjan on 19.3.2014.
 */
public class Grafika {

    public JPanel panel1;
    private JButton pokusajButton;
    private JTextField unesiteBrojTextField;
    private JTextField numberOfShotsTextField;
    private JTextField descriptionTextField;
    private JTextField bingoTextField;
    private int strike = 5;
    private int getInput = 0;
    private int gooalNumber;
    Random random = new Random();

    public Grafika() {
        gooalNumber = random.nextInt(10);
        pokusajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput = getNumberFromInput();
                if (getInput != 0){
                    checkingTheNumberFromInputWithNumberFromGenerating();
                }
            }
        });

    }
    private void checkingTheNumberFromInputWithNumberFromGenerating() {
        if(strike > 0) {
            strike = Integer.parseInt(numberOfShotsTextField.getText());
            strike--;
            numberOfShotsTextField.setText(String.valueOf(strike));
            if (getInput == gooalNumber) {
                JOptionPane.showMessageDialog(null, "You WIN!!!");
                System.exit(0);
            }
            if (getInput < gooalNumber) {
                descriptionTextField.setText("Number is biger than yours!");
            }
            if (getInput > gooalNumber) {
                descriptionTextField.setText("Number is smaller than yours!");
            }
        }
        if (strike == 0) {
            bingoTextField.setText(String.valueOf(gooalNumber));
            JOptionPane.showMessageDialog(null, "GAME IS OVER, Computer is the winer");
            System.exit(0);
        }
    }

    private int getNumberFromInput() {
        int getInput = 0;
        boolean valid = false;
        while(!valid){
            try{
                getInput = Integer.parseInt(unesiteBrojTextField.getText());
                if(getInput>=0){
                    valid = true;
                }
            }catch (NumberFormatException q){
                JOptionPane.showMessageDialog(null, "Error, not a number. Please try again.");
                break;
            }
        }
        return getInput;
    }
}
