import javax.swing.*;
import java.awt.*;

public class SimpleDrawingGUI {

    JFrame frame;

    public SimpleDrawingGUI(){
        frame = new JFrame("Simple Drawing");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME


        frame.setVisible(true);
    }

    private class DrawingPanel extends JPanel{

        //Constructor for the class
        public DrawingPanel(){
            //set the Background color

        }


    }
}
