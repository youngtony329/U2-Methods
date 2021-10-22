import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static javafx.scene.input.KeyCode.J;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    /*
    1. Create GUI
    2. Get Input, when a button is clicked
    3. The Math - 3.28 Feet in a meter
                    F-> DIVIDE BY 3.28
                    M-> MULTIPLY BY 3.28
    4. DISPLAY RESULTS
     */
}



    public static void main(String[] args) {
        JFrame window = new JFrame("This is A Simple Window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click to convert Feet to meters");
        JButton button2 = new JButton("Click to convert Meters to Feet");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        window.setLocationRelativeTo(null);

        panel.add(button);
        panel.add(button2);
        window.add(panel);

        window.setVisible(true);
    }

    private static class FeetToMeterslistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the feet:"));

            double result = number / 3.28;

            JOptionPane.showMessageDialog(null, result + "in meters.");
        }
    }

    private static class MeterToFeetlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the meters:"));

            double result = number * 3.28;

            JOptionPane.showMessageDialog(null, result + "in feet.");
        }
    }
}