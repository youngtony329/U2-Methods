import javax.swing.*;
import java.text.DecimalFormat;


public class CircleCalc {


    public static void main(String[] args) {


        //call the area method
        area();
        //call the circumference method
        circumference();
    }

    //write a method to calculate a circle's area
    public static void area() {
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));

        double area = Math.PI * Math.pow(radius, 2);

        JOptionPane.showMessageDialog(null, "The area is " + round.format(area));


    }

    //write a method to calculate a circle's circumference
    public static void circumference() {
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));

        double circumference = 2 * Math.PI * radius;

        JOptionPane.showMessageDialog(null, "The circumference is " + round.format(circumference));
    }
}