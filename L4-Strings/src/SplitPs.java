import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
    /*
    1. Get Input - Hopefully one with a P
    2. Isolate the p in the word
    3. Isolate the three letters After the p
    4. Output
     */


    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word that has a p and three letters after");
        JOptionPane.showMessageDialog(null, splitP(word));
        System.exit(0);
    }


public static String splitP(String word){

    int pIndex = word.indexOf('p');

    return word.substring(pIndex, pIndex+4);

    }

}
