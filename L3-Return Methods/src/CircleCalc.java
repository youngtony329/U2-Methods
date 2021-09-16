import javax.swing.*;
import java.text.DecimalFormat;


public class CircleCalc {


    public static void main(String[] args) {

        //create and run the program
        double radius = getInput("Please enter the radius");

        double area = area(radius);

        double circumference = circumference(radius);

        JOptionPane.showMessageDialog(null, displayResults(area, circumference));


    }
    public static double getInput(String message){

        return Double .parseDouble(JOptionPane.showInputDialog(message));
    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){

        return Math.PI * Math.pow(radius, 2);


    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius){

        return 2 * Math.PI * radius;
    }

    public static String displayResults(double area, double perimeter){

        DecimalFormat round = new DecimalFormat("#.##");
        String message = "The area is: " + round.format(area);
        message += "\nThe circumference is: " + round.format(perimeter);

        return message;
    }
}
