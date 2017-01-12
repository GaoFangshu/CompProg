package pl.waw.sgh;

import javax.swing.*;

/**
 * Created by prubac on 09.11.2016.
 */
public class GUIInput {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
                null, "Please provide data: ");
        JOptionPane.showMessageDialog(
                null, "Got input: " + input);
        int confirmState =
                JOptionPane.showConfirmDialog(null,
                "Please confirm");
        JOptionPane.showMessageDialog(null,
                "Confirm state: " + confirmState);
        //JOptionPane.showOptionDialog(null, "select option");
    }
}
