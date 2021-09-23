import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {
        String name = "Dimitrius Demarcus Bartholomeu III Jr";
        String greeting = "Hello";

        int stringSize = name.length();

        //Style 1
        System.out.println(name + " has " + stringSize + " letters. ");

        //Style 2
        System.out.println(name + " has " + name.length() + " letters. ");

        System.out.println(greeting + " has " + greeting.length() + " letters.   ");

        //Create a program which capitalizes the first letter of a name

        //Attempt 1
        // 1. Get input
        // 2. Isolate the first letter
        // 3. Capitalize first letter
        // 4. Isolate the rest of the letters
        // 5. put 3 and 4 together
        // 6. display results

        System.out.println(capFirst(name));
    }

    public static String capFirst(String name) {

        String letter = name.substring(0, 1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);

    }

}
