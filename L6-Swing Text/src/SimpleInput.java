import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickCount = 0;
    static JLabel clickCountLabel;


    public static void main(String[] args){
        JFrame window = new JFrame("Clicker Explosion!");
        JPanel panel = new JPanel();
        clickCountLabel = new JLabel("Click Count: ");
        JButton button = new JButton("CLICK FOR EXPLOSION!");

        window.setSize(250, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(clickCountLabel);
        panel.add(button);

        window.add(panel);

        window.setVisible(true);

    }

    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            clickCount++;

            clickCountLabel.setText(("I CHANGED IT " + clickCount + "NUMBER OF TIMES!!!"));
        }
    }

}
