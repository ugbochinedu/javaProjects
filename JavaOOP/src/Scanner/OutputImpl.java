package Scanner;

import javax.swing.*;

public class OutputImpl implements Output{
    @Override
    public void display(String message) {
        JOptionPane.showInputDialog(message);
        //System.out.println(message);
    }
}
