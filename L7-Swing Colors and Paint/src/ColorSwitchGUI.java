import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window = new JFrame("Color Switcher");
    JPanel panel = new JPanel();
    JButton colorThemeDark = new JButton("Theme: Dark");
    JButton colorThemeWarren = new JButton("Theme: Warren");
    JButton colorThemePrimary = new JButton("Theme: Primary");

    public ColorSwitchGUI(){
        //create your GUI

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setLocationRelativeTo(null);

        colorThemeDark.addActionListener(new ThemeDark());
        colorThemeWarren.addActionListener(new ThemeWarren());
        colorThemePrimary.addActionListener(new ThemePrimary());


        panel.add(colorThemeDark);
        panel.add(colorThemeWarren);
        panel.add(colorThemePrimary);

        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeDark implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color darkPanel = new Color(25,26,25);
            Color darkButton = new Color(30,81,40);
            Color darkText = new Color(216,233,168);

            colorThemeDark.setBackground(darkButton);
            colorThemeDark.setForeground(darkText);
            panel.setBackground(darkPanel);


        }


    }
    private class ThemeWarren implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color warrenPanel = new Color(0,0,0);
            Color warrenButton = new Color(240,165,0);
            Color warrenText = new Color(244,244,244);

            colorThemeWarren.setBackground(warrenButton);
            colorThemeWarren.setForeground(warrenText);
            panel.setBackground(warrenPanel);


        }


    }
    private class ThemePrimary implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            colorThemeDark.setBackground(Color.BLUE);
            colorThemeDark.setForeground(Color.YELLOW);
            panel.setBackground(Color.RED);


        }


    }
}
