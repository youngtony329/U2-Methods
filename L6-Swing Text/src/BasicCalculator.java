import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

       static JTextField inputField1, inputField2;
       static JLabel resultLabel;

    public static void main(String[] args){

        JFrame window = new JFrame("Simple Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a number: ");
        JLabel inputLabel2 = new JLabel("Enter a number: ");
         inputField1 = new JTextField(10);
         inputField2 = new JTextField(10);

        JButton addBut = new JButton("Add");
        JButton subtractBut = new JButton("Subtract");
        JButton multBut = new JButton("Multiply");
        JButton divBut = new JButton("Divide");

         resultLabel = new JLabel("0.00");

        window.setSize(200,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        addBut.addActionListener(new addListener());
        subtractBut.addActionListener(new addListener() );


        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);

        panel.add(resultLabel);

        panel.add(subtractBut);
        panel.add(addBut);
        panel.add(multBut);
        panel.add(divBut);

        window.add(panel);
        window.setVisible(true);


    }

    private static class addListener implements ActionListener{

        /*

            1. Get Inputs - from the Text Fields
            2. add the numbers
            3. output to the result ayble

         */


        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(number1 + number2));
        }
    }
    public void actionPerformed(ActionEvent actionEvent){

        double number1 = Double.parseDouble(inputField1.getText());
        double number2 = Double.parseDouble(inputField2.getText());

        resultLabel.setText(String.valueOf(number1 - number2));
    }
    public void actionPerformed(ActionEvent actionEvent){

        double number1 = Double.parseDouble(inputField1.getText());
        double number2 = Double.parseDouble(inputField2.getText());

        resultLabel.setText(String.valueOf(number1 * number2));
    }
    public void actionPerformed(ActionEvent actionEvent){

        double number1 = Double.parseDouble(inputField1.getText());
        double number2 = Double.parseDouble(inputField2.getText());

        resultLabel.setText(String.valueOf(number1 / number2));
    }
}
