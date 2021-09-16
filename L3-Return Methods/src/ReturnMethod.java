import javax.swing.*;
import java.awt.*;

public class ReturnMethod {


    public static void main(String[] args) {

        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));

        JOptionPane.showMessageDialog(null, "The area is " + area(length,width) + "\nThe perimeter is " + perimeter(length,width));

        System.exit(0);
    }

    public static double area(double length, double width){

        return length * width;

    }

    public static double perimeter(double length, double width){

        return 2 * (length + width);
    }


}
