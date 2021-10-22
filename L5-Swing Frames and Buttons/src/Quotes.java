import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {

        JFrame window = new JFrame("These are my favorite quotes");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click for 1st quote");
        JButton button2 = new JButton("Click for 2nd quote");
        JButton button3 = new JButton("Click fpr 3rd quote");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        window.add(panel);
        window.setVisible(true);

    }

    private static class button1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "\"Don't worry about what other people think. Hold your head up high\n- Deku");
        }

        private static class button2 implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "\"People's lives don't end when they die when they die. It ends wehn they lose faith.\"\n-");
            }

            private static class button3 implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "\"If you don't take risks you can't create a future.\"\n-");
                }
            }
        }
    }
}